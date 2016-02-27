package hello

case class GridPoints(points: Set[GridPoint]) {
  def isConnected = points.fo.isNeighborOf(b)

  def contains(that: GridPoint) =
    that == a || that == b
}

object GridPoints {
  def apply(points: GridPoint*): GridPoints =
    GridPoints(points.toSet)
}