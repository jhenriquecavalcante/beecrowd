import java.util.*

fun main(args: Array<String>) {

  val HORAS = readLine()!!.toInt()
  val VELOCIDADE = readLine()!!.toInt()

  val LITROS = HORAS.toDouble()*VELOCIDADE/12

  println("%.3f".format(LITROS))
	
}
