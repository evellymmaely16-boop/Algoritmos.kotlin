/**Algoritmo 49
 * Objetivo: Dada uma palavra/nome, imprimir: todo o nome, 1° caractere, último, do 1° ao 3°,
 * 4° caractere, todos menos o 1° e os 2 últimos
 */

fun main() {
    print("Entre com o nome: ")
    val nome = readlnOrNull() ?: ""

    if (nome.length >= 4) {
        println("Todo nome: $nome")
        println("Primeiro caractere: ${nome.first()}")
        println("Último caractere: ${nome.last()}")
        println("Do primeiro ao terceiro caractere: ${nome.take(3)}")
        println("Quarto caractere: ${nome[3]}")
        println("Todos menos o primeiro: ${nome.drop(1)}")
        println("Os dois últimos: ${nome.takeLast(2)}")
    } else {
        println("Por favor, introduza um nome com pelo menos 4 letras para os testes.")
    }
}

/** Teste de Execução no Terminal
 * Entre com o nome: Evellim Maely
 * Todo nome: evellim maely
 * Primeiro caractere: e
 *Último caractere: y
 *Do primeiro ao terceiro caractere: eve
 *Quarto caractere: l
 *Todos menos o primeiro: vellim maely
 *Os dois últimos: ly
 */
