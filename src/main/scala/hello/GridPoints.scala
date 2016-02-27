package hello

case class GridPoints(private val points: GridPoint*) {
  val set = points.toSet

  def isConnected = {
    set.forall {
      p =>
        val rest = set - p
        rest.exists(p.isNeighborOf)
    }
  }

  def contains(point: GridPoint) = points.contains(point)
}
