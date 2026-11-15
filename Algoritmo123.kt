/**
 * Algoritmo 123
 * Objetivo: Ler três números (possíveis lados de um triângulo) e imprimir a 
 * classificação segundo os lados (equilátero, isósceles ou escaleno)
 */

fun main() {
    print("Digite 1º lado: ")
    val a = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    
    print("Digite 2º lado: ")
    val b = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    
    print("Digite 3º lado: ")
    val c = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    if (a < b + c && b < a + c && c < a + b) {
        if (a == b && a == c) {
            println("\nTriângulo Equilátero")
        } else if (a == b || a == c || b == c) {
            println("\nTriângulo Isósceles")
        } else {
            println("\nTriângulo Escaleno")
        }
    } else {
        println("\nAs medidas não formam um triângulo")
    }
}

/*
 * Exemplo de Execução no Terminal 
 * Digite 1º lado: 4
 * Digite 2º lado: 4
 * Digite 3º lado: 6
 * 
 * Triângulo Isósceles
 */
