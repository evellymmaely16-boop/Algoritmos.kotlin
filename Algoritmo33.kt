/**Algoritmo 33
* Objetivo: Ler um número inteiro e imprimir o seu sucessor. */

fun main() {
   print("Entre com um número: ")
   val num1 = readlnOrNull()?.toIntOrNull() ?: 0
   print("Entre com outro número: ")
   val num2 = readlnOrNull()?.toIntOrNull() ?: 0
   println("Número 1: $num1")
   println("Número 2: $num2")
}

/**Teste de execução no Terminal
* Entre com um número: 10
* Entre com outro número: 20
* Número 1: 10
* Número 2: 20
* */
