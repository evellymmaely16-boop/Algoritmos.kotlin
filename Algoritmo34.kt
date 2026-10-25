/**Algoritmo 34
* Objetivo: Ler um número inteiro e imprimir seu sucessor e seu antecessor. */

fun main() {
   print("Entre com um número: ")
   val numero = readlnOrNull()?.toIntOrNull() ?: 0
   val ant = numero - 1
   val suc = numero + 1
   println("O sucessor é $suc e o antecessor é $ant")
}

/**Teste de execução no Terminal
* Entre com um número: 15
* O sucessor é 16 e o antecessor é 14
* */
