package hello

case class GridPoints(private val points: GridPoint*) {
  def isConnected = {
    points.forall {
      p =>
        points.exists(p.isNeighborOf)
    }
  }

  def contains(point: GridPoint) = points.contains(point)
}
