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
      points.count(_.isNeighborOf(p))
    }.sorted match {
      case 1 :: 1 :: rest if rest.forall(_ == 2) => true
      case _ => false
    }




  }
}

object GridPoints {
  def apply(pairs: (Int, Int)*): GridPoints = {
    GridPoints(pairs.map(GridPoint(_)).toSet)
  }
}
