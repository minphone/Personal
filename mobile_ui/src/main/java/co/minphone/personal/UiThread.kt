package co.minphone.personal

import co.minphone.domain.executor.PostExecutionThread
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import javax.inject.Inject

/**
 * Created by Min Phone on 7/26/18.
 */

class UiThread @Inject constructor() : PostExecutionThread {
  override val scheduler: Scheduler
    get() = AndroidSchedulers.mainThread()

}