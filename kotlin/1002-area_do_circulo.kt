import java.util.*

fun main(args: Array<String>) {

  val pi = 3.14159
  val raio = readLine()!!.toDouble()
  val area = pi * (raio * raio)
  println("A=" + "%.4f".format(area))
	
}
