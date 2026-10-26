/**
 * Algoritmo 114
 * Objetivo: Entrar com dois números e imprimi-los em ordem decrescente.
 */

fun main() {
    print("Digite o 1º número: ")
    val a = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    print("Digite o 2º número: ")
    val b = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    if (a > b) {
        println("\n$a, $b")
    } else {
        println("\n$b, $a")
    }
}

/*
 * Teste de Execução no Terminal
 * Digite o 1º número: 4
 * Digite o 2º número: 9
 * 
 * 9.0, 4.0
 */
