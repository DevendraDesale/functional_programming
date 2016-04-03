package introduction

/**
  * Created by devendradesale on 3/4/16.
  */
// https://www.hackerrank.com/challenges/fp-sum-of-odd-elements
object SumAllOddNumber {

  def f(arr:List[Int]):Int = arr.filter(_ % 2 != 0).sum


  def main(args: Array[String]) {
    println(f(List(1,2,3,3,2,1,2,2,2)))
  }
}
