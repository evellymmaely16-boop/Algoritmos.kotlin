/**
 * Algoritmo 134
 * Objetivo: Receber a idade de um nadador e imprimir a sua categoria 
 * (Infantil A/B, Juvenil A/B ou Sênior).
 */

fun main() {
    print("Entre com a idade: ")
    val idade = readlnOrNull()?.toIntOrNull() ?: 0

    when {
        idade < 5 -> println("\nNão existe categoria para essa idade")
        idade <= 7 -> println("\nCategoria Infantil A")
        idade <= 10 -> println("\nCategoria Infantil B")
        idade <= 13 -> println("\nCategoria Juvenil A")
        idade <= 17 -> println("\nCategoria Juvenil B")
        else -> println("\nCategoria Sênior")
    }
}

/*
 * Exemplo de Execução no Terminal 
 * Entre com a idade: 15
 * 
 * Categoria Juvenil B
 */
