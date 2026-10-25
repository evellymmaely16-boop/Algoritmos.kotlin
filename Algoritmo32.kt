** Algoritmo 32
* Objetivo:Ler um número inteiro e imprimi-lo. */
fun main() {
   print("Entre com um numero: ")
   val num = readlnOrNull()?.toIntOrNull() ?: 0
   println("Numero digitado: $num")
}
/**Teste de execução no Terminal
* Entre com um numero: 42
* Número digitado: 42 */
