/**Algoritmo 73
 * Objetivo: Receber um número real, calcular e imprimir a parte inteira, 
 * a parte fracionária e o número arredondado.
 */

import kotlin.math.roundToInt

fun main() {
    print("Entre com um número com parte fracionária: ")
    val num = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    val numi = num.toInt()
    val numfrac = num - numi
    val numa = num.roundToInt()
    println("\nParte inteira: $numi")
    println("Parte fracionária: " + String.format("%.3f", numfrac))
    println("Número arredondado: $numa")
}

/*
 * Teste de Execução no Terminal ---
 * Entre com um número com parte fracionária: 7.1
 * 
 * Parte inteira: 7
 * Parte fracionária: 0.100
 * Número arredondado: 7
 */
