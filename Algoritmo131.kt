/**
 * Algoritmo 131
 * Objetivo: Ler o nome do aluno e indicar a sala de prova consoante 
 * a inicial do seu nome (A-K: 101, L-N: 102, O-Z: 103).
 */

fun main() {
    print("Digite o nome: ")
    val nome = readlnOrNull() ?: ""

    if (nome.isNotEmpty()) {
        val inicial = nome.first().uppercaseChar()

        when (inicial) {
            in 'A'..'K' -> println("\n$nome, sala: 101")
            in 'L'..'N' -> println("\n$nome, sala: 102")
            in 'O'..'Z' -> println("\n$nome, sala: 103")
            else -> println("\nNOME INVÁLIDO")
        }
    }
}

/*
 * Exemplo de Execução no Terminal 
 * Digite o nome: Evellim
 * 
 * Evellim, sala: 101
 */
