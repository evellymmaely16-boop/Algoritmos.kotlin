/**
 * Algoritmo 84
 * Objetivo: Ler um número e imprimir se ele é par ou ímpar.
 */

fun main() {
    print("Digite um número: ")
    val a = readlnOrNull()?.toIntOrNull() ?: 0
    if (a % 2 == 0) {
        println("\nPAR")
    } else {
        println("\nÍMPAR")
    }
}

/*
 * Teste de Execução no Terminal 
 * Digite um número: 24
 * 
 * PAR
 */
