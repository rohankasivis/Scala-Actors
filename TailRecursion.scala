object TailRecursion
{
  def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  def factorial(n: Int): Int = if(n == 0) 1 else n * factorial(n - 1)
}

object RecursionTester extends App
{
  println("gcd: " + TailRecursion.gcd(23234244, 2232324))
  println("factorial: " + TailRecursion.factorial(5))
}
