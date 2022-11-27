import java.util.*

fun main(args: Array<String>) {
  var SEGUNDOS = readLine()!!.toInt()
  var MINUTOS = SEGUNDOS/60
  SEGUNDOS = SEGUNDOS%60
  var HORAS = MINUTOS/60
  MINUTOS = MINUTOS%60
  println("$HORAS:$MINUTOS:$SEGUNDOS")
}
