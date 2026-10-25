/**Algoritmo 38
* Objetivo: Ler um número real e imprimir a terça parte deste número. */


fun main() {
   print("Entre com um número com ponto: ")
   val num = readlnOrNull()?.toDoubleOrNull() ?: 0.0
   val tercaParte = num / 3
   println("A terça parte é: $tercaParte")
}


/** Teste de execução no Terminal
* Entre com um número com ponto: 15.0
* A terça parte é: 5.0
* */
