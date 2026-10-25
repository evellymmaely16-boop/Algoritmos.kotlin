/**
 * Algoritmo 93
 * Objetivo: Entrar com um número e imprimir a raiz quadrada caso ele seja 
 * positivo e o quadrado do número caso ele seja negativo.
 */

import kotlin.math.sqrt
import kotlin.math.pow

fun main() {
    print("Digite um número: ")
    val numero = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    if (numero > 0.0) {
        println("\nRaiz: ${sqrt(numero)}")
    } else if (numero < 0.0) {
        println("\nQuadrado: ${numero.pow(2)}")
    }
}

/*
 * Teste de Execução no Terminal 
 * Digite um número: -4
 * 
 * Quadrado: 16.0
 */
