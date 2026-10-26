/**
 * Algoritmo 107
 * Objetivo: Entrar com o nome de uma pessoa e só imprimi-lo se o prenome for JOSÉ.
 */

fun main() {
    print("Digite o nome: ")
    val nome = readlnOrNull() ?: ""

    // Verifica se é exatamente "JOSÉ" ou se começa com "JOSÉ "
    if (nome == "JOSÉ" || nome.take(5) == "JOSÉ ") {
        println("\n$nome")
    }
}

/*
 * --- Exemplo de Execução no Terminal ---
 * Digite o nome: JOSÉ CARLOS
 * 
 * JOSÉ CARLOS
 */
