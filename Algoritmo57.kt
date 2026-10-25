/**Algoritmo 57
 * Objetivo: Entrar com as notas da PR1 e PR2 e imprimir a média final:
 * truncada e arredondada
 */

import kotlin.math.roundToInt

fun main() {
    print("Digite PR1: ")
    val pr1 = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    print("Digite PR2: ")
    val pr2 = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    val mf = (pr1 + pr2) / 2
    // Em Kotlin, .toInt() trunca (corta as casas decimais) 
    // e .roundToInt() faz o arredondamento matemático tradicional
    val mediaTruncada = mf.toInt()
    val mediaArredondada = mf.roundToInt()
    println("\nMédia truncada = $mediaTruncada")
    println("Média arredondada = $mediaArredondada")
}

/**Teste de Execução no Terminal 
 * Digite PR1: 7.9
 * Digite PR2: 8.1
 * Média truncada = 8
 * Média arredondada = 8
 */
