/**
 * Algoritmo 155
 * Objetivo: Ler uma palavra. Se começar por L ou D, formar nova palavra com os 
 * dois primeiros e o último caractere; senão, remover apenas o primeiro.
 */

fun main() {
    print("Digite a palavra: ")
    val pal = readlnOrNull()?.trim() ?: ""

    if (pal.isNotEmpty()) {
        val letra = pal.first().lowercaseChar()

        val novaPalavra = if (letra == 'l' || letra == 'd') {
            if (pal.length >= 2) {
                pal.take(2) + pal.last()
            } else {
                pal
            }
        } else {
            pal.drop(1)
        }

        println("\nPalavra: $novaPalavra")
    }
}

/*
 * Exemplo de Execução no Terminal 
 * Digite a palavra: Laranja
 * 
 * Palavra: Laa
 */
