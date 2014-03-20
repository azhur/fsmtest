package actor

import akka.testkit.TestFSMRef


class FsmSwitcherSpec5 extends FSMSwitcherSpec {
   val adaptation = TestFSMRef(new FsmSwitcher5)
 }
