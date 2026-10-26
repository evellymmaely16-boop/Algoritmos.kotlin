/**
 * Algoritmo 111
 * Objetivo: Entrar com dois números e imprimir o maior número.
 */

fun main() {
    print("Digite o 1º número: ")
    val a = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    print("Digite o 2º número: ")
    val b = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    if (a > b) {
        println("\nMaior: $a")
    } else {
        println("\nMaior: $b")
    }
}

/*
 * Teste de Execução no Terminal 
 * Digite o 1º número: 8
 * Digite o 2º número: 15
 * 
 * Maior: 15.0
 */
