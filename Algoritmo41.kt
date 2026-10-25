/**Algoritmo 41
* Objetivo: Entrar com quatro números e imprimir a média ponderada,
* sabendo-se que os pesos são respectivamente: 1, 2, 3 e 4.
*/
fun main() {
   print("Entre com o 1º número: ")
   val a = readlnOrNull()?.toDoubleOrNull() ?: 0.0
   print("Entre com o 2º número: ")
   val b = readlnOrNull()?.toDoubleOrNull() ?: 0.0
   print("Entre com o 3º número: ")
   val c = readlnOrNull()?.toDoubleOrNull() ?: 0.0
   print("Entre com o 4º número: ")
   val d = readlnOrNull()?.toDoubleOrNull() ?: 0.0
   val mp = (a * 1 + b * 2 + c * 3 + d * 4) / 10
   println("Média ponderada: $mp")
}

/**Teste de Execução no Terminal
* Entre com o 1º número: 5
* Entre com o 2º número: 6
* Entre com o 3º número: 7
* Entre com o 4º número: 8
* Média ponderada: 7.0
*/
