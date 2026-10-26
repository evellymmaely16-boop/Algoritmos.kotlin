/**
 * Algoritmo 118
 * Objetivo: Entrar com três números e imprimi-los em ordem crescente.
 */

fun main() {
    print("Digite o 1º número: ")
    var a = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    print("Digite o 2º número: ")
    var b = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    print("Digite o 3º número: ")
    var c = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    var aux: Double
    if (a > b) { aux = a; a = b; b = aux }
    if (a > c) { aux = a; a = c; c = aux }
    if (b > c) { aux = b; b = c; c = aux }

    println("\nOrdem Crescente: $a, $b, $c")
}

/*
 * Teste de Execução no Terminal 
 * Digite o 1º número: 10
 * Digite o 2º número: 2
 * Digite o 3º número: 5
 * 
 * Ordem Crescente: 2.0, 5.0, 10.0
 */
