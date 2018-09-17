package co.minphone.personal.core

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleOwner
import android.arch.lifecycle.LifecycleRegistry

/**
 * Created by Min Phone on 8/1/18.
 */
class ViewLifeCycleOwner : LifecycleOwner {

  val lifecycle = LifecycleRegistry(this)

  override fun getLifecycle(): Lifecycle {
    return lifecycle
  }
}