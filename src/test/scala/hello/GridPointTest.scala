package hello

import org.scalatest.FreeSpec

class GridPointTest extends FreeSpec {

  import GridPoint._

  "GridPoint" - {
    val target = (4, 7)
    assert(target.x == 4)
    assert(target.y == 7)
    assert(target.notation == "(4,7)")

    "hasSameCoordinatesWith" in {
      assert(target.hasSameCoordinatesWith(GridPoint(4, 7)))
      assert(!target.hasSameCoordinatesWith(GridPoint(3, 8)))
    }

    "isNeighborOf" in {
      assert(target.isNeighborOf(GridPoint(3, 7)))
      assert(!target.isNeighborOf(GridPoint(3, 8)))
      assert(!target.isNeighborOf(GridPoint(4, 7)))
    }
  }
}
