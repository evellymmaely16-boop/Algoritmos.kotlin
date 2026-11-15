/**
 * Algoritmo 129
 * Objetivo: Entrar com o salário de uma pessoa e imprimir o desconto do INSS
 * consoante as faixas de valores estabelecidas.
 */

fun main() {
    print("Digite o salário: ")
    val salario = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    val desconto = when {
        salario <= 600.0 -> 0.0
        salario <= 1200.0 -> salario * 0.20
        salario <= 2000.0 -> salario * 0.25
        else -> salario * 0.30
    }

    println("\nDesconto: $desconto")
}

/*
 * Exemplo de Execução no Terminal 
 * Digite o salário: 1500
 * 
 * Desconto: 375.0
 */
