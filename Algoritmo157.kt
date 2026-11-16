/**
 * Algoritmo 157
 * Objetivo: Ler uma data no formato ddmmaaaa (numa única variável) 
 * e imprimir se a data é válida ou não
 */

fun main() {
    print("Data no formato ddmmaaaa: ")
    val data = readlnOrNull()?.toLongOrNull() ?: 0L

    // Extração dos componentes
    val dia = (data / 1000000).toInt()
    val mes = ((data % 1000000) / 10000).toInt()
    val ano = (data % 10000).toInt()

    var vd = 1

    if (ano < 1 || mes < 1 || mes > 12 || dia < 1 || dia > 31) {
        vd = 0
    } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
        vd = 0
    } else if (mes == 2) {
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
 * Data no formato ddmmaaaa: 31042023
 * 
 * DATA INVÁLIDA
 */
