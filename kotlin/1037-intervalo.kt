import java.util.*

fun main(args: Array<String>) {

  var N = readLine()!!.toDouble()

  if (N > 100 || N < 0) {
    println("Fora de intervalo")
  } else if (N >= 0 && N <= 25) {
    println("Intervalo [0,25]")
  } else if (N > 25 && N <= 50) {
    println("Intervalo (25,50]")
  } else if (N > 50 && N <= 75) {
    println("Intervalo (50,75]")
  } else if (N > 75 && N <= 100) {
    println("Intervalo (75,100]")
  }
	
}
