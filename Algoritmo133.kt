/**
 * Algoritmo 133
 * Objetivo: Receber a altura e o sexo de uma pessoa e calcular o seu peso ideal.
 */

fun main() {
    print("Entre com a altura (ex: 1.75): ")
    val h = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    
    print("Entre com o sexo (M/F): ")
    val sexo = readlnOrNull() ?: ""

    val pesoIdeal = if (sexo.equals("M", ignoreCase = true)) {
        72.7 * h - 58
    } else {
        62.1 * h - 44.7
    }

    println("\nSeu peso ideal é: $pesoIdeal")
}

/*
 * Exemplo de Execução no Terminal 
 
 * Entre com a altura (ex: 1.75): 1.80
 * Entre com o sexo (M/F): M
 * 
 * Seu peso ideal é: 72.86000000000001
 */
