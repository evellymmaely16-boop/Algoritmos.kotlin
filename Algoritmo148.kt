/**
 * Algoritmo 148
 * Objetivo: Ler o destino do passageiro, se a viagem inclui retorno (ida e volta) 
 * e informar o preço da passagem.
 */

fun main() {
    print("Digite 1- Região Norte 2- Região Nordeste 3- Região Centro-Oeste 4- Região Sul: ")
    val op = readlnOrNull()?.toIntOrNull() ?: 0
    
    print("Digite 1- Ida 2- Ida e Volta: ")
    val iv = readlnOrNull()?.toIntOrNull() ?: 0

    when (op) {
        1 -> if (iv == 1) println("\nO valor da passagem de ida para R.Norte: R$ 500.00") 
             else println("\nO valor da passagem de ida-volta para R.Norte: R$ 900.00")
        2 -> if (iv == 1) println("\nO valor da passagem de ida para R.Nordeste: R$ 350.00") 
             else println("\nO valor da passagem de ida-volta para R.Nordeste: R$ 650.00")
        3 -> if (iv == 1) println("\nO valor da passagem de ida para R.C.Oeste: R$ 350.00") 
             else println("\nO valor da passagem de ida-volta para R.C.Oeste: R$ 600.00")
        4 -> if (iv == 1) println("\nO valor da passagem de ida para R.Sul: R$ 300.00") 
             else println("\nO valor da passagem de ida-volta para R.Sul: R$ 550.00")
        else -> println("\nOpção Inexistente")
    }
}

/*
 * Exemplo de Execução no Terminal 
 * Digite 1- Região Norte 2- Região Nordeste 3- Região Centro-Oeste 4- Região Sul: 2
 * Digite 1- Ida 2- Ida e Volta: 2
 * 
 * O valor da passagem de ida-volta para R.Nordeste: R$ 650.00
 */
