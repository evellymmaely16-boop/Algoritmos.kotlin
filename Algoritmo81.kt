/**
 * Algoritmo 81
 * Objetivo: Dado um número de conta corrente com três dígitos, retornar o 
 * seu dígito verificador.
 */

fun main() {
    print("Digite conta de três dígitos: ")
    val conta = readlnOrNull()?.toIntOrNull() ?: 0
    val d1C = conta / 100
    val d2C = (conta % 100) / 10
    val d3C = conta % 10
    val inv = d3C * 100 + d2C * 10 + d1C
    val soma = conta + inv
    val d1S = (soma / 100) * 1
    val d2S = ((soma % 100) / 10) * 2
    val d3S = (soma % 10) * 3
    val digito = (d1S + d2S + d3S) % 10

    println("\nDígito verificador: $digito")
}

/*
 * Teste de Execução no Terminal 
 * Digite conta de três dígitos: 235
 * 
 * Dígito verificador: 0
 */
