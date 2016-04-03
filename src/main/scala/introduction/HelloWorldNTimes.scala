/**
  * Created by devendradesale on 31/3/16.
  */

//https://www.hackerrank.com/challenges/fp-hello-world-n-times

object HelloWorldNTimes{
  def f(n: Int) = (1 to n).map(_ => "Hello World").foreach(println)

  def main(args: Array[String]) {
    val n = io.StdIn.readInt()
    f(n)
  }

}