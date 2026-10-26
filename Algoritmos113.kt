/**
 * Algoritmo 113
 * Objetivo: Entrar com dois números e imprimi-los em ordem crescente.
 */

fun main() {
    print("Digite o 1º número: ")
    val a = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    print("Digite o 2º número: ")
    val b = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    if (a < b) {
        println("\n$a, $b")
    } else {
        println("\n$b, $a")
    }
}

/*
 * Teste de Execução no Terminal 
 * Digite o 1º número: 10
 * Digite o 2º número: 5
 * 
 * 5.0, 10.0
 */
