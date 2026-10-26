/**
 * Algoritmo 109
 * Objetivo: Criar um algoritmo que entre com dois nomes e os imprima em ordem alfabética
 */

fun main() {
    print("Digite o 1º nome: ")
    val nome1 = readlnOrNull() ?: ""
    print("Digite o 2º nome: ")
    val nome2 = readlnOrNull() ?: ""
    if (nome1 < nome2) {
        println("\n$nome1, $nome2")
    } else {
        println("\n$nome2, $nome1")
    }
}

/*
 * Teste de Execução no Terminal
 * Digite o 1º nome: Filipe
 * Digite o 2º nome: Evellim
 * 
 * Evellim, Filipe
 */
