/**
 * Algoritmo 83
 * Objetivo: Ler um número e, se ele for positivo, imprimir seu inverso; 
 * caso contrário, imprimir o valor absoluto do número.
 */

import kotlin.math.abs

fun main() {
    print("Digite um número: ")
    val numero = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    if (numero > 0.0) {
        val inverso = 1 / numero
        println("\nInverso: $inverso")
    } else {
        val absoluto = abs(numero)
        println("\nAbsoluto: $absoluto")
    }
}

/*
 *Teste de Execução no Terminal 
 * Digite um número: -5
 * 
 * Absoluto: 5.0
 */
