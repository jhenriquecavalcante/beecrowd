import java.util.*

fun main(args: Array<String>) {

  var DIAS = readLine()!!.toInt()

  var ANOS = DIAS/365
  DIAS = DIAS%365
  var MESES = DIAS/30
  DIAS = DIAS%30

  println("$ANOS ano(s)")
  println("$MESES mes(es)")
  println("$DIAS dia(s)")
	
}
