/**Algoritmo 61
 * Objetivo: Entrar com a razão de uma PG e o valor do 1º termo. 
 * Calcular e imprimir o 5º termo da série.
 */

import kotlin.math.pow

fun main() {
    print("Entre com o 1º termo: ")
    val termo = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    print("Entre com a razão: ")
    val razao = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    // O 5º termo de uma PG é calculado por: a5 = a1 * q^4
    val quinto = termo * razao.pow(4)

    println("\nO 5º termo desta P.G. é: $quinto")
}

/**Teste de Execução no Terminal 
 * Entre com o 1º termo: 3
 * Entre com a razão: 2
 * 
 * O 5º termo desta P.G. é: 48.0
 */
