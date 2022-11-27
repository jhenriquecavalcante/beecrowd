import java.util.*

fun main(args: Array<String>) {
  val VALORES = readLine()!!
  val (A,B,C) = VALORES.split(" ").map { it.toInt() }
  var MAIOR = ((A+B+Math.abs(A-B))/2)
  MAIOR = (MAIOR + C + Math.abs(MAIOR - C))/2
  println("$MAIOR eh o maior")
}
