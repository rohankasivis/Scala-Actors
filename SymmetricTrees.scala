object SymmetricTrees {
  def symmetricBalancedTrees[T](nodes: Int, value: T): List[Tree[T]] =
    cBalanced(nodes, value).filter(_.isSymmetric)
}