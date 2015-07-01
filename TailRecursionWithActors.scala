import akka.actor._

case class gcdMessage(a: Int, b: Int)
case class factorialMessage(n: Int)

class TailRecursionWithActors extends Actor
{
  override def receive: Receive =
  {
    case gcdMessage(a: Int, b: Int) => val gcd = TailRecursion.gcd(a, b)
      println("The gcd is: " + gcd)
      sender ! "The gcd is: " + gcd

    case factorialMessage(n: Int) => val factorial = TailRecursion.factorial(5)
      println("The factorial is: " + factorial)
      sender ! "The factorial is: " + factorial
  }
}

object RecursionTest extends App
{
  val system = ActorSystem("RecursionSystem")
  val value = system.actorOf(Props[TailRecursionWithActors], name = "Recursion")

  value ! gcdMessage(44, 12)
  value ! factorialMessage(5)
}
