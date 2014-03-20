package actor

import akka.testkit.TestFSMRef

class FsmSwitcherSpec10 extends FSMSwitcherSpec {
  val adaptation = TestFSMRef(new FsmSwitcher10)
}
