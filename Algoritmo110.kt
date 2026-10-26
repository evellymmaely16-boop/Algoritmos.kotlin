/**
 * Algoritmo 110
 * Objetivo: Criar um algoritmo que leia dois números e imprima uma mensagem 
 * dizendo se são iguais ou diferentes.
 */

fun main() {
    print("Digite o 1º número: ")
    val a = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    print("Digite o 2º número: ")
    val b = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    if (a == b) {
        println("\nIguais")
    } else {
        println("\nDiferentes")
    }
}

/*
 * Teste de Execução no Terminal 
 * Digite o 1º número: 10
 * Digite o 2º número: 10.5
 * 
 * Diferentes
 */
