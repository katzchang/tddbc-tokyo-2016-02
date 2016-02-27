package hello

case class GridPoint(x: Int, y: Int) {
  val notation = (x, y).toString

  def hasSameCoordinatesWith(that: GridPoint) = this == that

  def isNeighborOf(that: GridPoint) =
    that == GridPoint(x - 1, y) ||
      that == GridPoint(x + 1, y) ||
      that == GridPoint(x, y - 1) ||
      that == GridPoint(x, y + 1)

}