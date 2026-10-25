/**Algoritmo 40
* Objetivo: Ler com dois números inteiros e imprimir a seguinte saída:
* dividendo:, divisor:, quociente:, resto:.
*/

fun main() {
   print("Entre com o dividendo: ")
   val dividendo = readlnOrNull()?.toIntOrNull() ?: 0
   print("Entre com o divisor: ")
   val divisor = readlnOrNull()?.toIntOrNull() ?: 1
   if (divisor != 0) {
       val quociente = dividendo / divisor
       val resto = dividendo % divisor
       println("\nDividendo : $dividendo")
       println("Divisor   : $divisor")
       println("Quociente : $quociente")
       println("Resto     : $resto")
   } else {
       println("Erro: O divisor não pode ser zero.")
   }
}

/**Teste de Execução no Terminal
* Entre com o dividendo: 10
* Entre com o divisor: 3
* Dividendo : 10
* Divisor   : 3
* Quociente : 3
* Resto     : 1
*/
