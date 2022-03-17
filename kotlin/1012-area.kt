import java.util.*

fun main(args: Array<String>) {
  val VALORES = readLine()!!
  var (A,B,C) = VALORES.split(" ").map { it.toDouble() }

     val PI = 3.14159

     val TRI = A*C/2
     val CIR = PI*(Math.pow(C, 2.0))
     val TRA = (A+B)*C/2
     val QUA = Math.pow(B, 2.0)
     val RET = A*B

  println("TRIANGULO: " + "%.3f".format(TRI))
  println("CIRCULO: " + "%.3f".format(CIR))
  println("TRAPEZIO: " + "%.3f".format(TRA))
  println("QUADRADO: " + "%.3f".format(QUA))
  println("RETANGULO: " + "%.3f".format(RET))
}
