/**
 * Algoritmo 96
 * Objetivo: Entrar com um número e informar se ele é divisível por 3 e por 7.
 */

fun main() {
    print("Digite um número: ")
    val numero = readlnOrNull()?.toIntOrNull() ?: 0
    if (numero % 3 == 0 && numero % 7 == 0) {
        println("\nDivisível por 3 e por 7")
    } else {
        println("\nNão é divisível por 3 e por 7")
    }
}

/*
 * Teste de Execução no Terminal 
 * Digite um número: 21
 * 
 * Divisível por 3 e por 7
 */
