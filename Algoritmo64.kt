/**Algoritmo 64
 * Objetivo: Ler uma temperatura em graus centígrados e apresentá-la convertida 
 * em graus Fahrenheit.
 */

fun main() {
    print("Digite o valor da temperatura em graus centígrados: ")
    val c = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    val f = (9 * c + 160) / 5
    println("\nO valor da temperatura em graus Fahrenheit é = $f")
}

/*
 * Teste de Execução no Terminal 
 * Digite o valor da temperatura em graus centígrados: 30
 * 
 * O valor da temperatura em graus Fahrenheit é = 86.0
 */
