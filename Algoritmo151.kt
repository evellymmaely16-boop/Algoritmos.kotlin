/**
 * Algoritmo 151
 * Objetivo: Calcular o Índice de Massa Corporal (IMC) e apresentar a 
 * respetiva faixa de risco do paciente.
 */

import kotlin.math.pow

fun main() {
    print("Digite o peso (em kg): ")
    val peso = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    
    print("Digite a altura (em metros, ex: 1.75): ")
    val altura = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    if (altura > 0) {
        val imc = peso / altura.pow(2)

        val classificacao = when {
            imc < 20.0 -> "abaixo do peso"
            imc <= 25.0 -> "normal"
            imc <= 30.0 -> "excesso de peso"
            imc <= 35.0 -> "obesidade"
            else -> "obesidade mórbida"
        }

        println("\nIMC: ${String.format("%.2f", imc)} - Classificação: $classificacao")
    } else {
        println("\nAltura inválida.")
    }
}

/*
 * Exemplo de Execução no Terminal 
 * Digite o peso (em kg): 85
 * Digite a altura (em metros, ex: 1.75): 1.80
 * 
 * IMC: 26.23 - Classificação: excesso de peso
 */
