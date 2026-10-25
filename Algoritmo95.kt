/**
 * Algoritmo 95
 * Objetivo: Entrar com um número e informar se ele é ou não divisível por 5.
 */

fun main() {
    print("Digite um número: ")
    val numero = readlnOrNull()?.toIntOrNull() ?: 0
    if (numero % 5 == 0) {
        println("\nÉ divisível por 5")
    } else {
        println("\nNão é divisível por 5")
    }
}

/** Teste de Execução no Terminal 
 * Digite um número: 12
 * 
 * Não é divisível por 5
 */
