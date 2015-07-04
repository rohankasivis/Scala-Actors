object PrimeNumbers
{
  def isCoprimeTo(start: Int, n: Int): Boolean = TailRecursion.gcd(start,n) == 1
}

object TestPrime extends App
{
  println(PrimeNumbers.isCoprimeTo(5, 7))
  println(PrimeNumbers.isCoprimeTo(10, 15))
  println(PrimeNumbers.isCoprimeTo(17, 27))
}
