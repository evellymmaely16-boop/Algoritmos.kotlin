/**
 * Algoritmo 149
 * Objetivo: Calcular o valor de venda de um produto a partir do valor de compra, 
 * baseando-se numa margem de lucro escalonada.
 */

fun main() {
    print("Digite o nome do produto: ")
    val nomep = readlnOrNull() ?: ""
    
    print("Digite o valor da compra: ")
    val vcompra = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    val vvenda = when {
        vcompra < 10.0 -> vcompra * 1.70
        vcompra < 30.0 -> vcompra * 1.50
        vcompra < 50.0 -> vcompra * 1.40
        else -> vcompra * 1.30
    }

    println("\n$nomep será vendido por R$ ${String.format("%.2f", vvenda)}")
}

/*
 * Exemplo de Execução no Terminal 
 * Digite o nome do produto: Caderno
 * Digite o valor da compra: 15.0
 * 
 * Caderno será vendido por R$ 22.50
 */
