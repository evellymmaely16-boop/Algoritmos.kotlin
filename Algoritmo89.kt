/**
 * Algoritmo 89
 * Objetivo: Ler um peso na Terra e o número de um planeta, e imprimir o valor 
 * do seu peso neste planeta de acordo com a gravidade relativa.
 */

fun main() {
    println("Planetas que podem ser analisados:")
    println("1 - Mercúrio")
    println("2 - Vênus")
    println("3 - Marte")
    println("4 - Júpiter")
    println("5 - Saturno")
    println("6 - Urano")
    
    print("Escolha o planeta a ser analisado: ")
    val op = readlnOrNull()?.toIntOrNull() ?: 0
    
    print("Entre com um peso na Terra: ")
    val pterra = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    // O comando "escolha" do UAL é perfeitamente substituído pelo "when" no Kotlin
    when (op) {
        1 -> println("\nSeu peso no planeta Mercúrio é: ${(pterra / 10) * 0.37}")
        2 -> println("\nSeu peso no planeta Vênus é: ${(pterra / 10) * 0.88}")
        3 -> println("\nSeu peso no planeta Marte é: ${(pterra / 10) * 0.38}")
        4 -> println("\nSeu peso no planeta Júpiter é: ${(pterra / 10) * 2.64}")
        5 -> println("\nSeu peso no planeta Saturno é: ${(pterra / 10) * 1.15}")
        6 -> println("\nSeu peso no planeta Urano é: ${(pterra / 10) * 1.17}")
        else -> println("\nEste planeta não pode ser analisado.")
    }
}

/*
 * --- Exemplo de Execução no Terminal ---
 * Escolha o planeta a ser analisado: 3
 * Entre com um peso na Terra: 70
 * 
 * Seu peso no planeta Marte é: 2.66
 */
