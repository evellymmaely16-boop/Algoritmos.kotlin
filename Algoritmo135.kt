/**
 * Algoritmo 135
 * Objetivo: Ler a idade de uma pessoa e informar a sua classe eleitoral.
 */

fun main() {
    print("Digite a idade: ")
    val idade = readlnOrNull()?.toIntOrNull() ?: 0

    if (idade < 16) {
        println("\nNão eleitor")
    } else if (idade > 65 || (idade in 16..17)) {
        println("\nEleitor facultativo")
    } else {
        println("\nEleitor obrigatório")
    }
}

/*
 * --- Exemplo de Execução no Terminal ---
 * Digite a idade: 17
 * 
 * Eleitor facultativo
 */
