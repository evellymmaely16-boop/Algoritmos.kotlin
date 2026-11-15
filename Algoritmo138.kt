/**
 * Algoritmo 138
 * Objetivo: Ler um número inteiro entre 1 e 12 e escrever o mês correspondente. 
 * Caso esteja fora do intervalo, informar que o mês não existe.
 */

fun main() {
    print("Digite um número de 1 a 12: ")
    val num = readlnOrNull()?.toIntOrNull() ?: 0

    when (num) {
        1 -> println("\nJaneiro")
        2 -> println("\nFevereiro")
        3 -> println("\nMarço")
        4 -> println("\nAbril")
        5 -> println("\nMaio")
        6 -> println("\nJunho")
        7 -> println("\nJulho")
        8 -> println("\nAgosto")
        9 -> println("\nSetembro")
        10 -> println("\nOutubro")
        11 -> println("\nNovembro")
        12 -> println("\nDezembro")
        else -> println("\nNão existe mês correspondente a este número")
    }
}

/*
 * Exemplo de Execução no Terminal 
 * Digite um número de 1 a 12: 8
 * 
 * Agosto
 */
