/**
 * Algoritmo 139
 * Objetivo: Ler o nome do município, a quantidade de eleitores aptos e o número 
 * de votos do candidato mais votado para informar se haverá segundo turno.
 */

fun main() {
    print("Digite o nome do Município: ")
    val nome = readlnOrNull() ?: ""
    
    print("Número de eleitores aptos: ")
    val ne = readlnOrNull()?.toIntOrNull() ?: 0
    
    print("Número de votos do candidato mais votado: ")
    val votos = readlnOrNull()?.toIntOrNull() ?: 0

    if (ne > 20000 && votos <= (ne / 2)) {
        println("\n$nome terá segundo turno")
    } else {
        println("\n$nome não terá segundo turno")
    }
}

/*
 *Exemplo de Execução no Terminal 
 * Digite o nome do Município: Manaus
 * Número de eleitores aptos: 50000
 * Número de votos do candidato mais votado: 20000
 * 
 * Manaus terá segundo turno
 */
