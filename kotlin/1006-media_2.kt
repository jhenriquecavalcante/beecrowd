import java.util.*

fun main(args: Array<String>) {
  val A = readLine()!!.toDouble()
  val B = readLine()!!.toDouble()
  val C = readLine()!!.toDouble()
  val MEDIA = ((A*2) + (B*3) + (C*5)) / 10

  println("MEDIA = " + "%.1f".format(MEDIA))
}
