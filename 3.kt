fun main(args: Array<String>) {
    printPattern(6)
}

fun printPattern(n:Int) {
  var i:Int
  var j:Int
  i = 1
  while (i <= n)
  {
    j = 1
    while (j < i)
    {
      print(" ")
      j++
    }
    j = 1
    while (j <= (n * 2 - (2 * i - 1)))
    {
      if ((i == 1 || j == 1 ||
           j == (n * 2 - (2 * i - 1))))
      {
        print("o")
      }
      else
      {
        print("x")
      }
      j++
    }
    println()
    i++
  }
}