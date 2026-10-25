/**
 * Algoritmo 77
 * Objetivo: Ler dois números reais e imprimir o quadrado da diferença do 
 * primeiro pelo segundo e a diferença dos quadrados.
 */

import kotlin.math.pow

fun main() {
    print("Digite 1º número: ")
    val a = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    print("Digite 2º número: ")
    val b = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    val d = (a - b).pow(2)
    val q = a.pow(2) - b.pow(2)

    println("\nO quadrado da diferença = $d")
    println("Diferença dos quadrados = $q")
}

/*
 * Teste de Execução no Terminal 
 * Digite 1º número: 5
 * Digite 2º número: 3
 * 
 * O quadrado da diferença = 4.0
 * Diferença dos quadrados = 16.0
 */
