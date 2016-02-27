package hello

// TODO: ユニークじゃないときの振る舞い
case class GridPoints(private val points: Set[GridPoint]) {
  def isConnected =
    points.forall { p =>
      points.exists(p.isNeighborOf)
    }

  def contains(point: GridPoint) = points.contains(point)

  def count = points.size

  def isTraversable = {
    points.toList.map { p =>
      points.count(_.isNeighborOf(p)) % 2
    }.count(_ == 1) match {
      case 2 => true
      case 0 => true
      case _ => false
    }
  }
}

object GridPoints {
  def apply(pairs: (Int, Int)*): GridPoints = {
    GridPoints(pairs.map(GridPoint(_)).toSet)
  }
}
