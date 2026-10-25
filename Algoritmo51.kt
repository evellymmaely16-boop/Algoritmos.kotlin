/**Algoritmo 51
 * Objetivo: Entrar com o raio de um círculo e imprimir o perímetro e a área.
 */

import kotlin.math.PI
import kotlin.math.pow
fun main() {
    print("Digite o raio: ")
    val raio = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    val perimetro = 2 * PI * raio
    val area = PI * raio.pow(2)
    println("\nPerímetro: $perimetro")
    println("Área: $area")
}

/**Teste de Execução no Terminal
 * Digite o raio: 5
 * Perímetro: 31.41592653589793
 * Área: 78.53981633974483
 */
