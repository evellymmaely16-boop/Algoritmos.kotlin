/**
 * Algoritmo 106
 * Objetivo: Entrar com um nome e imprimi-lo se o primeiro caractere for a 
 * letra A 

fun main() {
    print("Digite o nome: ")
    val nome = readlnOrNull() ?: ""
    if (nome.isNotEmpty() && nome.first().equals('A', ignoreCase = true)) {
        println("\n$nome")
    }
}

/*
 * Teste de Execução no Terminal 
 * Digite o nome: Ana
 * 
 * Ana
 */
