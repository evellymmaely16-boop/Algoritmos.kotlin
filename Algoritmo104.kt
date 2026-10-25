/**
 * Algoritmo 104
 * Objetivo: Entrar com nome, sexo e idade de uma pessoa. Se for mulher e tiver 
 * menos que 25 anos, imprimir ACEITA. Caso contrário, NÃO ACEITA.
 */

fun main() {
    print("Digite o nome: ")
    val nome = readlnOrNull() ?: ""
    print("Digite o sexo (M/F): ")
    val sexo = readlnOrNull() ?: ""
    print("Digite a idade: ")
    val idade = readlnOrNull()?.toIntOrNull() ?: 0
    if ((sexo.equals("F", ignoreCase = true)) && idade < 25) {
        println("\n$nome: ACEITA")
    } else {
        println("\n$nome: NÃO ACEITA")
    }
}

/*
 * Teste de Execução no Terminal 
 * Digite o nome: Evellim
 * Digite o sexo (M/F): F
 * Digite a idade: 25
 * 
 * Evellim: NÃO ACEITA
 */
