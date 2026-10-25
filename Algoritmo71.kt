/**
 * Algoritmo 71
 * Objetivo: Ler uma hora e os minutos e informar quantos minutos 
 * se passaram desde o início do dia.
 */

fun main() {
    print("Entre com a hora atual: ")
    val hora = readlnOrNull()?.toIntOrNull() ?: 0
    print("Entre com os minutos: ")
    val minuto = readlnOrNull()?.toIntOrNull() ?: 0
    val tminuto = hora * 60 + minuto
    println("\nAté agora passaram-se: $tminuto minutos")
}

/*
 * Teste de Execução no Terminal 
 * Entre com a hora atual: 14
 * Entre com os minutos: 30
 * 
 * Até agora passaram-se: 870 minutos
 */
