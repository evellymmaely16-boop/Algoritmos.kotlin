/**Algoritmo 56
 * Objetivo: Entrar com nome e idade. Imprimir essas informações com espaçamento
 */

fun main() {
    print("Digite o nome: ")
    val nome = readlnOrNull() ?: ""
    print("Digite a idade: ")
    val idade = readlnOrNull()?.toIntOrNull() ?: 0
    println("\n\n")
    println("Nome = $nome")
    println("Idade = $idade")
}

/** Teste de Execução no Terminal 
 * Digite o nome: Evellim
 * Digite a idade: 25
 * Nome = Evellim
 * Idade = 25
 */
