/**
 * Algoritmo 90
 * Objetivo: Entrar com um número e imprimi-lo caso seja maior que 20.
 */

fun main() {
    print("Digite um número: ")
    val numero = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    if (numero > 20.0) {
        println("\n$numero")
    }
}

/*
 * Teste de Execução no Terminal 
 * Digite um número: 25.5
 * 
 * 25.5
 */
