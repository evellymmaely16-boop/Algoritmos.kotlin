/**
 * Algoritmo 137
 * Objetivo: Ler três valores (a, b, c) e efetuar o cálculo da equação do 
 * segundo grau, apresentando as raízes ou mensagens de erro correspondentes
 */

import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    print("Entre com valor de a: ")
    val a = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    
    print("Entre com valor de b: ")
    val b = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    
    print("Entre com valor de c: ")
    val c = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    if (a == 0.0) {
        println("\nNão é equação do 2º grau")
    } else {
        val d = b.pow(2) - (4 * a * c)
        
        if (d >= 0.0) {
            val raizD = sqrt(d)
            val x1 = (-b + raizD) / (2 * a)
            val x2 = (-b - raizD) / (2 * a)
            println("\nX1 = $x1 \t\t X2 = $x2")
        } else {
            println("\nNão há raízes reais")
        }
    }
}

/*
 * Exemplo de Execução no Terminal 
 * Entre com valor de a: 1
 * Entre com valor de b: -5
 * Entre com valor de c: 6
 * 
 * X1 = 3.0 		 X2 = 2.0
 */
