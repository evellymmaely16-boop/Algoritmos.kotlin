/**Algoritmo 39
* Objetivo: Entrar com dois números reais e imprimir a média aritmética
*/


fun main() {
   print("Digite a 1ª nota: ")
   val nota1 = readlnOrNull()?.toDoubleOrNull() ?: 0.0
   print("Digite a 2ª nota: ")
   val nota2 = readlnOrNull()?.toDoubleOrNull() ?: 0.0
   val media = (nota1 + nota2) / 2
   println("Média: $media")
}


/** Teste de Execução no Terminal
* Digite a 1ª nota: 7.5
* Digite a 2ª nota: 8.5
* Média: 8.0
*/
