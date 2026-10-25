/**Algoritmo 53
 * Objetivo: Entrar com os lados a, b, c de um paralelepípedo. Calcular e imprimir a diagonal
 */

import kotlin.math.sqrt
import kotlin.math.pow

fun main() {
    print("Entre com a base (a): ")
    val a = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    print("Entre com a altura (b): ")
    val b = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    print("Entre com a profundidade (c): ")
    val c = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    val diagonal = sqrt(a.pow(2) + b.pow(2) + c.pow(2))
    println("\nDiagonal: $diagonal")
}

/**Teste de Execução no Terminal 
 * Entre com a base (a): 2
 * Entre com a altura (b): 3
 * Entre com a profundidade (c): 6
 * Diagonal: 7.0
 */
