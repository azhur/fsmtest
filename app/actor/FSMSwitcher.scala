package actor

import akka.actor.{Actor, LoggingFSM}
import scala.concurrent.{ExecutionContext, Future}
import akka.pattern._
import ExecutionContext.Implicits.global

trait FSMSwitcher {this: Actor with LoggingFSM[State, Data] =>
  startWith(StateA, NoData)

  when(StateA) {
    case Event(str: String, _) =>
      if (str == "ping") {
        Future("await-ping").pipeTo(self)(sender)
        goto(AwaitStateA)
      } else {
        stay() replying "stay-ping"
      }
  }

  when(AwaitStateA) {
    case Event(str: String, _) =>
      goto(StateA) replying str
  }

  whenUnhandled{
    case Event(m, d) ⇒
      log.error("Unknown message {} in state {} with data {}", m, stateName, stateData)
      stop() replying "Command " + m + "is not applicable in state " + stateName
  }
}

sealed trait State

case object StateA extends State
case object AwaitStateA extends State

sealed trait Data
case object NoData extends Data
