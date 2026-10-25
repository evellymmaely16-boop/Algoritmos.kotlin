/**
 * Algoritmo 42
 * Objetivo: Entrar com um ângulo em graus e imprimir: seno, co-seno, tangente, 
 * secante, co-secante e co-tangente deste ângulo.
 */

import kotlin.math.*
fun main() {
    print("Digite um ângulo em graus: ")
    val angulo = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    val rang = angulo * PI / 180
    println("Seno: ${sin(rang)}")
    println("Co-seno: ${cos(rang)}")
    println("Tangente: ${tan(rang)}")
    println("Co-secante: ${1 / sin(rang)}")
    println("Secante: ${1 / cos(rang)}")
    println("Cotangente: ${1 / tan(rang)}")
}

/*
 * Teste de Execução no Terminal
 * Digite um ângulo em graus: 45
 * Seno: 0.7071067811865475
 * Co-seno: 0.7071067811865476
 * Tangente: 0.9999999999999999
 * Co-secante: 1.414213562373095
 * Secante: 1.414213562373095
 * Cotangente: 1.0000000000000002
 */
