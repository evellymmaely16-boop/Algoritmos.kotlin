/**
 * Algoritmo 156
 * Objetivo: Ler uma data (dia, mês e ano em separado) e imprimir se a 
 * data é válida ou não (contemplando anos bissextos).
 */

fun main() {
    print("Digite o dia: ")
    val dia = readlnOrNull()?.toIntOrNull() ?: 0
    print("Digite o mês: ")
    val mes = readlnOrNull()?.toIntOrNull() ?: 0
    print("Digite o ano: ")
    val ano = readlnOrNull()?.toIntOrNull() ?: 0

    var vd = 1

    if (ano < 1 || mes < 1 || mes > 12 || dia < 1 || dia > 31) {
        vd = 0
    } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
        vd = 0
    } else if (mes == 2) {
        // Verifica se é bissexto
        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            if (dia > 29) vd = 0
        } else {
            if (dia > 28) vd = 0
        }
    }

    if (vd == 0) {
        println("\nDATA INVÁLIDA")
    } else {
        println("\nDATA VÁLIDA")
    }
}

/*
 * Exemplo de Execução no Terminal 
 * Digite o dia: 29
 * Digite o mês: 2
 * Digite o ano: 2024
 * 
 * DATA VÁLIDA
 */
