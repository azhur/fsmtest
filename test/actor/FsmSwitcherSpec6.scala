package actor

import akka.testkit.TestFSMRef


class FsmSwitcherSpec6 extends FSMSwitcherSpec {
   val adaptation = TestFSMRef(new FsmSwitcher6)
 }
