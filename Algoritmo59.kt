/**Algoritmo 59
 * Objetivo: Entrar com os valores dos catetos de um triângulo retângulo 
 * e imprimir a hipotenusa
 */

import kotlin.math.sqrt
import kotlin.math.pow

fun main() {
    print("Entrar com 1º cateto: ")
    val b = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    print("Entrar com 2º cateto: ")
    val c = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    val a = sqrt(b.pow(2) + c.pow(2))
    println("\nA hipotenusa é: $a")
}

/*
 * Teste de Execução no Terminal 
 * Entrar com 1º cateto: 3
 * Entrar com 2º cateto: 4
 * 
 * A hipotenusa é: 5.0
 */
