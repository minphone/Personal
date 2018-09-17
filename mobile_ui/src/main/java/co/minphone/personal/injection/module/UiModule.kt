package co.minphone.personal.injection.module

import co.minphone.domain.executor.PostExecutionThread
import co.minphone.personal.UiThread
import co.minphone.personal.features.HomeActivity
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Min Phone on 7/26/18.
 */

@Module
abstract class UiModule {
  @Binds abstract fun bindPostExecutionThread(uiThread: UiThread): PostExecutionThread

  @ContributesAndroidInjector abstract fun contributesHomeActivity(): HomeActivity

}
