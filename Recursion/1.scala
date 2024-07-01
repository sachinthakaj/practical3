@main def q1()=
     println(reverse("doghouse"))
     val strings = List("hello", "world!", "scala", "programming")

     println(longerThan5(strings))
     println(mean(23,45))
     
     val nums = List(1, 2, 3, 4, 5, 6, 7)
     println(evenSum(nums))
     


def reverse(s: String): String = s match {
    case "" => s
    case _ => reverse(s.tail) + s.head
}

def longerThan5(strings: List[String]): List[String] = strings match {
  case Nil => Nil
  case head :: tail =>
    if head.length > 5 then 
      head :: longerThan5(tail)
    else 
      longerThan5(tail)
}

def mean(num1: Int, num2: Int): Float = {
  val m = (num1 + num2) / 2.0
  math.rint(m * 100).toFloat / 100f
}

def evenSum(nums: List[Int]): Int = nums match {
  case Nil => 0
  case head :: tail => 
    if head % 2 == 0 then
      head + evenSum(tail)
    else
      evenSum(tail)
}


     

