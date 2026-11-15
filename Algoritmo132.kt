/**
 * Algoritmo 132
 * Objetivo: Converter uma quantia em reais para franco suíço (f), 
 * libra esterlina (l), dólar (d) ou marco alemão (m).
 */

fun main() {
    print("Digite o valor em reais a ser convertido: ")
    val r = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    print("Digite a moeda (f - franco suíço, l - libra, d - dólar, m - marco alemão): ")
    val moeda = readlnOrNull()?.lowercase() ?: ""

    when (moeda) {
        "f" -> {
            print("Digite o valor de um franco suíço em reais: ")
            val f = readlnOrNull()?.toDoubleOrNull() ?: 1.0
            println("\nTotal de francos suíços: ${r / f}")
        }
        "l" -> {
            print("Digite o valor de uma libra esterlina em reais: ")
            val l = readlnOrNull()?.toDoubleOrNull() ?: 1.0
            println("\nTotal de libras esterlinas: ${r / l}")
        }
        "d" -> {
            print("Digite o valor de um dólar em reais: ")
            val d = readlnOrNull()?.toDoubleOrNull() ?: 1.0
            println("\nTotal de dólares: ${r / d}")
        }
        "m" -> {
            print("Digite o valor de um marco alemão em reais: ")
            val m = readlnOrNull()?.toDoubleOrNull() ?: 1.0
            println("\nTotal de marcos alemães: ${r / m}")
        }
        else -> println("\nMoeda desconhecida")
    }
}

/*
 * Exemplo de Execução no Terminal 
 
 * Digite o valor em reais a ser convertido: 500
 * Digite a moeda (f - franco suíço, l - libra, d - dólar, m - marco alemão): d
 * Digite o valor de um dólar em reais: 5
 * 
 * Total de dólares: 100.0
 */
