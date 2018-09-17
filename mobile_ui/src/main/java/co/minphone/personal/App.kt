package co.minphone.personal

import android.app.Activity
import android.app.Application
import android.support.v4.app.Fragment
import co.minphone.personal.injection.DaggerApplicationComponent
import com.facebook.stetho.Stetho
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.support.HasSupportFragmentInjector
import timber.log.Timber
import javax.inject.Inject

/**
 * Created by Min Phone on 9/17/18.
 */
class App : Application(), HasActivityInjector, HasSupportFragmentInjector {

  @Inject lateinit var activityInjector: DispatchingAndroidInjector<Activity>
  @Inject lateinit var fragmentInjector: DispatchingAndroidInjector<Fragment>

  override fun activityInjector(): AndroidInjector<Activity> {
    return activityInjector
  }

  override fun supportFragmentInjector(): AndroidInjector<Fragment> {
    return fragmentInjector
  }

  override fun onCreate() {
    super.onCreate()
    DaggerApplicationComponent.builder().application(this).build().inject(this)
    Stetho.initializeWithDefaults(this)
    if (BuildConfig.DEBUG) {
      setupTimber()
    }
  }

  private fun setupTimber() {
    Timber.plant(Timber.DebugTree())
  }
}