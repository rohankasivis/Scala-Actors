object Tree {
  def cBalanced[T](nodes: Int, value: T): List[Tree[T]] = nodes match {
    //case n if n < 1 => List(End)
    case n if n % 2 == 1 => {
      val subtrees = cBalanced(n / 2, value)
      subtrees.flatMap(l => subtrees.map(r => Node(value, l, r)))
    }
    case n if n % 2 == 0 => {
      val lesserSubtrees = cBalanced((n - 1) / 2, value)
      val greaterSubtrees = cBalanced((n - 1) / 2 + 1, value)
      //lesserSubtrees.flatMap(l => greaterSubtrees.flatMap(g => List(Node(value, l, g), Node(value, g, l))))
    }
  }
}