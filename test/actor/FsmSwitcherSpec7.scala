package actor

import akka.testkit.TestFSMRef


class FsmSwitcherSpec7 extends FSMSwitcherSpec {
   val adaptation = TestFSMRef(new FsmSwitcher7)
 }
