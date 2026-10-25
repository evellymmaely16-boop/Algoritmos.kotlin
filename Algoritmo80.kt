/**
 * Algoritmo 80
 * Objetivo: Ler quantidade de fitas, valor do aluguel e exibir o faturamento anual, 
 * multas mensais e a quantidade de fitas no final do ano.
 */

fun main() {
    print("Digite a quantidade de fitas: ")
    val quant = readlnOrNull()?.toIntOrNull() ?: 0
    
    print("Digite o valor do aluguel: ")
    val valAluguel = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    val fatAnual = (quant / 3.0) * valAluguel * 12
    val multas = valAluguel * 0.1 * ((quant / 3.0) / 10)
    val quantFinal = quant - (quant * 0.02) + (quant / 10.0)
    println("\nFaturamento anual: $fatAnual")
    println("Multas mensais: $multas")
    println("Quantidade de fitas no final do ano: $quantFinal")
}

/*
 * Teste de Execução no Terminal 
 * Digite a quantidade de fitas: 300
 * Digite o valor do aluguel: 5
 * 
 * Faturamento anual: 6000.0
 * Multas mensais: 5.0
 * Quantidade de fitas no final do ano: 324.0
 */
