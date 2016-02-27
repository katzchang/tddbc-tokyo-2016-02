package hello

case class GridPoints(a: GridPoint, b: GridPoint) {
  def contains(that: GridPoint) =
    that == a || that == b
}