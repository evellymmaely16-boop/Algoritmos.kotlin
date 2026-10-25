/** Algoritmo 63
 * Objetivo: Efetuar o cálculo do salário líquido de um professor. Os dados fornecidos 
 * serão: valor da hora-aula, número de aulas dadas no mês e percentual de desconto do INSS.
 */

fun main() {
    print("Horas trabalhadas (aulas dadas): ")
    val na = readlnOrNull()?.toIntOrNull() ?: 0
    print("Valor da hora-aula: ")
    val vha = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    print("Percentual de desconto (%): ")
    val pd = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    val sb = na * vha
    val td = (pd / 100) * sb
    val sl = sb - td
    println("\nSalário líquido: $sl")
}

/*
 * Teste de Execução no Terminal 
 * Horas trabalhadas (aulas dadas): 40
 * Valor da hora-aula: 50.0
 * Percentual de desconto (%): 10.0
 * 
 * Salário líquido: 1800.0
 */
