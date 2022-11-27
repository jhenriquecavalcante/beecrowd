import java.util.*

fun main(args: Array<String>) {
  val X = readLine()!!.toInt()
  val Y = readLine()!!.toDouble()
  val C = X/Y
  println("%.3f ".format(C) + "km/l")
}
