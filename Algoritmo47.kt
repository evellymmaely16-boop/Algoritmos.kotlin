/**
 * Algoritmo 47
 * Objetivo: Ler um número no formao CDU e imprimi-lo invertido no formato UDC.
 */

fun main() {
    print("Entre com um número de 3 dígitos: ")
    val num = readlnOrNull()?.toIntOrNull() ?: 0
    val c = num / 100
    val d = (num % 100) / 10
    val u = num % 10
    val num1 = u * 100 + d * 10 + c
    println("Número: $num")
    println("Invertido: $num1")
}

/** Teste de Execução no Terminal
 * Entre com um número de 3 dígitos: 123
 * Número: 123
 * Invertido: 321
 */
