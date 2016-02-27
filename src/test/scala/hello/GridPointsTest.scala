package hello

import org.scalatest.FreeSpec

class GridPointsTest extends FreeSpec {
  "2 Gridpoints" - {
    "contains" in {
      val target = GridPoints(GridPoint(4, 7), GridPoint(3, 7))
      assert(target.contains(GridPoint(4, 7)))
      assert(!target.contains(GridPoint(4, 8)))
    }

    "isConnected" in {
      assert(GridPoints(GridPoint(4, 7), GridPoint(3, 7)).isConnected)
      assert(!GridPoints(GridPoint(4, 7), GridPoint(3, 8)).isConnected)
    }
  }

  "3 GridPoints" - {
    "contains" in {
      val target = GridPoints(GridPoint(4, 7), GridPoint(3, 7), GridPoint(3, 8))
      assert(target.contains(GridPoint(4, 7)))
      assert(target.contains(GridPoint(3, 7)))
      assert(target.contains(GridPoint(3, 8)))
      assert(!target.contains(GridPoint(4, 8)))
    }

    "isConnected" in {
      assert(GridPoints(GridPoint(4, 7), GridPoint(3, 7)).isConnected)
      assert(!GridPoints(GridPoint(4, 7), GridPoint(3, 8)).isConnected)
    }

  }
}
