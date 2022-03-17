import java.util.*

fun main(args: Array<String>) {

    var VALOR = readLine()!!.toInt()
    println(VALOR)

    val NOTAS = listOf(100, 50, 20, 10, 5, 2, 1)

    for (NOTA in NOTAS) {
        val QUANTIDADE_NOTA = VALOR/NOTA
        println("$QUANTIDADE_NOTA nota(s) de R$ $NOTA,00")
        VALOR -= QUANTIDADE_NOTA*NOTA
    }
	
}
