package hello

case class GridPoint(p: (Int, Int)) {
  val x = p._1
  val y = p._2
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
  def apply(x: Int, y: Int): GridPoint = GridPoint((x, y))
  implicit def toGridPoint(p: (Int, Int)): GridPoint = GridPoint(p)
}
