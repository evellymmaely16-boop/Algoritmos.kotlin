/**
 * Algoritmo 45
 * Objetivo: Ler um número positivo, calcular e imprimir seu quadrado e sua raiz quadrada.
 */

import kotlin.math.sqrt
import kotlin.math.pow
fun main() {
    print("Digite número: ")
    val num = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    val quad = num.pow(2)
    val raizquad = if (num >= 0) sqrt(num).toString() else "Inexistente em IR"
    println("\nNúmero: $num")
    println("Quadrado: $quad")
    println("Raiz quadrada: $raizquad")
}

/**Teste de Execução no Terminal 
 * Digite número: 9
 *
 * Número: 9.0
 * Quadrado: 81.0
 * Raiz quadrada: 3.0
 */
