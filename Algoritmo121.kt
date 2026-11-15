/**Algoritmo 121
 * Objetivo: Efetuar a leitura de cinco números inteiros diferentes e identificar 
 * o maior e o menor valor
 */

fun main() {
    print("Digite 1º número: ")
    val n1 = readlnOrNull()?.toIntOrNull() ?: 0
    print("Digite 2º número: ")
    val n2 = readlnOrNull()?.toIntOrNull() ?: 0
    print("Digite 3º número: ")
    val n3 = readlnOrNull()?.toIntOrNull() ?: 0
    print("Digite 4º número: ")
    val n4 = readlnOrNull()?.toIntOrNull() ?: 0
    print("Digite 5º número: ")
    val n5 = readlnOrNull()?.toIntOrNull() ?: 0

    val numeros = listOf(n1, n2, n3, n4, n5)
    
    if (numeros.toSet().size == 5) {
        val maior = numeros.maxOrNull()
        val menor = numeros.minOrNull()
        
        println("\nMaior = $maior")
        println("Menor = $menor")
    } else {
        println("\nOs valores devem ser diferentes.")
    }
}

/*
 *  Exemplo de Execução no Terminal 
 * Digite 1º número: 10
 * Digite 2º número: 5
 * Digite 3º número: 20
 * Digite 4º número: 2
 * Digite 5º número: 8
 * 
 * Maior = 20
 * Menor = 2
 */
