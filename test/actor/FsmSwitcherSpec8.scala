package actor

import akka.testkit.TestFSMRef


class FsmSwitcherSpec8 extends FSMSwitcherSpec {
   val adaptation = TestFSMRef(new FsmSwitcher8)
 }
