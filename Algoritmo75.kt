/**
 * Algoritmo 75
 * Objetivo: Ler o peso de uma pessoa (só a parte inteira), calcular e imprimir 
 * o peso em gramas e o novo peso se engordar 12%.
 */

fun main() {
    print("Entre com seu peso (só a parte inteira): ")
    val peso = readlnOrNull()?.toIntOrNull() ?: 0
    val pesogramas = peso * 1000
    val novopeso = pesogramas * 1.12
    println("\nPeso em gramas: $pesogramas")
    println("Novo peso (+12%): $novopeso")
}

/*
 * Teste de Execução no Terminal 
 * Entre com seu peso (só a parte inteira): 70
 * 
 * Peso em gramas: 70000
 * Novo peso (+12%): 78400.0
 */
