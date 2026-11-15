/**
 * Algoritmo 140
 * Objetivo: Ler o primeiro nome do cliente e o valor da conta. Se o nome 
 * iniciar com A, D, M ou S, aplicar 30% de desconto.
 */

fun main() {
    print("Digite o nome: ")
    val nome = readlnOrNull() ?: ""
    
    print("Digite o valor da conta: ")
    val vc = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    val inicial = nome.firstOrNull()?.uppercaseChar()

    if (inicial == 'A' || inicial == 'D' || inicial == 'M' || inicial == 'S') {
        val vcd = vc * 0.70
        println("\n$nome, valor da conta com desconto: R\$ ${String.format("%.2f", vcd)}")
    } else {
        println("\nQue pena. Nesta semana o desconto não é para o seu nome; mas continue nos prestigiando que sua vez chegará.")
    }
}

/*
 * Exemplo de Execução no Terminal 
 * Digite o nome: Mariana
 * Digite o valor da conta: 100
 * 
 * Mariana, valor da conta com desconto: R$ 70.00
 */
