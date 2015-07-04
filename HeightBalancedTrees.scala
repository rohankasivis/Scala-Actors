object HeightBalancedTrees {
  def hbalTrees[T](height: Int, value: T): List[Tree[T]] = height match {
    case n if n < 1 => List(End)
    case 1          => List(Node(value))
    case _ => {
      val fullHeight = hbalTrees(height - 1, value)
      val short = hbalTrees(height - 2, value)
      fullHeight.flatMap((l) => fullHeight.map((r) => Node(value, l, r))) :::
        fullHeight.flatMap((f) => short.flatMap((s) => List(Node(value, f, s), Node(value, s, f))))
    }
  }
}