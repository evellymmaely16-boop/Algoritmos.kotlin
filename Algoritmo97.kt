/**
 * Algoritmo 97
 * Objetivo: Entrar com um número e informar se ele é divisível por 10, por 5, 
 * por 2 ou se não é divisível por nenhum destes.
 */

fun main() {
    print("Digite um número: ")
    val numero = readlnOrNull()?.toIntOrNull() ?: 0
    if (numero % 10 == 0) {
        println("\nMúltiplo de 10")
    } else if (numero % 2 == 0) {
        println("\nMúltiplo de 2")
    } else if (numero % 5 == 0) {
        println("\nMúltiplo de 5")
    } else {
        println("\nNão é múltiplo de 2 nem de 5")
    }
}

/*
 *Teste de Execução no Terminal
 * Digite um número: 25
 * 
 * Múltiplo de 5
 */
