object ListInfo
{
  def lastRecursive[A](ls: List[A]): A = ls match
  {
    case h :: Nil  => h
    case _ :: tail => lastRecursive(tail)
    case _         => throw new NoSuchElementException
  }

  def penultimateRecursive[A](ls: List[A]): A = ls match
  {
    case h :: _ :: Nil => h
    case _ :: tail     => penultimateRecursive(tail)
    case _             => throw new NoSuchElementException
  }

  def nthRecursive[A](n: Int, ls: List[A]): A = (n, ls) match
  {
    case (0, h :: _   ) => h
    case (n, _ :: tail) => nthRecursive(n - 1, tail)
    case (_, Nil      ) => throw new NoSuchElementException
  }
}

object ListManipulationTester extends App
{
  val nums = 1 :: (2 :: (3 :: (4 :: (5 :: Nil))))
  println(ListInfo.lastRecursive(nums))
  println(ListInfo.penultimateRecursive(nums))
  println(ListInfo.nthRecursive(nums.length - 1, nums))
}