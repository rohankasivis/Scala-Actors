import org.uncommons.maths.number.Rational

object Rationals extends App
{
  var i = 1
  var x = new Rational(0, 1)

  while (i <= 10)
  {
    x += new Rational(1, i) + ""
    i += 1
  }

  println("" + x)
}
