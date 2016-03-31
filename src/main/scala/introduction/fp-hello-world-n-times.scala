/**
  * Created by devendradesale on 31/3/16.
  */

//https://www.hackerrank.com/challenges/fp-hello-world-n-times

object Solution2 extends App{
  def f(n: Int) = (1 to n).map(_ => "Hello World").foreach(println)

  val n = io.StdIn.readInt()
  f(n)
}