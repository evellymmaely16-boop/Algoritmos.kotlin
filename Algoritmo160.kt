/**
 * Algoritmo 160
 * Objetivo: Entrar com o valor de x e imprimir f(x) definido por partes:
 * 1 (x <= 1); 2 (1 < x <= 2); x^2 (2 < x <= 3); x^3 (x > 3).
 */

import kotlin.math.pow

fun main() {
    print("Digite o valor de x: ")
    val x = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    val y = when {
        x <= 1.0 -> 1.0
        x <= 2.0 -> 2.0
        x <= 3.0 -> x.pow(2)
        else -> x.pow(3)
    }

    println("\nValor de f(x): $y")
}

/*
 * Exemplo de Execução no Terminal 
 * Digite o valor de x: 2.5
 * 
 * Valor de f(x): 6.25
 */
