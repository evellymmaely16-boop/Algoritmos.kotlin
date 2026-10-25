/** Algoritmo 25
* Objetivo: Entrar com uma data no formato ddmmaa e imprimir: dia, mês e ano separados.
*/
fun main() {
   print("Digite data no formato ddmmaa (ex:230389) ")
   val data = readlnOrNull()?.toIntOrNull() ?: 0
   val dia = data / 10000
   val mes = (data % 10000) / 100
   val ano = data % 100
   println("DIA: $dia")
   println("MES: $mes")
   println("ANO: $ano")
}
/**Teste de execução no Terminal
* Digite data no formato ddmmaa (ex:230389): 160701
* DIA: 16
* MES: 07
* ANO: 01
*/
