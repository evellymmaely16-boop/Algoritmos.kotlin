/**Algoritmo 52
 * Objetivo: Entrar com o lado de um quadrado e imprimir o perímetro, a área e a diagonal.
 */

import kotlin.math.sqrt
import kotlin.math.pow

fun main() {
    print("Digite o lado do quadrado: ")
    val lado = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    val perimetro = 4 * lado
    val area = lado.pow(2)
    val diagonal = lado * sqrt(2.0)
    println("\nPerímetro: $perimetro")
    println("Área: $area")
    println("Diagonal: $diagonal")
}

/** Teste de Execução no Terminal 
 * Digite o lado do quadrado: 5
 * Perímetro: 20.0
 * Área: 25.0
 * Diagonal: 7.0710678118654755
 */
