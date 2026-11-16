/**
 * Algoritmo 159
 * Objetivo: Entrar com o valor de x, calcular e imprimir f(x) = (5x + 3) / sqrt(x^2 - 16).
 * Verificar domínio da função (radicando positivo e denominador não nulo).
 */

import kotlin.math.sqrt
import kotlin.math.pow

fun main() {
    print("Digite o valor de x: ")
    val x = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    // Para x^2 - 16 > 0, x tem de ser > 4 ou < -4
    if (x > 4.0 || x < -4.0) {
        val fx = (5 * x + 3) / sqrt(x.pow(2) - 16)
        println("\nf(x) = $fx")
    } else {
        println("\nNÃO PODE SER FEITA")
    }
}

/*
 * Exemplo de Execução no Terminal
 * Digite o valor de x: 5
 * 
 * f(x) = 9.333333333333334
 */
