/**
 * Algoritmo 43
 * Objetivo: Entrar com um número e imprimir o logaritmo desse número na base 10[cite: 48, 49].
 */

import kotlin.math.log10
fun main() {
    print("Entre com o logaritmando: ")
    val num = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    if (num > 0) {
        val logaritmo = log10(num)
        println("Logaritmo: $logaritmo")
    } else {
        println("Logaritmando deve ser maior que zero.")
    }
}

/** Teste de Execução no Terminal ---
 * Entre com o logaritmando: 100
 * Logaritmo: 2.0
 */
