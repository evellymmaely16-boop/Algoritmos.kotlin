/**
 * Algoritmo 117
 * Objetivo: Entrar com três números e armazenar o maior número na variável 
 * de nome maior .
 */

fun main() {
    print("Digite o 1º número: ")
    val a = readlnOrNull()?.toDoubleOrNull() ?: 0.0  
    print("Digite o 2º número: ")
    val b = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    print("Digite o 3º número: ")
    val c = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    var maior = a
    if (b > maior) {
        maior = b
    }
    if (c > maior) {
        maior = c
    }
    println("\nMaior: $maior")
}

/*
 * Teste de Execução no Terminal
 * Digite o 1º número: 3
 * Digite o 2º número: 1
 * Digite o 3º número: 9
 * 
 * Maior: 9.0
 */
