package actor

import akka.actor.{Actor, LoggingFSM}

class FsmSwitcher1 extends Actor with LoggingFSM[State, Data] with FSMSwitcher {
  initialize()
}
