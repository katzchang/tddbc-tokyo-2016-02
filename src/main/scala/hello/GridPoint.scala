package hello

case class GridPoint(p: (Int, Int)) {
  val (x, y) = p
  val notation = p.toString

  def hasSameCoordinatesWith(that: GridPoint) = this == that

  def isNeighborOf(that: GridPoint) = {
    val p2 = that.p
    p2 == (x - 1, y) ||
      p2 == (x + 1, y) ||
      p2 == (x, y - 1) ||
      p2 == (x, y + 1)

  }
}

object GridPoint {
  implicit def toGridPoint(p: (Int, Int)): GridPoint = GridPoint(p)
}
