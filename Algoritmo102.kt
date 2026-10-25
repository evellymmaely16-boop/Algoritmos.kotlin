/**
 * Algoritmo 102
 * Objetivo: Entrar com um número e imprimir uma das mensagens: maior do que 20, 
 * igual a 20 ou menor do que 20.
 */

fun main() {
    print("Digite um número: ")
    val numero = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    if (numero > 20.0) {
        println("\nMaior que 20")
    } else if (numero < 20.0) {
        println("\nMenor que 20")
    } else {
        println("\nIgual a 20")
    }
}

/*
 * Teste de Execução no Terminal 
 * Digite um número: 20
 * 
 * Igual a 20
 */
