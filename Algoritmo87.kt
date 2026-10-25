/**
 * Algoritmo 87
 * Objetivo: Criar um algoritmo que permita ao aluno responder qual a capital do Brasil.
 */

fun main() {
    print("Qual a capital do Brasil? ")
    val resp = readlnOrNull() ?: ""
    if (resp == "BRASÍLIA" || resp == "Brasília") {
        println("\nPARABÉNS!")
    } else if (resp == "brasília" || resp == "Brazília" || resp == "brazília" || resp == "BRAZÍLIA") {
        println("\nCERTO! Mas atenção para a grafia: Brasília ou BRASÍLIA")
    } else {
        println("\nERRADO! ESTUDE MAIS!")
    }
}

/*
 *Teste de Execução no Terminal 
 * Qual a capital do Brasil? brazília
 * 
 * CERTO! Mas atenção para a grafia: Brasília ou BRASÍLIA
 */
