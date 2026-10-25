/**Algoritmo 37
* Objetivo: Ler dois números inteiros e imprimir o produto. */


fun main() {
   print("Entre com um número: ")
   val num1 = readlnOrNull()?.toIntOrNull() ?: 0
   print("Entre com outro número: ")
   val num2 = readlnOrNull()?.toIntOrNull() ?: 0
   val produto = num1 * num2
   println("Produto: $produto")
}


/** Teste de execução no Terminal
* Entre com um número: 4
* Entre com outro número: 5
* Produto: 20
* */
