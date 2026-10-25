/**
 * Algoritmo 72
 * Objetivo: Ler o valor de um depósito e o valor da taxa de juros. 
 * Calcular e imprimir o valor do rendimento e o valor total.
 */

fun main() {
    print("Entre com o depósito: ")
    val deposito = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    print("Entre com a taxa de juros (%): ")
    val taxa = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    val valor = deposito * (taxa / 100)
    val total = deposito + valor
    println("\nRendimentos: $valor")
    println("Total: $total")
}

/*
 *Teste de Execução no Terminal ---
 * Entre com o depósito: 500
 * Entre com a taxa de juros (%): 5
 * 
 * Rendimentos: 25.0
 * Total: 525.0
 */
