/**
 * Algoritmo 130
 * Objetivo: Ler o valor de um produto e imprimir o valor de venda com um lucro 
 * de 45% se a compra for menor que R$ 20,00, ou 30% caso contrário.
 */

fun main() {
    print("Digite o valor do produto: ")
    val valor = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    val valorVenda = if (valor < 20.0) {
        valor * 1.45
    } else {
        valor * 1.30
    }

    // Usando formatação para mostrar duas casas decimais
    println("\nValor de venda: R$ ${String.format("%.2f", valorVenda)}")
}

/*
 * Exemplo de Execução no Terminal 
 * Digite o valor do produto: 15
 * 
 * Valor de venda: R$ 21,75
 */
