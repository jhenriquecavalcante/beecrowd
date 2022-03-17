import java.util.*

fun main(args: Array<String>) {

 val V1 = readLine()!!
  val (X1,Y1) = V1.split(" ").map { it.toDouble() }

  val V2 = readLine()!!
  val (X2,Y2) = V2.split(" ").map { it.toDouble() }

  val D = Math.pow(Math.pow((X2-X1), 2.0) + Math.pow((Y2-Y1), 2.0),
 .5)

  println("%.4f".format(D))
	
}
