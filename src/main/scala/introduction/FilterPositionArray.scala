package introduction

/**
  * Created by devendradesale on 3/4/16.
  */
// https://www.hackerrank.com/challenges/fp-filter-positions-in-a-list
object FilterPositionArray {


  def f(arr: List[Int]): List[Int] = arr.tail.toIterator.sliding(1, 2).toList.flatten


  def f2(arr: List[Int]): List[Int] =
    arr match {
      case x :: y :: l => y :: f2(l)
      case x :: y => y
      case Nil => Nil
    }

  def main(args: Array[String]) {
    println(f2(List(1,2,3,4,5,6,7)))

  }
}
