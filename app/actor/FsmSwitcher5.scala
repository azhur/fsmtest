package actor

import akka.actor.{Actor, LoggingFSM}

class FsmSwitcher5 extends Actor with LoggingFSM[State, Data] with FSMSwitcher {
   initialize()
 }
