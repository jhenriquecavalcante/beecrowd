import java.util.*

fun main(args: Array<String>) {
  val (N1,N2,N3,N4) = readLine()!!.split(" ").map{ it.toFloat() }
  val MEDIA = ((N1*2)+(N2*3)+(N3*4)+N4)/10
  val MEDIAF = "%.1f".format(MEDIA)
  if (MEDIA >= 7) {
    println("Media: $MEDIAF")
    println("Aluno aprovado.")
  } else if (MEDIA < 5) {
    println("Media: $MEDIAF")
    println("Aluno reprovado.")
  } else if (MEDIA >= 5 && MEDIA <= 6.9) {
    println("Media: $MEDIAF")
    println("Aluno em exame.")
    val EXAME = readLine()!!.toFloat()
    val EXAMEF = "%.1f".format(EXAME)
    println("Nota do exame: $EXAMEF")
    val NOVA_MEDIA = (MEDIA + EXAME)/2
    val NOVA_MEDIAF = "%.1f".format(NOVA_MEDIA)
    if (NOVA_MEDIA >= 5) {
      println("Aluno aprovado.")
    } else {
      println("Aluno reprovado.")
    }
    println("Media final: $NOVA_MEDIAF")
  }
}
