object ListManipulation
{
  def reverseTailRecursive[A](ls: List[A]): List[A] =
  {
    def reverseR(result: List[A], curList: List[A]): List[A] = curList match {
      case Nil       => result
      case h :: tail => reverseR(h :: result, tail)
    }
    reverseR(Nil, ls)
  }

  def isPalindrome[A](ls: List[A]): Boolean = ls == ls.reverse
}

object ManipulationTester extends App
{
  val nums = 1 :: (2 :: (3 :: (2 :: (1 :: Nil))))
  println(ListManipulation.reverseTailRecursive(nums))
  println(ListManipulation.isPalindrome(nums))
}
