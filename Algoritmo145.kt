/**
 * Algoritmo 145
 * Objetivo: Ler o nome do livro, o tipo de usuário (professor ou aluno) 
 * e imprimir um recibo com o total de dias para devolução.
 */

fun main() {
    print("Digite o nome do livro: ")
    val livro = readlnOrNull() ?: ""
    
    print("Digite o tipo de usuário (professor / aluno): ")
    val tipo = readlnOrNull()?.trim()?.lowercase() ?: ""

    val dia = when (tipo) {
        "professor" -> 10
        "aluno" -> 3
        else -> 0
    }

    if (dia == 0) {
        println("\nTipo de usuário desconhecido")
    } else {
        println("\nNome do livro: $livro")
        println("Tipo de usuário: $tipo")
        println("Total de dias: $dia")
    }
}

/*
 * Exemplo de Execução no Terminal 
 * Digite o nome do livro: Algoritmos Estruturados
 * Digite o tipo de usuário (professor / aluno): Aluno
 * 
 * Nome do livro: Algoritmos Estruturados
 * Tipo de usuário: aluno
 * Total de dias: 3
 */
