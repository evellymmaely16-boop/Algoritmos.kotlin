/**Algoritmo 66
 * Objetivo: Efetuar o cálculo da quantidade de litros de combustível gastos 
 * em uma viagem, sabendo-se que o carro faz 12 km com um litro.
 */

fun main() {
    print("Digite o tempo gasto: ")
    val tempo = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    
    print("Digite a velocidade média: ")
    val vel = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    val dist = tempo * vel
    val litros = dist / 12
    println("\nVelocidade = $vel")
    println("Tempo = $tempo")
    println("Distância = $dist")
    println("Litros = $litros")
}

/**Teste de Execução no Terminal 
 * Digite o tempo gasto: 2
 * Digite a velocidade média: 90
 * 
 * Velocidade = 90.0
 * Tempo = 2.0
 * Distância = 180.0
 * Litros = 15.0
 */
