/**
 * Algoritmo 92
 * Objetivo: Ler dois números e efetuar a adição. Caso o valor somado seja 
 * maior que 20, somar 8; caso seja menor ou igual a 20, subtrair 5.
 */

fun main() {
    print("Digite 1º número: ")
    val num1 = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    print("Digite 2º número: ")
    val num2 = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    val soma = num1 + num2
    if (soma > 20.0) {
        println("\nSoma: ${soma + 8}")
    } else {
        println("\nSoma: ${soma - 5}")
    }
}

/*
 * Teste de Execução no Terminal 
 * Digite 1º número: 12
 * Digite 2º número: 10
 * 
 * Soma: 30.0
 */
