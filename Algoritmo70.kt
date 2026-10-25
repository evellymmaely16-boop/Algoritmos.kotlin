/**
 * Algoritmo 70
 * Objetivo: Ler o valor gasto em um restaurante e imprimir o valor total 
 * com a gorjeta de 10%.
 */

fun main() {
    print("Entre com o valor da conta: ")
    val cres = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    val cgorj = cres * 1.1
    println("\nO valor da conta com a gorjeta será: $cgorj")
}

/*
 *Teste de Execução no Terminal 
 * Entre com o valor da conta: 150
 * 
 * O valor da conta com a gorjeta será: 165.0
 */
