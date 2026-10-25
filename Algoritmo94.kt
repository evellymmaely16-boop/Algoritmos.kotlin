/**
 * Algoritmo 94
 * Objetivo: Entrar com um número e imprimir uma das mensagens: 
 * é múltiplo de 3 ou não é múltiplo de 3.
 */

fun main() {
    print("Digite um número: ")
    val numero = readlnOrNull()?.toIntOrNull() ?: 0
    if (numero % 3 == 0) {
        println("\nMúltiplo de 3")
    } else {
        println("\nNão é múltiplo de 3")
    }
}

/*
 * Teste de Execução no Terminal 
 * Digite um número: 9
 * 
 * Múltiplo de 3
 */
