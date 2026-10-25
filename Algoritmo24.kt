/** Algoritmo 24
** Objetivo: Entrar com um número inteiro de 3 casas e imprimir o algoritmo da casa das dezenas. */


fun Int.dezena(): Int = (this / 10) % 10
fun main() {
 print("Digite número de 3 dígitos: ")
   val num = readlnOrNull()?.toIntOrNull() ?: 0
   println("Dezena: ${num.dezena()}")
}


/**Teste da execução no Terminal
* Digite número de 3 dígitos: 346
* Dezena: 4
*/
