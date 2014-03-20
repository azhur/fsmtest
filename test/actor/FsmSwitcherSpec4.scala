package actor

import akka.testkit.TestFSMRef


class FsmSwitcherSpec4 extends FSMSwitcherSpec {
   val adaptation = TestFSMRef(new FsmSwitcher4)
 }
