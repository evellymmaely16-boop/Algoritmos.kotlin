/**Algoritmo 36
* Objetivo: Ler dois números inteiros e imprimir a soma. */

fun main() {
   print("Entre com um número: ")
   val num1 = readlnOrNull()?.toIntOrNull() ?: 0
   print("Entre com outro número: ")
   val num2 = readlnOrNull()?.toIntOrNull() ?: 0
   val soma = num1 + num2
   println("Soma: $soma")
}

/** Teste de execução no Terminal
* Entre com um número: 12
* Entre com outro número: 8
* Soma: 20
* */
