/**Algoritmo 54
 * Objetivo: Criar um algoritmo que calcule e imprima a área de um triângulo*/

fun main() {
    print("Entre com a base do triângulo: ")
    val a = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    print("Entre com a altura do triângulo: ")
    val b = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    val area = (a * b) / 2
    println("\nÁrea: $area")
}

/**Teste de Execução no Terminal 
 * Entre com a base do triângulo: 10
 * Entre com a altura do triângulo: 5 
 * Área: 25.0
 */
