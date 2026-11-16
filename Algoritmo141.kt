/**
 * Algoritmo 141
 * Objetivo: Ler o nome e os pontos de três finalistas e exibir a colocação 
 * de forma decrescente (Vencedor, Segundo colocado, Terceiro colocado).
 */

fun main() {
    print("Digite o 1º nome: ")
    var n1 = readlnOrNull() ?: ""
    print("Digite os pontos: ")
    var p1 = readlnOrNull()?.toIntOrNull() ?: 0
    
    print("Digite o 2º nome: ")
    var n2 = readlnOrNull() ?: ""
    print("Digite os pontos: ")
    var p2 = readlnOrNull()?.toIntOrNull() ?: 0
    
    print("Digite o 3º nome: ")
    var n3 = readlnOrNull() ?: ""
    print("Digite os pontos: ")
    var p3 = readlnOrNull()?.toIntOrNull() ?: 0

    // Ordenação decrescente simples utilizando variáveis auxiliares
    var auxP: Int
    var auxN: String

    if (p1 < p2) { auxP = p1; p1 = p2; p2 = auxP; auxN = n1; n1 = n2; n2 = auxN }
    if (p1 < p3) { auxP = p1; p1 = p3; p3 = auxP; auxN = n1; n1 = n3; n3 = auxN }
    if (p2 < p3) { auxP = p2; p2 = p3; p3 = auxP; auxN = n2; n2 = n3; n3 = auxN }

    println("\nVENCEDOR: $n1 - $p1 pontos")
    println("SEGUNDO COLOCADO: $n2 - $p2 pontos")
    println("TERCEIRO COLOCADO: $n3 - $p3 pontos")
}

/*
 * Exemplo de Execução no Terminal 
 * Digite o 1º nome: Emily
 * Digite os pontos: 50
 * Digite o 2º nome: May
 * Digite os pontos: 80
 * Digite o 3º nome: Camilly
 * Digite os pontos: 65
 * 
 * VENCEDOR: May - 80 pontos
 * SEGUNDO COLOCADO: Camilly - 65 pontos
 * TERCEIRO COLOCADO: Emily - 50 pontos
 */
