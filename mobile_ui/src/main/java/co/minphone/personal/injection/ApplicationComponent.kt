package co.minphone.personal.injection

import android.app.Application
import co.minphone.personal.App
import co.minphone.personal.injection.module.ApplicationModule
import co.minphone.personal.injection.module.CacheModule
import co.minphone.personal.injection.module.DataModule
import co.minphone.personal.injection.module.PresentationModule
import co.minphone.personal.injection.module.RemoteModule
import co.minphone.personal.injection.module.UiModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by Min Phone on 9/17/18.
 */
@Singleton
@Component(
  modules = [AndroidInjectionModule::class, AndroidSupportInjectionModule::class,
    ApplicationModule::class, CacheModule::class, DataModule::class, PresentationModule::class,
    RemoteModule::class, UiModule::class]
)
interface ApplicationComponent {
  @Component.Builder
  interface Builder {
    @BindsInstance
    fun application(application: Application): Builder

    fun build(): ApplicationComponent
  }

  fun inject(app: App)
}