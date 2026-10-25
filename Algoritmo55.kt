/**Algoritmo 55
 * Objetivo: Criar um algoritmo que calcule e imprima a área de um losango
 */

fun main() {
    print("Medida da diagonal maior: ")
    val diagMaior = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    print("Medida da diagonal menor: ")
    val diagMenor = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    val area = (diagMaior * diagMenor) / 2
    println("\nÁrea = $area")
}

/*
 * Teste de Execução no Terminal 
 * Medida da diagonal maior: 8
 * Medida da diagonal menor: 6
 * Área = 24.0
 */
