package co.minphone.personal.core

import android.support.v7.widget.RecyclerView.ViewHolder
import android.view.View

/**
 * Created by Min Phone on 7/26/18.
 */

abstract class BaseViewHolder<in M>(
  itemView: View,
  private val itemClickListener: ((View, Int) -> (Unit))? = null
) : ViewHolder(itemView) {

  init {
    itemView.setOnClickListener {
      itemClickListener?.invoke(it, adapterPosition)
    }
  }

  abstract fun bind(model: M)

}