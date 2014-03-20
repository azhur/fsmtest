package actor

import akka.testkit.{TestFSMRef, ImplicitSender, TestKit}
import akka.actor.{Actor, ActorSystem}
import org.scalatest.WordSpecLike
import org.scalatest.Matchers
import org.scalatest.BeforeAndAfterAll
import org.scalatest.BeforeAndAfterEach
import org.scalatest.OneInstancePerTest

abstract class FSMSwitcherSpec extends TestKit(ActorSystem("test")) with ImplicitSender with WordSpecLike with Matchers with BeforeAndAfterAll with BeforeAndAfterEach with OneInstancePerTest {

  val adaptation: TestFSMRef[State, Data, _ <: Actor]

  override protected def afterAll(): Unit = {
    system.shutdown()
  }

  override protected def beforeEach(): Unit = {
    adaptation.stateName should be(StateA)
  }

  "Switch between states A" must {
    "should return `await-ping`" in {
      adaptation ! "ping"
      expectMsg("await-ping")
      adaptation.stateName should be(StateA)
    }
    "should return `stay-ping`" in {
      adaptation ! "pong"
      expectMsg("stay-ping")
      adaptation.stateName should be(StateA)
    }
  }
}
