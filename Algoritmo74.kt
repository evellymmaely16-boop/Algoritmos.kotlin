/**
 * Algoritmo 74
 * Objetivo: Ler o valor do salário mínimo e o valor do salário de uma pessoa. 
 * Calcular e imprimir quantos salários mínimos ela ganha.
 */

fun main() {
    print("Entre com o salário mínimo: ")
    val salmin = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    print("Entre com o salário da pessoa: ")
    val salpe = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    val num = salpe / salmin
    println("\nA pessoa ganha $num salários mínimos")
}

/*
 *Teste de Execução no Terminal
 * Entre com o salário mínimo: 1000
 * Entre com o salário da pessoa: 3500
 * 
 * A pessoa ganha 3.5 salários mínimos
 */
