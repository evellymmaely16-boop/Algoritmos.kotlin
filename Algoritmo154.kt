/**
 * Algoritmo 154
 * Objetivo: A partir da leitura da placa do carro, informar o mês em que 
 * o emplacamento deve ser renovado (baseado no último número).
 */

fun main() {
    print("Digite a placa: ")
    val placa = readlnOrNull()?.trim() ?: ""

    val p = placa.lastOrNull()

    when (p) {
        '1' -> println("\nJaneiro")
        '2' -> println("\nFevereiro")
        '3' -> println("\nMarço")
        '4' -> println("\nAbril")
        '5' -> println("\nMaio")
        '6' -> println("\nJunho")
        '7' -> println("\nJulho")
        '8' -> println("\nAgosto")
        '9' -> println("\nSetembro")
        '0' -> println("\nOutubro")
        else -> println("\nOpção inválida")
    }
}

/*
 * Exemplo de Execução no Terminal 
 * Digite a placa: ABC-1234
 * 
 * Abril
 */
