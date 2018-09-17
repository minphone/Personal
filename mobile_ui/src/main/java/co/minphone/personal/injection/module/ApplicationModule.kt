package co.minphone.personal.injection.module

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module

/**
 * Created by Min Phone on 7/26/18.
 */

@Module
abstract class ApplicationModule {
  @Binds abstract fun bindContext(application: Application): Context
}