/**
 * Algoritmo 86
 * Objetivo: Ler um número e imprimir se ele é positivo, negativo ou nulo.
 */

fun main() {
    print("Digite um número: ")
    val num = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    if (num > 0.0) {
        println("\nPOSITIVO")
    } else if (num < 0.0) {
        println("\nNEGATIVO")
    } else {
        println("\nNULO")
    }
}

/*
 *Teste de Execução no Terminal 
 * Digite um número: -12
 * 
 * NEGATIVO
 */
