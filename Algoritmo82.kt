/**
 * Algoritmo 82
 * Objetivo: Ler um número e se ele for maior do que 20, então imprimir 
 * a metade do número.
 */

fun main() {
    print("Digite um número: ")
    val numero = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    if (numero > 20.0) {
        val met = numero / 2
        println("\nMetade: $met")
    }
}

/*
 * Teste de Execução no Terminal 
 * Digite um número: 40
 * 
 * Metade: 20.0
 */
