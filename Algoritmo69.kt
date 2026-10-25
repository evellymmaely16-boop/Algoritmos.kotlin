/**
 * Algoritmo 69
 * Objetivo: Ler o numerador e o denominador de uma fração e transformá-lo 
 * em um número decimal.
 */

fun main() {
    print("Digite o numerador: ")
    val num = readlnOrNull()?.toIntOrNull() ?: 0
    print("Digite o denominador: ")
    val denom = readlnOrNull()?.toIntOrNull() ?: 1
    if (denom != 0) {
        val decimal = num.toDouble() / denom.toDouble()
        println("\nDecimal: $decimal")
    } else {
        println("\nErro: Divisão por zero.")
    }
}

/*
 *Teste de Execução no Terminal ---
 * Digite o numerador: 3
 * Digite o denominador: 4
 * 
 * Decimal: 0.75
 */
