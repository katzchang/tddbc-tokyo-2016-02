package hello

case class GridPoint(x: Int, y: Int) {
  val notation = (x, y).toString

  def hasSameCoordinatesWith(that: GridPoint) = this == that

  def isNeighborOf(that: GridPoint) = false
}