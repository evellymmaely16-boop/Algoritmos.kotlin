/**
 * Algoritmo 116
 * Objetivo: Entrar com três números e imprimir o maior número 
 * (supondo números diferentes).
 */

fun main() {
    print("Digite o 1º número: ")
    val a = readlnOrNull()?.toDoubleOrNull() ?: 0.0  
    print("Digite o 2º número: ")
    val b = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    print("Digite o 3º número: ")
    val c = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    if (a > b && a > c) {
        println("\nMaior: $a")
    } else if (b > c) {
        println("\nMaior: $b")
    } else {
        println("\nMaior: $c")
    }
}

/*
 * Teste de Execução no Terminal 
 * Digite o 1º número: 12
 * Digite o 2º número: 25
 * Digite o 3º número: 8
 * 
 * Maior: 25.0
 */
