object LogicTest
{
  def and(a: Boolean, b: Boolean): Boolean = (a, b) match
  {
    case (true, true) => true
    case _            => false
  }

  def or(a: Boolean, b: Boolean): Boolean = (a, b) match
  {
    case (false, false) => false
    case _              => true
  }

  def nor(a: Boolean, b: Boolean) : Boolean = (a, b) match
  {
    case (false, false) => true
    case _              => false
  }

  def nand(a: Boolean, b: Boolean): Boolean = (a, b) match
  {
    case (true, true) => false
    case _            => true
  }

  def xor(a: Boolean, b: Boolean): Boolean = (a, b) match
  {
    case (true, false) => true
    case (false, true) => true
    case _             => false
  }

  def eq(a: Boolean, b: Boolean): Boolean = (a, b) match
  {
    case (true, true)   => true
    case (false, false) => true
    case _              => false
  }
}

object LogicTableTester extends App
{
  println(LogicTest.and(true, false))
  println(LogicTest.or(true, false))
  println(LogicTest.nor(true, false))
  println(LogicTest.nand(true, false))
  println(LogicTest.xor(true, false))
  println(LogicTest.eq(true, false))
}
