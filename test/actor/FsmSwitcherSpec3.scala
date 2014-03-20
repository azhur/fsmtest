package actor

import akka.testkit.TestFSMRef


class FsmSwitcherSpec3 extends FSMSwitcherSpec {
   val adaptation = TestFSMRef(new FsmSwitcher3)
 }
