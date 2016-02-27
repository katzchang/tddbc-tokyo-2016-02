package hello

case class GridPoints(private val points: Set[(Int, Int)]) {
  import GridPoint._

  def isConnected =
    points.forall { p =>
      points.exists(p.isNeighborOf)
    }

  def contains(point: (Int, Int)) = points.contains(point)

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
  // TODO: ユニークじゃないときの振る舞い
  def apply(pairs: (Int, Int)*): GridPoints =
    GridPoints(pairs.toSet)
}
