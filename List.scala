object List extends App
{
  val fruits = "apples" :: ("oranges" :: ("bananas" :: Nil))

  val nums = 1 :: (2 :: (3 :: (4 :: (5 :: Nil))))

  val empty = Nil

  val multiDim = (1 :: (0 :: (0 :: Nil))) ::
    (0 :: (1 :: (0 :: Nil))) ::
    (0 :: (0 :: (1 :: Nil))) :: Nil

  println("Head of fruits: " + fruits.head)
  println("Tail of fruits: " + fruits.tail)
  println("Test for empty: " + empty.isEmpty)
  println("Head of multiDim: " + multiDim.head)
}