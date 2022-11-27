import java.util.*

class Mensagem{
  var mensagem = ""
  fun calcularParidade(): String{
    var contagem = 0
    for (c in mensagem){
      if (c == '1')
        contagem++
    var retorno = mensagem
      if (contagem % 2 == 1) retorno += "1"
      else retorno += "0"
    }
    return retorno
  }
}

fun main(args: Array<String>){
  val entrada = readLine()!!
  val msg = Mensagem()
  msg.mensagem = entrada
  println(msg.calcularParidade())
}
