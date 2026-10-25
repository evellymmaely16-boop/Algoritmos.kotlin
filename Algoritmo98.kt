/**
 * Algoritmo 98
 * Objetivo: Ler o salário bruto e o valor da prestação, e informar se o empréstimo 
 * pode ou não ser concedido (prestação não pode ultrapassar 30% do salário bruto).
 */

fun main() {
    print("Digite o salário: ")
    val sb = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    print("Digite o valor da prestação: ")
    val vp = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    if (vp <= 0.3 * sb) {
        println("\nEmpréstimo concedido")
    } else {
        println("\nEmpréstimo negado")
    }
}

/*
 * Teste de Execução no Terminal 
 * Digite o salário: 1000
 * Digite o valor da prestação: 350
 * 
 * Empréstimo negado
 */
