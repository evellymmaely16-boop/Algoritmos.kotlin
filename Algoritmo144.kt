/**
 * Algoritmo 144
 * Objetivo: Calcular e imprimir o crédito especial de um cliente baseado 
 * no seu saldo médio no último ano.
 */

fun main() {
    print("Digite o saldo médio: ")
    val saldoMedio = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    val credito: Double = when {
        saldoMedio <= 500.0 -> 0.0
        saldoMedio <= 1000.0 -> saldoMedio * 0.30
        saldoMedio <= 3000.0 -> saldoMedio * 0.40
        else -> saldoMedio * 0.50
    }

    if (credito > 0.0) {
        println("\nComo seu saldo era de R$ $saldoMedio, seu crédito será de R$ $credito")
    } else {
        println("\nComo seu saldo era de R$ $saldoMedio, você não terá nenhum crédito")
    }
}

/*
 * Exemplo de Execução no Terminal 
 * Digite o saldo médio: 1500
 * 
 * Como seu saldo era de R$ 1500.0, seu crédito será de R$ 600.0
 */
