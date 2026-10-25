/**
 * Algoritmo 101
 * Objetivo: Construir um algoritmo que indique se o número digitado está 
 * compreendido entre 20 e 90 ou não (exclusivo).
 */

fun main() {
    print("Digite um número: ")
    val num = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    if (num > 20.0 && num < 90.0) {
        println("\nO número está na faixa de 20 a 90, exclusive")
    } else {
        println("\nO número está fora da faixa de 20 a 90")
    }
}

/*
 * Teste de Execução no Terminal 
 * Digite um número: 45
 * 
 * O número está na faixa de 20 a 90, exclusive
 */
