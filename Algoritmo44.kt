/**
 * Algoritmo 44
 * Objetivo: Ler um número e a base desejada, calculando o logaritmo do número nessa base.
 */

import kotlin.math.log

fun main() {
    print("Entre com o logaritmando: ")
    val num = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    print("Entre com a base: ")
    val base = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    if (num > 0 && base > 0 && base != 1.0) {
        val logaritmo = log(num, base)
        println("O logaritmo de $num na base $base é: $logaritmo")
    } else {
        println("Valores inválidos para cálculo de logaritmo.")
    }
}

/** Teste de Execução no Terminal 
 * Entre com o logaritmando: 8
 * Entre com a base: 2
 * O logaritmo de 8.0 na base 2.0 é: 3.0
 */
