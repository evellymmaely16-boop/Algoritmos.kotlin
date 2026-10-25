/**
 * Algoritmo 99
 * Objetivo: Ler um número inteiro de 3 casas e imprimir se o algarismo da casa 
 * das centenas é par ou ímpar.
 */

fun main() {
    print("Número de 3 algarismos: ")
    val num = readlnOrNull()?.toIntOrNull() ?: 0
    val c = num / 100
    if (c % 2 == 0) {
        println("\nO algarismo das centenas é par: $c")
    } else {
        println("\nO algarismo das centenas é ímpar: $c")
    }
}

/*
 * Teste de Execução no Terminal 
 * Número de 3 algarismos: 456
 * 
 * O algarismo das centenas é par: 4
 */
