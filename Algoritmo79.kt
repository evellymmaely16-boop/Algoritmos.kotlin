/**
 * Algoritmo 79
 * Objetivo: Calcular o rendimento de uma aplicação constante a partir do 
 * valor da aplicação mensal, taxa e número de meses.
 */

import kotlin.math.pow

fun main() {
    print("Digite o valor da aplicação mensal: ")
    val p = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    print("Digite a taxa (0 a 1): ")
    val i = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    print("Digite o número de meses: ")
    val n = readlnOrNull()?.toIntOrNull() ?: 0
    val va = p * ((1 + i).pow(n) - 1) / i

    println("\nValor acumulado: $va")
}

/*
 * Teste de Execução no Terminal 
 * Digite o valor da aplicação mensal: 100
 * Digite a taxa (0 a 1): 0.01
 * Digite o número de meses: 12
 * 
 * Valor acumulado: 1268.2503013196977
 */
