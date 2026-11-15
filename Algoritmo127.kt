/**
 * Algoritmo 127
 * Objetivo: Entrar com nome, nota PR1 e PR2. Imprimir nome, média e 
 * status (Aprovado >= 7, Reprovado < 3, Prova Final os demais)
 */

fun main() {
    print("Digite o nome: ")
    val nome = readlnOrNull() ?: ""
    
    print("Digite a 1ª nota: ")
    val nota1 = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    
    print("Digite a 2ª nota: ")
    val nota2 = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    val media = (nota1 + nota2) / 2

    if (media >= 7.0) {
        println("\n$nome, Média: $media - Aprovado (AP)")
    } else if (media < 3.0) {
        println("\n$nome, Média: $media - Reprovado (RP)")
    } else {
        println("\n$nome, Média: $media - Prova Final (PF)")
    }
}

/*
 * Exemplo de Execução no Terminal 
 * Digite o nome: Marcos
 * Digite a 1ª nota: 5
 * Digite a 2ª nota: 6
 * 
 * Marcos, Média: 5.5 - Prova Final (PF)
 */
