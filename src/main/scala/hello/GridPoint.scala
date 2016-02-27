package hello

case class GridPoint(p: (Int, Int)) {
  val (x, y) = p
  val notation = p.toString

  def hasSameCoordinatesWith(that: GridPoint) = this == that

  def isNeighborOf(that: (Int, Int)) =
    that ==(x - 1, y) ||
      that ==(x + 1, y) ||
      that ==(x, y - 1) ||
      that ==(x, y + 1)
}

object GridPoint {
  implicit def toGridPoint(p: (Int, Int)): GridPoint = GridPoint(p)
}
