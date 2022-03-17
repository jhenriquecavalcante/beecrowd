import java.util.*

class Pomekom(){
    var ataque: Double = 0.0
    var defesa: Double = 0.0
    var level: Double = 0.0
    var bonus: Double = 0.0

    fun atacar(): Double {
        var resultado = (this.ataque + this.defesa) / 2.0

        if (level % 2.0 == 0.0) {
            resultado += bonus
        }

        return resultado
    }
}

fun main(args: Array<String>) {

    val batalhas = readLine()!!.toInt()
    var bonus = 0.0
    for (indice in 1..batalhas){
        bonus = readLine()!!.toDouble()

        var entradas = readLine()!!.split(" ")
        var dabriel = Pomekom()
        dabriel.ataque = entradas[0].toDouble()
        dabriel.defesa = entradas[1].toDouble()
        dabriel.level = entradas[2].toDouble()
        dabriel.bonus = bonus

        entradas = readLine()!!.split(" ")
        var guarte = Pomekom()
        guarte.ataque = entradas[0].toDouble()
        guarte.defesa = entradas[1].toDouble()
        guarte.level = entradas[2].toDouble()
        guarte.bonus = bonus

        if (dabriel.atacar() < guarte.atacar()) {
            println("Guarte")
        } else if (dabriel.atacar() > guarte.atacar()) {
            println("Dabriel")
        } else {
            println("Empate")
        }
    }
