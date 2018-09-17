package co.minphone.domain.executor

import io.reactivex.Scheduler

/**
 * Created by Min Phone on 7/26/18.
 */

interface PostExecutionThread {
  val scheduler: Scheduler
}