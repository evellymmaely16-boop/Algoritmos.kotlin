/**
 * Algoritmo 125
 * Objetivo: Entrar com a idade de uma pessoa e informar se é maior de idade, 
 * menor de idade ou maior de 65 anos.
 */

fun main() {
    print("Digite sua idade: ")
    val idade = readlnOrNull()?.toIntOrNull() ?: 0

    if (idade >= 65) {
        println("\nMaior de 65")
    } else if (idade >= 18) {
        println("\nMaior de idade")
    } else {
        println("\nMenor de idade")
    }
}

/*
 * Exemplo de Execução no Terminal
 * Digite sua idade: 70
 * 
 * Maior de 65
 */
