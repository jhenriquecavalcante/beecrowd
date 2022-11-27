import java.util.*

fun main(args: Array<String>) {
  val NOME = readLine()
  val SALARIO = readLine()!!.toDouble()
  val VENDAS = readLine()!!.toDouble()
  val TOTAL = SALARIO+VENDAS*.15
  println("TOTAL = R$ " + "%.2f".format(TOTAL))
}
