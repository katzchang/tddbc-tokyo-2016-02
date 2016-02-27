package hello

case class GridPoint(p: (Int, Int)) {
  def isNeighborOf(that: (Int, Int)) = {
    val (x, y) = p
    that ==(x - 1, y) ||
      that ==(x + 1, y) ||
      that ==(x, y - 1) ||
      that ==(x, y + 1)
  }
}

object GridPoint {
  implicit def toGridPoint(p: (Int, Int)): GridPoint = GridPoint(p)
}
