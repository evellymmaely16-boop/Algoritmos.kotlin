/**
 * Algoritmo 100
 * Objetivo: Ler um número inteiro de 4 casas e imprimir se é ou não múltiplo de 4 
 * o número formado pelos algarismos que estão nas casas das unidades de milhar e das centenas.
 */

fun main() {
    print("Número de 4 algarismos: ")
    val num = readlnOrNull()?.toIntOrNull() ?: 0
    val c = num / 100
    if (c % 4 == 0) {
        println("\nO número é múltiplo de 4: $c")
    } else {
        println("\nO número não é múltiplo de 4: $c")
    }
}

/*
 *Teste de Execução no Terminal 
 * Número de 4 algarismos: 1623
 * 
 * O número é múltiplo de 4: 16
 */
