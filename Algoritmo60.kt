/**Algoritmo 60
 * Objetivo: Entrar com a razão de uma PA e o valor do 1º termo. 
 * Calcular e imprimir o 10º termo da sério.
 */

fun main() {
    print("Entrar com o 1º termo: ")
    val termo = readlnOrNull()?.toIntOrNull() ?: 0
    print("Entrar com a razão: ")
    val razao = readlnOrNull()?.toIntOrNull() ?: 0
    // O 10º termo de uma PA é calculado por: a10 = a1 + 9*r
    val dec = termo + 9 * razao
    println("\nO 10º termo desta P.A. é: $dec")
}

/**Teste de Execução no Terminal 
 * Entrar com o 1º termo: 2
 * Entrar com a razão: 5
 * 
 * O 10º termo desta P.A. é: 47
 */
