/**
 * Algoritmo 122
 * Objetivo: Ler três números e imprimir se eles podem ou não ser lados de um triângulo.
 */

fun main() {
    print("Digite 1º lado: ")
    val a = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    
    print("Digite 2º lado: ")
    val b = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    
    print("Digite 3º lado: ")
    val c = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    if (a < b + c && b < a + c && c < a + b) {
        println("\nPodem ser lados de um triângulo")
    } else {
        println("\nNão podem ser lados de um triângulo")
    }
}

/*
 * Exemplo de Execução no Terminal
 * Digite 1º lado: 3
 * Digite 2º lado: 4
 * Digite 3º lado: 5
 * 
 * Podem ser lados de um triângulo
 */
