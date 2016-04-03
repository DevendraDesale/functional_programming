package introduction

/**
  * Created by devendradesale on 3/4/16.
  */

// https://www.hackerrank.com/challenges/fp-reverse-a-list
object ReverseList {

  def f(arr:List[Int]):List[Int] = arr match {
    case h :: tail => f(tail) ::: List(h)
    case Nil => Nil
  }

  def f2[A](ls: List[A]): List[A] =
    ls.foldLeft(List[A]()) { (r, h) => h :: r }

  def lastNth[A](n: Int, l:List[A]): A = {
    def reverse[A](l:List[A]):List[A] = {
      def _reverse[A](r:List[A], l:List[A]):List[A] = l match {
        case Nil => r
        case head::tail => _reverse(head::r, tail)
      }
      _reverse(List(), l)
    }

    def findKth[A](k:Int, l:List[A]):A = (k,l) match {
      case (0, h::_) => h
      case (k, _::tail) if k > 0 => findKth(k - 1, tail)
      case _ => throw new NoSuchElementException
    }

    val r = reverse(l)
    findKth(n - 1, r)
  }

  def main(args: Array[String]) {
    print(f(List(1,2,3,5)))
  }
}
