/**
 * Algoritmo 146
 * Objetivo: Ler o percurso em quilômetros, o tipo do carro e informar o 
 * consumo estimado de combustível.
 */

fun main() {
    print("Digite o tipo de carro (A / B / C): ")
    val tipo = readlnOrNull()?.uppercase() ?: ""
    
    print("Digite o percurso em km: ")
    val percurso = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    val consumo = when (tipo) {
        "C" -> percurso / 12.0
        "B" -> percurso / 10.0 // Baseado no código fonte do livro (embora o enunciado dissesse 9)
        "A" -> percurso / 8.0
        else -> 0.0
    }

    if (consumo != 0.0) {
        println("\nConsumo estimado em litros: ${String.format("%.2f", consumo)}")
    } else {
        println("\nModelo inexistente")
    }
}

/*
 * Exemplo de Execução no Terminal 
 * Digite o tipo de carro (A / B / C): B
 * Digite o percurso em km: 100
 * 
 * Consumo estimado em litros: 10.00
 */
