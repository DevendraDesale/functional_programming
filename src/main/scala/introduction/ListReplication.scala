package introduction

/**
  * Created by devendradesale on 3/4/16.
  */

// https://www.hackerrank.com/challenges/fp-list-replication
object ListReplication {

  def f(num:Int,arr:List[Int]):List[Int] = arr.flatMap(List.fill(num)(_))

  def main(args: Array[String]) {
    print(f(2,List(1,2,3)))

  }
}
