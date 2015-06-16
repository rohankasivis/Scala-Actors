import akka.actor._

case class SimpleMessage(principal: Double, rate: Double, time: Int)
case class CompoundMessage(principal: Double, rate: Double, numberPerYear: Int, timeInYears: Int)

class InterestWithActors extends Actor
{
  override def receive: Receive = {
    case SimpleMessage(principal,rate, time) =>val interest= Interest.simpleInterest(principal,rate,time)
      println("The interest is : "+interest)
      sender ! "The sum is : "+interest

    case CompoundMessage(principal, rate, numberPerYear, timeInYears) =>val interest= Interest.compoundInterest(principal, rate, numberPerYear, timeInYears)
      println("The sum is : "+interest)
      sender ! "The sum is : "+interest
  }
}

object InterestTest extends App
{
  val system = ActorSystem("InterestSystem")
  val interest = system.actorOf(Props[InterestWithActors], name = "Interest")
  // start them going
  interest ! SimpleMessage(10000, 3.875, 5)
  interest ! CompoundMessage(5000, 5, 12, 10)
}
