package introduction

/**
  * Created by devendradesale on 3/4/16.
  */
// https://www.hackerrank.com/challenges/fp-filter-array
object FilterArray {

  def f(delim:Int,arr:List[Int]):List[Int] = arr.filter(_ < delim)

  def main(args: Array[String]) {
    print(f(3,List(1,2,3,4,6,72,1,12)))
  }
}
