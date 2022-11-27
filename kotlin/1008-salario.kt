import java.util.*

fun main(args: Array<String>) {
  val NUMBER = readLine()!!.toInt()
  val HOURS = readLine()!!.toInt()
  val PAID = readLine()!!.toDouble()
  val SALARY = HOURS*PAID
  println("NUMBER = $NUMBER")
  println("SALARY = U$ " + "%.2f".format(SALARY))
}
