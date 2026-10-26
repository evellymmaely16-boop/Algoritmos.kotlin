/**
 * Algoritmo 108
 * Objetivo: Idem ao anterior, porém considerar variações de maiúsculas e minúsculas 
 * e com ou sem acento 
 */

fun main() {
    print("Digite o nome: ")
    val nome = readlnOrNull() ?: ""
    val prenome = nome.take(5).uppercase()
    val nomeUpper = nome.uppercase()
    if (prenome == "JOSÉ " || prenome == "JOSE " || nomeUpper == "JOSÉ" || nomeUpper == "JOSE") {
        println("\n$nome")
    }
}

/*
 * Teste de Execução no Terminal 
 * Digite o nome: josé almeida
 * 
 * josé almeida
 */
