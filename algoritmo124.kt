/**
 * Algoritmo 124
 * Objetivo: Ler três números (possíveis lados de um triângulo) e imprimir a 
 * classificação segundo os ângulos (retângulo, obtusângulo, acutângulo)
 */

import kotlin.math.pow

fun main() {
    print("Digite 1º lado: ")
    val a = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    
    print("Digite 2º lado: ")
    val b = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    
    print("Digite 3º lado: ")
    val c = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    if (a < b + c && b < a + c && c < a + b) {
        val maior: Double
        val somaDosOutrosAoQuadrado: Double

        if (a > b && a > c) {
            maior = a.pow(2)
            somaDosOutrosAoQuadrado = b.pow(2) + c.pow(2)
        } else if (b > c) {
            maior = b.pow(2)
            somaDosOutrosAoQuadrado = a.pow(2) + c.pow(2)
        } else {
            maior = c.pow(2)
            somaDosOutrosAoQuadrado = a.pow(2) + b.pow(2)
        }

        if (maior == somaDosOutrosAoQuadrado) {
            println("\nTriângulo Retângulo")
        } else if (maior > somaDosOutrosAoQuadrado) {
            println("\nTriângulo Obtusângulo")
        } else {
            println("\nTriângulo Acutângulo")
        }
    } else {
        println("\nAs medidas não formam um triângulo")
    }
}

/*
 * Exemplo de Execução no Terminal 
 * Digite 1º lado: 3
 * Digite 2º lado: 4
 * Digite 3º lado: 5
 * 
 * Triângulo Retângulo
 */
