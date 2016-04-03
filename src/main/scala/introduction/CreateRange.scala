package introduction

/**
  * Created by devendradesale on 3/4/16.
  */
// https://www.hackerrank.com/challenges/fp-array-of-n-elements
object CreateRange {

  def f(num:Int) : List[Int] = (1 to num).toList

  def main(args: Array[String]) {
    print(f(4))
  }
}
