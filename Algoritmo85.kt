/**
 * Algoritmo 85
 * Objetivo: Ler 3 números, armazenar o maior número na variável max e imprimi-lo 
 * (usando estruturas de decisão aninhadas).
 */

fun main() {
    print("Digite 1º número: ")
    val a = readlnOrNull()?.toDoubleOrNull() ?: 0.0 
    print("Digite 2º número: ")
    val b = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    print("Digite 3º número: ")
    val c = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    val max: Double

    if (a > b) {
        if (a > c) {
            max = a
        } else {
            max = c
        }
    } else {
        if (b > c) {
            max = b
        } else {
            max = c
        }
    }

    println("\nMaior número: $max")
}

/*
 * Teste de Execução no Terminal 
 * Digite 1º número: 10
 * Digite 2º número: 25
 * Digite 3º número: 15
 * 
 * Maior número: 25.0
 */
