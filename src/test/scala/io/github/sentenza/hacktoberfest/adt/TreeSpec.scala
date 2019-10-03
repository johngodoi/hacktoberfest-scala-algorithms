package io.github.sentenza.hacktoberfest.adt

import org.scalatest.{Matchers, WordSpec}

class TreeSpec extends WordSpec with Matchers {
  "A Tree" should {
    "have a size() method to compute its size" in {
      val testTree = Branch(
        Branch(Leaf("a"), Leaf("b")),
        Branch(Leaf("c"), Leaf("d"))
      )
      Tree.size(testTree) shouldBe 7
    }
  }

  "A Tree" should {
    "have a depth() method to compute its depth" in {
      val testTree = Branch(
        Branch(Leaf("a"), Leaf("b")),
        Branch(Leaf("c"), Leaf("d"))
      )
      Tree.depth(testTree) shouldBe 2
    }
  }
}
