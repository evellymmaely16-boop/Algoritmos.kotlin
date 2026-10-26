/**
 * Algoritmo 120
 * Objetivo: Entrar com três números e armazená-los em três variáveis com os 
 * seguintes nomes: maior, intermediário e menor.
 */

fun main() {
    print("Digite o 1º número: ")
    var a = readlnOrNull()?.toDoubleOrNull() ?: 0.0   
    print("Digite o 2º número: ")
    var b = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    print("Digite o 3º número: ")
    var c = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    var aux: Double
    // Ordenação crescente nas variáveis a, b, c
    if (a > b) { aux = a; a = b; b = aux }
    if (a > c) { aux = a; a = c; c = aux }
    if (b > c) { aux = b; b = c; c = aux }
    val menor = a
    val intermediario = b
    val maior = c
    println("\nMaior: $maior")
    println("Intermediário: $intermediario")
    println("Menor: $menor")
}

/*
 * Teste de Execução no Terminal 
 * Digite o 1º número: 8
 * Digite o 2º número: 3
 * Digite o 3º número: 22
 * 
 * Maior: 22.0
 * Intermediário: 8.0
 * Menor: 3.0
 */
