package introduction

/**
  * Created by devendradesale on 3/4/16.
  */
object ArrayLength {

  def f(arr:List[Int]):Int = arr.foldLeft(0){(acc, _) => 1 + acc}

  def main(args: Array[String]) {
    println(f(List(1,2,3,4,5)))
  }
}
