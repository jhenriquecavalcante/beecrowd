import java.util.*

fun main(args: Array<String>) {
  val RAIO = readLine()!!.toDouble()
  val PI = 3.14159
  val VOLUME = (4.0/3)*PI*(RAIO*RAIO*RAIO)
  println("VOLUME = " + "%.3f".format(VOLUME))
}
