package algorithms


/**
  * Created by devendradesale on 31/3/16.
  */

// https://www.hackerrank.com/challenges/two-strings
object TwoString {
  def main(args: Array[String]) {
    val args1 = List(io.Source.stdin.getLines())
    // args: List[String] = List(hello, world, hi, world)
    val args2 = args.map ( x => (x.toCharArray().deep, x) ).toList.map(x => x._1)
    //args2: List[IndexedSeq[Any]] = List(Array(h, e, l, l, o), Array(w, o, r, l, d), Array(h, i), Array(w, o, r, l, d))
    val odd = args2.zipWithIndex.filter(_._2 % 2 == 0).map(_._1)
    val even = args2.zipWithIndex.filter(_._2 % 2 != 0).map(_._1)
    /* odd: List[IndexedSeq[Any]] = List(Array(h, e, l, l, o), Array(h, i))
    even: List[IndexedSeq[Any]] = List(Array(w, o, r, l, d), Array(w, o, r, l, d)) */
    for (a <- odd; b <- even if odd(0).intersect(even(0)) != Nil ) yield { println("YES") }
  }
}
