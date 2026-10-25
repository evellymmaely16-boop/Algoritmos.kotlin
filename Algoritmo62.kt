/**Algoritmo 62
 * Objetivo: Entrar com o valor de um produto e imprimir o novo valor 
 * tendo em vista que o desconto foi de 9%.
 */

fun main() {
    print("Digite o valor do produto: ")
    val preco = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    val npreco = preco * 0.91
    println("\nPreço com desconto: $npreco")
}

/*
 *Teste de Execução no Terminal 
 * Digite o valor do produto: 100
 * 
 * Preço com desconto: 91.0
 */
