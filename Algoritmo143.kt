/**
 * Algoritmo 143
 * Objetivo: Verificar as letras centrais de uma palavra. Se for par, verificar 
 * se é "rr" ou "ss". Se for ímpar, verificar se a central é vogal.
 */

fun main() {
    print("Digite uma palavra: ")
    val pal = readlnOrNull()?.trim()?.lowercase() ?: ""

    val tamanho = pal.length

    if (tamanho % 2 == 0 && tamanho >= 2) {
        val n1 = tamanho / 2
        val n2 = n1 - 1
        
        val p1 = pal[n1]
        val p2 = pal[n2]
        val p3 = "$p2$p1"

        if (p3 == "rr" || p3 == "ss") {
            println("\nÉ 'rr' OU 'ss'")
        } else {
            println("\nNÃO É 'rr' OU 'ss'")
        }
    } else if (tamanho % 2 != 0 && tamanho >= 1) {
        val n1 = tamanho / 2 // Acesso direto ao índice central no Kotlin (0-based)
        val p1 = pal[n1]

        if (p1 == 'a' || p1 == 'e' || p1 == 'i' || p1 == 'o' || p1 == 'u') {
            println("\nÉ VOGAL")
        } else {
            println("\nNÃO É VOGAL")
        }
    }
}

/*
 * Exemplo de Execução no Terminal 
 * Digite uma palavra: carro
 * 
 * É VOGAL
 */
