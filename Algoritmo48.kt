/**
 * Algoritmo 48
 * Objetivo: Sabendo-se que 100 quilowatts de energia custam 1/7 do salário mínimo, 
 * calcular o valor em reais de cada quilowatt, o valor a ser pago, e o novo valor 
 * com um desconto de 10%
 */

fun main() {
    print("Entre com o salário mínimo: ")
    val sm = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    print("Entre com a quantidade em quilowatt: ")
    val qtdade = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    val preco = sm / 700
    val vp = preco * qtdade
    val vd = vp * 0.9
    println("\nPreço do quilowatt: $preco")
    println("Valor a ser pago: $vp")
    println("Valor com desconto: $vd")
}

/**Teste de Execução no Terminal 
 * Entre com o salário mínimo: 1400
 * Entre com a quantidade em quilowatt: 150
 * 
 * Preço do quilowatt: 2.0
 * Valor a ser pago: 300.0
 * Valor com desconto: 270.0
 */
