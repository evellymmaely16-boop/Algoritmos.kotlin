/**
 * Algoritmo 91
 * Objetivo: Ler dois valores numéricos inteiros e efetuar a adição; 
 * caso o resultado seja maior que 10, apresentá-lo.
 */

fun main() {
    print("Digite 1º número: ")
    val num1 = readlnOrNull()?.toIntOrNull() ?: 0
    print("Digite 2º número: ")
    val num2 = readlnOrNull()?.toIntOrNull() ?: 0
    val soma = num1 + num2
    if (soma > 10) {
        println("\nSoma: $soma")
    }
}

/*
 * Teste de Execução no Terminal 
 * Digite 1º número: 7
 * Digite 2º número: 5
 * 
 * Soma: 12
 */
