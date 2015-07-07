object TailRecursion
{
  def factorial(n: Int): Int =
  {
    def loop(acc: Int, n: Int): Int =
    {
      if(n == 0)
        acc
      else
        loop(acc * n, n - 1)
    }
    loop(1, n)
  }

  def pascal(c: Int, r: Int): Int =
  {
    if (c == 0 && r == 0)
      c + 1
    else if (c == 0 || c == r || r == 1)
      1
    else
      pascal(c - 1, r - 1) + pascal(c, r - 1)
  }
}

object TailRecursionTester extends App
{
  println(TailRecursion.factorial(6))
  println(TailRecursion.pascal(2, 4))
}
