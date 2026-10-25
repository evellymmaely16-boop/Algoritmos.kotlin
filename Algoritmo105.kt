/**
 * Algoritmo 105
 * Objetivo: Entrar com a sigla do estado de uma pessoa e imprimir uma das mensagens:
 * carioca, paulista, mineiro ou outros estados.
 */

fun main() {
    print("Digite a sigla do estado: ")
    val sigla = readlnOrNull() ?: ""
    when (sigla.uppercase()) {
        "RJ" -> println("\nCarioca")
        "SP" -> println("\nPaulista")
        "MG" -> println("\nMineiro")
        else -> println("\nOutros estados")
    }
}

/*
 * Teste de Execução no Terminal 
 * Digite a sigla do estado: PA
 * 
 * Outros estados
 */
