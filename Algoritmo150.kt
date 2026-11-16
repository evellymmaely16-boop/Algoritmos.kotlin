/**
 * Algoritmo 150
 * Objetivo: Ler um ângulo em graus e apresentar o seno (se quadrante par) 
 * ou cosseno (se quadrante ímpar).
 */

import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin

fun main() {
    print("Digite o ângulo em graus: ")
    val ang = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    val rang = ang * PI / 180.0

    // Verifica se pertence ao 2º ou 4º quadrante (quadrantes pares)
    if ((rang > PI / 2 && rang <= PI) || (rang > 3 * PI / 2 && rang <= 2 * PI)) {
        println("\nSeno: ${sin(rang)}")
    } else {
        // 1º ou 3º quadrante (quadrantes ímpares)
        println("\nCo-seno: ${cos(rang)}")
    }
}

/*
 * Exemplo de Execução no Terminal 
 * Digite o ângulo em graus: 120
 * 
 * Seno: 0.8660254037844386
 */
