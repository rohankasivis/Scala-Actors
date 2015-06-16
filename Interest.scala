object Interest
{
  def simpleInterest(principal: Double, rate: Double, time: Int) = principal * (1 + rate / 100 * time)

  def compoundInterest(principal: Double, rate: Double, numberPerYear: Int, timeInYears: Int) = principal * Math.pow((1 + (rate / 100) / numberPerYear), numberPerYear * timeInYears)
}

object interestTester extends App
{
  println("Simple Interest test: " +Interest.simpleInterest(10000, 3.875, 5))
  println("Compound Interest test: " +Interest.compoundInterest(5000, 5, 12, 10))
}
