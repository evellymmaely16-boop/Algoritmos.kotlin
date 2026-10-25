/**Algoritmo 67
 * Objetivo: Efetuar o cálculo do valor de uma prestação em atraso.
 */

fun main() {
    print("Digite o valor da prestação: ")
    val valor = readlnOrNull()?.toDoubleOrNull() ?: 0.0    
    print("Digite a taxa (%): ")
    val taxa = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    print("Digite o tempo (número de meses): ")
    val tempo = readlnOrNull()?.toIntOrNull() ?: 0
    val prest = valor + (valor * (taxa / 100) * tempo)
    println("\nO valor da prestação em atraso é = $prest")
}

/**Teste de Execução no Terminal 
 * Digite o valor da prestação: 100
 * Digite a taxa (%): 2
 * Digite o tempo (número de meses): 3
 * 
 * O valor da prestação em atraso é = 106.0
 */
