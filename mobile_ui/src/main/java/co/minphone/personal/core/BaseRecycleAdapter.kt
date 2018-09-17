package co.minphone.personal.core

import android.support.v7.recyclerview.extensions.ListAdapter
import android.support.v7.util.DiffUtil
import android.view.View
import android.view.ViewGroup

/**
 * Created by Min Phone on 7/26/18.
 */

abstract class BaseRecycleAdapter<M, VH : BaseViewHolder<M>>(config: DiffUtil.ItemCallback<M>) :
  ListAdapter<M, VH>(config) {

  var itemClickListener: ((View, Int) -> (Unit))? = null

  abstract override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH

  override fun onBindViewHolder(holder: VH, position: Int) {
    holder.bind(getItem(position))
  }

  fun getItemAtPosition(position: Int): M {
    return getItem(position)
  }

}