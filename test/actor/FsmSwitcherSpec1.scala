package actor

import akka.testkit.TestFSMRef


class FsmSwitcherSpec1 extends FSMSwitcherSpec {
  val adaptation = TestFSMRef(new FsmSwitcher1)
}
