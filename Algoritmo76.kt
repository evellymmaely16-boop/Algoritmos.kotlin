/**
 * Algoritmo 76
 * Objetivo: Ler um número entre 0 e 60 e imprimir o seu sucessor, sabendo 
 * que o sucessor de 60 é 0 (sem comandos de seleção).
 */

fun main() {
    print("Digite um número (0 a 60): ")
    val num = readlnOrNull()?.toIntOrNull() ?: 0
    val sucessor = (num + 1) % 61
    println("\nSucessor: $sucessor")
}

/*
 *Teste de Execução no Terminal 
 * Digite um número (0 a 60): 60
 * 
 * Sucessor: 0
 */
