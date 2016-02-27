package hello

case class GridPoints(a: GridPoint, b: GridPoint) {
  def isConnected = a.isNeighborOf(b)
  def contains(that: GridPoint) =
    that == a || that == b

}