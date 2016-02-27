package hello

import org.scalatest.FreeSpec

class GridPointTest extends FreeSpec {
  "grid point" in {
    val target = GridPoint(4, 7)
    assert(target.x == 4)
    assert(target.y == 7)
    assert(target.notation == "(4,7)")
  }
}

case class GridPoint(x: Int, y: Int) {
  val notation = (x, y).toString
}