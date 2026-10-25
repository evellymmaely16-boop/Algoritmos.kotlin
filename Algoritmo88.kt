/**
 * Algoritmo 88
 * Objetivo: Algoritmo Calculadora simples com menu de opções.
 */

fun main() {
    println("\n\n\t\t\t\t*************")
    println("\t\t\t\t*CALCULADORA*")
    println("\t\t\t\t*************")
    println("\n\t\t\t\t+ para somar")
    println("\n\t\t\t\t- para subtrair")
    println("\n\t\t\t\t* para multiplicar")
    println("\n\t\t\t\t/ para dividir")
    
    print("\n\n\t\t\t\tDigite opção: ")
    val resp = readlnOrNull() ?: ""

    if (resp in listOf("+", "-", "*", "/")) {
        print("\nDigite 1º número com ponto: ")
        val a = readlnOrNull()?.toDoubleOrNull() ?: 0.0
        
        print("Digite 2º número com ponto: ")
        val b = readlnOrNull()?.toDoubleOrNull() ?: 0.0

        when (resp) {
            "+" -> println("\nSOMA: ${a + b}")
            "-" -> println("\nSUBTRAÇÃO: ${a - b}")
            "*" -> println("\nMULTIPLICAÇÃO: ${a * b}")
            "/" -> {
                if (b != 0.0) println("\nDIVISÃO: ${a / b}")
                else println("\nERRO: Divisão por zero!")
            }
        }
    } else {
        println("\nOPÇÃO NÃO DISPONÍVEL!")
    }
}

/*
 * Teste de Execução no Terminal 
 * Digite opção: *
 * Digite 1º número com ponto: 23
 * Digite 2º número com ponto: 12
 * 
 * MULTIPLICAÇÃO: 276.0
 */
