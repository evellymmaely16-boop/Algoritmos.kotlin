/**
 * Algoritmo 142
 * Objetivo: Ler os pontos de 3 jogadores de uma equipa, mostrá-los em ordem 
 * decrescente e, se a soma for maior que 100, imprimir a média. Senão, desclassificar.
 */

fun main() {
    print("Digite os pontos do 1º jogador: ")
    var p1 = readlnOrNull()?.toIntOrNull() ?: 0
    
    print("Digite os pontos do 2º jogador: ")
    var p2 = readlnOrNull()?.toIntOrNull() ?: 0
    
    print("Digite os pontos do 3º jogador: ")
    var p3 = readlnOrNull()?.toIntOrNull() ?: 0

    // Ordenação decrescente
    var aux: Int
    if (p1 < p2) { aux = p1; p1 = p2; p2 = aux }
    if (p1 < p3) { aux = p1; p1 = p3; p3 = aux }
    if (p2 < p3) { aux = p2; p2 = p3; p3 = aux }

    println("\np1 = $p1 \np2 = $p2 \np3 = $p3")

    val soma = p1 + p2 + p3

    if (soma > 100) {
        val media = soma / 3.0
        println("\nMédia = ${String.format("%.2f", media)}")
    } else {
        println("\nEquipe desclassificada!")
    }
}

/*
 * Exemplo de Execução no Terminal 
 * Digite os pontos do 1º jogador: 30
 * Digite os pontos do 2º jogador: 50
 * Digite os pontos do 3º jogador: 40
 * 
 * p1 = 50 
 * p2 = 40 
 * p3 = 30
 * 
 * Média = 40.00
 */
