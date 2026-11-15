/**
 * Algoritmo 128
 * Objetivo: Entrar com um verbo no infinitivo e imprimir a conjugação a 
 * que ele pertence ou informar que não está no infinitivo.
 */

fun main() {
    print("Digite um verbo no infinitivo: ")
    val verbo = readlnOrNull()?.trim()?.lowercase() ?: ""

    if (verbo.endsWith("r")) {
        val penultimaLetra = verbo[verbo.length - 2]
        
        when (penultimaLetra) {
            'a' -> println("\n1ª conjugação")
            'e', 'o' -> println("\n2ª conjugação") // 'or' como 'pôr' (derivado de poer) 
            'i' -> println("\n3ª conjugação")
            else -> println("\nNão existe verbo com esta terminação antes do 'r'")
        }
    } else {
        println("\nNão é um verbo no infinitivo")
    }
}

/*
 * Exemplo de Execução no Terminal 
 * Digite um verbo no infinitivo: cantar
 * 
 * 1ª conjugação
 */
