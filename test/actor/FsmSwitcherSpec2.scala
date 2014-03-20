package actor

import akka.testkit.TestFSMRef


class FsmSwitcherSpec2 extends FSMSwitcherSpec {
   val adaptation = TestFSMRef(new FsmSwitcher2)
 }
