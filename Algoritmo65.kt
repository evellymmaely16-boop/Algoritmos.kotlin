/**Algoritmo 65
 * Objetivo: Calcular e apresentar o valor do volume de uma lata de óleo.
 */

import kotlin.math.PI
import kotlin.math.pow

fun main() {
    print("Digite a altura da lata: ")
    val altura = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    print("Digite o raio da lata: ")
    val raio = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    val volume = PI * raio.pow(2) * altura
    println("\nO volume da lata é = $volume")
}

/** Teste de Execução no Terminal 
 * Digite a altura da lata: 10
 * Digite o raio da lata: 5
 * 
 * O volume da lata é = 785.3981633974483
 */
