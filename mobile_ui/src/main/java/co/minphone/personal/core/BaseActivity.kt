package co.minphone.personal.core

import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.v7.app.AppCompatActivity
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import dagger.android.AndroidInjection

/**
 * Created by Min Phone on 7/26/18.
 */

abstract class BaseActivity : AppCompatActivity() {

  @get:LayoutRes abstract val layoutResId: Int

  override fun onCreate(savedInstanceState: Bundle?) {
    AndroidInjection.inject(this)
    super.onCreate(savedInstanceState)
    setContentView(layoutResId)
  }
}