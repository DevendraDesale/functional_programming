package algorithms

//https://www.hackerrank.com/challenges/simple-array-sum

/**
  * Created by devendradesale on 31/3/16.
  */
object ArraySum {
  def main(args: Array[String]) {
    println(io.Source.stdin.getLines().drop(1).flatMap(line=>line.split(" ")).map(_.toInt).sum)
  }
}
