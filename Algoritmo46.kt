/**
 * Algoritmo 46
 * Objetivo: Ler o saldo de uma aplicação e imprimir o novo saldo com reajuste de 1%.
 */

fun main() {
    print("Digite saldo: ")
    val saldo = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    val nsaldo = saldo * 1.01
    println("Novo saldo: $nsaldo")
}

/**Teste de Execução no Terminal 
 * Digite saldo: 1000
 * Novo saldo: 1010.0
 */
