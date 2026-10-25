/** Algoritmo 26
Objetivo: Entrar com uma data no formato ddmmaa e imprimir no formato mmddaa.
*/

fun main() {
   print("Digite data no formato DDMMAA (ex: 251201): ")
   val data = readlnOrNull()?.toIntOrNull() ?: 0
   val dia = data / 10000
   val mes = (data % 10000) / 100
   val ano = data % 100
   val ndata = (mes * 10000) + (dia * 100) + ano
   println("DIA: $dia")
   println("MES: $mes")
   println("ANO: $ano")
   println("\nDATA NO FORMATO MMDDAA: $ndata")
}

/** Teste de execução no Terminal
* Digite data no formato DDMMAA (ex:251201):
* DIA: 25
* MES: 07
* ANO: 97
* DATA NO FORMATO MMDDAA: 072597
*/
