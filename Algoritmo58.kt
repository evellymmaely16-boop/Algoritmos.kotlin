/**Algoritmo 58
 * Objetivo: Entrar com valores para xnum1, xnum2 e xnum3 e imprimir o valor de x, 
 * utilizando uma fórmula matemática que envolve logaritmo
 */

import kotlin.math.log2

fun main() {
    print("Entrar com 1º valor (xnum1): ")
    val xnum1 = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    print("Entrar com 2º valor (xnum2): ")
    val xnum2 = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    print("Entrar com 3º valor (xnum3): ")
    val xnum3 = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    // log(64) na base 2 é o mesmo que log2(64.0)
    val x = xnum1 + (xnum2 / (xnum3 + xnum1)) + 2 * (xnum1 - xnum2) + log2(64.0)
    println("\nX = $x")
}

/**Teste de Execução no Terminal 
 * Entrar com 1º valor (xnum1): 2.0
 * Entrar com 2º valor (xnum2): 4.0
 * Entrar com 3º valor (xnum3): 6.0
 * 
 * X = 4.5
 */
