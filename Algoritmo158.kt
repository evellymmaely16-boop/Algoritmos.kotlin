/**
 * Algoritmo 158
 * Objetivo: Entrar com o valor de x, calcular e imprimir f(x) = 8 / (2 - x).
 * Verificar divisão por zero
 */

fun main() {
    print("Digite o valor de x: ")
    val x = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    if (x != 2.0) {
        val fx = 8.0 / (2.0 - x)
        println("\nf(x) = $fx")
    } else {
        println("\nNÃO PODE SER FEITA")
    }
}

/*
 * Exemplo de Execução no Terminal 
 * Digite o valor de x: 0
 * 
 * f(x) = 4.0
 */
