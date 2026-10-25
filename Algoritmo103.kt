/**
 * Algoritmo 103
 * Objetivo: Entrar com o ano de nascimento de uma pessoa e o ano atual. 
 * Imprimir a idade da pessoa, verificando se o ano de nascimento é válido.
 */

fun main() {
    print("Entre com ano atual: ")
    val anoa = readlnOrNull()?.toIntOrNull() ?: 0
    print("Entre com ano de nascimento: ")
    val anon = readlnOrNull()?.toIntOrNull() ?: 0
    if (anon > anoa) {
        println("\nAno de nascimento inválido")
    } else {
        val idade = anoa - anon
        println("\nIdade: $idade")
    }
}

/*
 * Teste de Execução no Terminal 
 * Entre com ano atual: 2026
 * Entre com ano de nascimento: 2001
 * 
 * Idade: 25
 */
