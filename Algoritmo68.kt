/**
 * Algoritmo 68
 * Objetivo: Ler dois valores para as variáveis A e B e efetuar a troca 
 * dos valores entre elas.
 */

fun main() {
    print("Digite o 1º número com ponto: ")
    var a = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    print("Digite o 2º número com ponto: ")
    var b = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    val aux = a
    a = b
    b = aux
    println("\nA = $a")
    println("B = $b")
}

/*
 * Teste de Execução no Terminal 
 * Digite o 1º número com ponto: 5.5
 * Digite o 2º número com ponto: 10.2
 * 
 * A = 10.2
 * B = 5.5
 */
