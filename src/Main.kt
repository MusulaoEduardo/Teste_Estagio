//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    /*
    ex1
        var indice1 = 13
        var soma: Int = 0
        var k: Int = 0
        while (k<indice1) {
            k += 1
            soma += k
        }
        println("soma: $soma")
    */

    /* ex2
    fun fibonacci(numero: Int): Boolean {
        var a = 0
        var b = 1
        var c: Int
        while (a < numero) {
            if (a == numero) return true
            c = a + b
            a = b
            b = c
        }
        if (a == numero) {
            println("O número $numero pertence à sequência de Fibonacci.")
        } else {
            println("O número $numero não pertence à sequência de Fibonacci.")
        }
        return false
    }

    print("Informe um número: ")
    val numero = readLine()!!.toInt()
    fibonacci(numero)
*/
    /*ex3
    a) 1, 3, 5, 7, 9

    b) 2, 4, 8, 16, 32, 64, 128

    c) 0, 1, 4, 9, 16, 25, 36, 49

    d) 4, 16, 36, 64, 100

    e) 1, 1, 2, 3, 5, 8, 13

    f) 2,10, 12, 16, 17, 18, 19, 200
*/

    /* ex4
        Ligue o interruptor 1 e deixe-o ligado por 10 minutos.
        Desligue o interruptor 1 e ligue o interruptor 2.
        Vá para a sala das lâmpadas .

        Se a lâmpada 1 estiver acesa e quente, o interruptor 1 a controla.
        Se a lâmpada 1 estiver acesa e fria, o interruptor 2 a controla.
        Se a lâmpada 1 estiver apagada, o interruptor 3 a controla.
        agora na lâmpada 2:
        Se estiver quente, o interruptor 1 a controla.
        Se estiver fria, o interruptor 2 a controla.
    */

    /* ex5
        val nome = "Eduardo Mus" // String original
        var textoInvertido = ""
        for (i in nome.length - 1 downTo 0) {
            textoInvertido += nome[i] // Adiciona cada caractere na ordem inversa
        }
        println("String original: $nome")
        println("String invertida: $textoInvertido")
    */

}