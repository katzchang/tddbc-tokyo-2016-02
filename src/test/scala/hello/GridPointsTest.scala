package hello

import org.scalatest.FreeSpec

class GridPointsTest extends FreeSpec {
  import GridPoint._

  "2 GridPoints" - {
    "contains" in {
      val target = GridPoints((4, 7), (3, 7))
      assert(target.contains((4, 7)))
      assert(!target.contains((4, 8)))
    }

    "isConnected" in {
      assert(GridPoints((4, 7), (3, 7)).isConnected)
      assert(!GridPoints((4, 7), (3, 8)).isConnected)
    }

    "count" in {
      assert(GridPoints((4, 7), (3, 7)).count == 2)
    }
  }

  "3 GridPoints" - {
    "contains" in {
      val target = GridPoints((4, 7), (3, 7), (3, 8))
      assert(target.contains((4, 7)))
      assert(target.contains((3, 7)))
      assert(target.contains((3, 8)))
      assert(!target.contains((4, 8)))
    }

    "isConnected" in {
      assert(GridPoints((4, 7), (3, 7), (3, 8)).isConnected)
      assert(GridPoints((4, 7), (3, 7), (5, 7)).isConnected)
      assert(!GridPoints((4, 7), (3, 7), (2, 8)).isConnected)
    }

    "count" in {
      assert(GridPoints((4, 7), (3, 7), (2, 8)).count == 3)
    }
  }

  "N GridPoints" - {
    "traversable" in {
      assert(GridPoints((1,1), (1,2), (2,2), (2,3), (3,3), (3,2)).isTraversable)
      assert(!GridPoints((1,1), (1,2), (2,2), (2,3), (3,3), (3,2), (4,3)).isTraversable)
    }
  }
}
