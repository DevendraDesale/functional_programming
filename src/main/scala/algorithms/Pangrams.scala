package algorithms

// https://www.hackerrank.com/challenges/pangrams
/**
  * Created by devendradesale on 31/3/16.
  */
object Pangrams {
  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    if(io.StdIn.readLine.toLowerCase.filter(c => c >= 'a' && c <= 'z').toSet.size == 26)
      println("pangram")
    else
      println("not pangram")
  }
}
