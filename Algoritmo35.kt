/**Algoritmo 35
* Objetivo: Ler nome, endereço e telefone e imprimi-los */

fun main() {
   print("Entre com o nome: ")
   val nome = readlnOrNull() ?: ""
   print("Entre com o endereço: ")
   val endereco = readlnOrNull() ?: ""
   print("Entre com o telefone: ")
   val telefone = readlnOrNull() ?: ""
   println("\nNome: $nome")
   println("Endereço: $endereco")
   println("Telefone: $telefone")
}

/**Teste de execução no Terminal
* Entre com o nome: Evellim
* Entre com o endereço: Rua X, 09
* Entre com o telefone: 99998888
* Nome: Evellim
* Endereço: Rua X, 09
* Telefone: 9999-8888
* */
