/**
 * Algoritmo 112
 * Objetivo: Entrar com dois números e imprimir o menor número.
 */

fun main() {
    print("Digite o 1º número: ")
    val a = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    print("Digite o 2º número: ")
    val b = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    if (a < b) {
        println("\nMenor: $a")
    } else {
        println("\nMenor: $b")
    }
}

/*
 * Teste de Execução no Terminal 
 * Digite o 1º número: 7
 * Digite o 2º número: 3
 * 
 * Menor: 3.0
 */
