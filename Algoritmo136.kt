/**
 * Algoritmo 136
 * Objetivo: Ler o nome e a idade de uma pessoa e imprimir o nome e 
 * o valor que ela deverá pagar pelo plano de saúde.
 */

fun main() {
    print("Entre com o nome: ")
    val nome = readlnOrNull() ?: ""
    
    print("Entre com a idade: ")
    val idade = readlnOrNull()?.toIntOrNull() ?: 0

    val valor = when {
        idade <= 10 -> 30.0
        idade <= 29 -> 60.0
        idade <= 45 -> 120.0
        idade <= 59 -> 150.0
        idade <= 65 -> 250.0
        else -> 400.0
    }

    println("\n$nome pagará R$ $valor")
}

/*
 * --- Exemplo de Execução no Terminal ---
 * Entre com o nome: May
 * Entre com a idade: 25
 * 
 * Joana pagará R$ 60.0
 */
