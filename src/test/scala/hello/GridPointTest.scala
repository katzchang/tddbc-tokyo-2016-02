package hello

import org.scalatest.FreeSpec

class GridPointTest extends FreeSpec {

  import GridPoint._

  "GridPoint" - {
    val target = (4, 7)

    "isNeighborOf" in {
      assert(target.isNeighborOf((3, 7)))
      assert(!target.isNeighborOf((3, 8)))
      assert(!target.isNeighborOf((4, 7)))
    }
  }
}
