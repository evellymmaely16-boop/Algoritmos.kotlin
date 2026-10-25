/** Algoritmo 50
 * Objetivo: Ler a base e a altura de um retângulo e imprimir o 
 * perímetro, área e a diagonal
 */

import kotlin.math.sqrt
import kotlin.math.pow

fun main() {
    print("Digite a base: ")
    val base = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    print("Digite a altura: ")
    val altura = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    val perimetro = 2 * (base + altura)
    val area = base * altura
    val diagonal = sqrt(base.pow(2) + altura.pow(2))

    println("\nPerímetro = $perimetro")
    println("Área = $area")
    println("Diagonal = $diagonal")
}

/** Teste de Execução no Terminal 
 * Digite a base: 3
 * Digite a altura: 4
 * 
 * Perímetro = 14.0
 * Área = 12.0
 * Diagonal = 5.0
 */
