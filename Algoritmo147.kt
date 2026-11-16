/**
 * Algoritmo 147
 * Objetivo: Informar a quantidade total de calorias de uma refeição a partir 
 * da escolha do usuário (prato, sobremesa e bebida).
 */

fun main() {
    var calorias = 0

    print("Digite 1- Vegetariano 2- Peixe 3- Frango 4- Carne: ")
    val opPrato = readlnOrNull()?.toIntOrNull() ?: 0
    calorias += when (opPrato) {
        1 -> 180
        2 -> 230
        3 -> 250
        4 -> 350
        else -> 0
    }

    print("Digite 1- Abacaxi 2- Sorvete diet 3- Mousse diet 4- Mousse chocolate: ")
    val opSobremesa = readlnOrNull()?.toIntOrNull() ?: 0
    calorias += when (opSobremesa) {
        1 -> 75
        2 -> 110
        3 -> 170
        4 -> 200
        else -> 0
    }

    print("Digite 1- Chá 2- Suco de laranja 3- Suco de melão 4- Refrigerante diet: ")
    val opBebida = readlnOrNull()?.toIntOrNull() ?: 0
    calorias += when (opBebida) {
        1 -> 20
        2 -> 70
        3 -> 100
        4 -> 65
        else -> 0
    }

    println("\nTotal de calorias: $calorias")
}

/*
 * Exemplo de Execução no Terminal 
 * Digite 1- Vegetariano 2- Peixe 3- Frango 4- Carne: 3
 * Digite 1- Abacaxi 2- Sorvete diet 3- Mousse diet 4- Mousse chocolate: 2
 * Digite 1- Chá 2- Suco de laranja 3- Suco de melão 4- Refrigerante diet: 4
 * 
 * Total de calorias: 425
 */
