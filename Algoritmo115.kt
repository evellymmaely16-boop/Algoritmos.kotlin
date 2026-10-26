/**
 * Algoritmo 115
 * Objetivo: Entrar com dois números e imprimir o quadrado do menor número 
 * e a raiz quadrada do maior número, se for possível
 */

import kotlin.math.sqrt
import kotlin.math.pow

fun main() {
    print("Digite o valor de x: ")
    val x = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    print("Digite o valor de y: ")
    val y = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    if (x > y) {
        println("\nRaiz do maior: ${if (x >= 0) sqrt(x).toString() else "Inexistente em IR"}")
        println("Quadrado do menor: ${y.pow(2)}")
    } else if (y > x) {
        println("\nRaiz do maior: ${if (y >= 0) sqrt(y).toString() else "Inexistente em IR"}")
        println("Quadrado do menor: ${x.pow(2)}")
    } else {
        println("\nNúmeros iguais")
    }
}

/*
 * Teste de Execução no Terminal 
 * Digite o valor de x: 16
 * Digite o valor de y: 3
 * 
 * Raiz do maior: 4.0
 * Quadrado do menor: 9.0
 */
