/**
 * Algoritmo 126
 * Objetivo: Ler um número e imprimir se ele é igual a 5, a 200, a 400, se está 
 * no intervalo entre 500 e 1000 inclusive, ou fora desses escopos.
 */

fun main() {
    print("Digite o valor de x: ")
    val x = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    when {
        x == 5.0 -> println("\nO número é 5")
        x == 200.0 -> println("\nO número é 200")
        x == 400.0 -> println("\nO número é 400")
        x in 500.0..1000.0 -> println("\nIntervalo 500-1000")
        else -> println("\nFora do escopo")
    }
}

/*
 * Exemplo de Execução no Terminal 
 * Digite o valor de x: 650
 * 
 * Intervalo 500-1000
 */

