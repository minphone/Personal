package co.minphone.personal.core

import android.arch.lifecycle.Lifecycle.Event
import android.arch.lifecycle.LifecycleRegistry
import android.content.Context
import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import dagger.android.support.AndroidSupportInjection

/**
 * Created by Min Phone on 7/26/18.
 */

abstract class BaseFragment : Fragment() {

  protected lateinit var viewLifecycleOwner: ViewLifeCycleOwner

  @get:LayoutRes protected abstract val layoutId: Int

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
  ): View? {
    viewLifecycleOwner = ViewLifeCycleOwner()
    return inflater.inflate(layoutId, container, false)
  }

  override fun onAttach(context: Context?) {
    super.onAttach(context)
    AndroidSupportInjection.inject(this)
  }

  override fun onViewCreated(view: android.view.View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    (viewLifecycleOwner.getLifecycle() as LifecycleRegistry).handleLifecycleEvent(Event.ON_CREATE)
  }

  override fun onStart() {
    super.onStart()
    (viewLifecycleOwner.getLifecycle() as LifecycleRegistry).handleLifecycleEvent(Event.ON_START)
  }

  override fun onResume() {
    super.onResume()
    (viewLifecycleOwner.getLifecycle() as LifecycleRegistry).handleLifecycleEvent(Event.ON_RESUME)
  }

  override fun onPause() {
    (viewLifecycleOwner.getLifecycle() as LifecycleRegistry).handleLifecycleEvent(Event.ON_PAUSE)
    super.onPause()
  }

  override fun onStop() {
    (viewLifecycleOwner.getLifecycle() as LifecycleRegistry).handleLifecycleEvent(Event.ON_STOP)
    super.onStop()
  }

  override fun onDestroyView() {
    (viewLifecycleOwner.getLifecycle() as LifecycleRegistry).handleLifecycleEvent(Event.ON_DESTROY)
    super.onDestroyView()
  }
}