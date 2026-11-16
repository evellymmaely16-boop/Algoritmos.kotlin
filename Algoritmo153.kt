/**
 * Algoritmo 153
 * Objetivo: Ler o índice de poluição e emitir intimações para as indústrias 
 * suspenderem as atividades de acordo com os grupos.
 */

fun main() {
    print("Digite o índice de poluição: ")
    val indice = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    if (indice >= 0.5) {
        println("\nSuspender atividades das indústrias dos grupos 1, 2 e 3")
    } else if (indice >= 0.4) {
        println("\nSuspender atividades das indústrias dos grupos 1 e 2")
    } else if (indice >= 0.3) {
        println("\nSuspender atividades das indústrias do grupo 1")
    } else {
        println("\nÍndice de poluição aceitável para todos os grupos")
    }
}

/*
 * Exemplo de Execução no Terminal 
 * Digite o índice de poluição: 0.45
 * 
 * Suspender atividades das indústrias dos grupos 1 e 2
 */
