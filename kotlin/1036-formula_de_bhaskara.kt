import java.util.*

fun main(args: Array<String>) {
  var (A,B,C) = readLine()!!.split(" ").map{ it.toDouble() }
  val DELTA = Math.pow(B, 2.0)-4*(A*C)
  if (A == 0.0 || DELTA < 0.0)
    println("Impossivel calcular")
  else {
    val R1 = (-B + Math.sqrt(DELTA)) / (2*A)
    val R2 = (-B - Math.sqrt(DELTA)) / (2*A)
    println("R1 = " + "%.5f".format(R1))
    println("R2 = " + "%.5f".format(R2))
  }
}
