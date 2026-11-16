/**
 * Algoritmo 152
 * Objetivo: Calcular a dosagem de um medicamento em gotas a partir da idade 
 * e peso do paciente (500mg por ml, 1ml = 20 gotas = 25mg/gota).
 */

fun main() {
    print("Digite o peso (em kg): ")
    val peso = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    
    print("Digite a idade: ")
    val idade = readlnOrNull()?.toIntOrNull() ?: 0

    val mgPorGota = 500 / 20.0 // 25mg por gota

    if (peso < 5.0) {
        println("\nNão pode tomar o remédio porque não tem peso suficiente. Consulte o médico.")
    } else {
        val dosagemMg = if (idade >= 12) {
            if (peso >= 60.0) 1000.0 else 875.0
        } else {
            when {
                peso <= 9.0 -> 125.0
                peso <= 16.0 -> 250.0
                peso <= 24.0 -> 375.0
                peso <= 30.0 -> 500.0
                else -> 750.0
            }
        }

        val gotas = dosagemMg / mgPorGota
        println("\nTomar ${gotas.toInt()} gotas")
    }
}

/*
 * Exemplo de Execução no Terminal 
 * Digite o peso (em kg): 20
 * Digite a idade: 10
 * 
 * Tomar 15 gotas
 */
