package actor

import akka.testkit.TestFSMRef


class FsmSwitcherSpec9 extends FSMSwitcherSpec {
   val adaptation = TestFSMRef(new FsmSwitcher9)
 }
