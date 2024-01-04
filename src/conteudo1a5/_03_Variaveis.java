package conteudo1a5;

public class _03_Variaveis {
    public static void main(String[] args) {

        /***
         * Tipo numéricos:
         * byte, tamanho 8 bits, valores -128 até 127, valor padrão 0;
         * short, tamanho 16 bits, valores -32768 até 32767, valor padrão 0;
         * int, tamanho 32 bits, valores -2147483648 até 2147483647, valor padrão 0;
         * long tamanho 64 bits, valores -9223372036854770000 até 9223372036854770000, valor padrão 0L;
         */

        //Declaraçao de variáveis do tipo byte
        byte torrent = 25;

        //Declaraçao de variáveis do tipo short
        short id = -32768;

        //Declaraçao de variáveis do tipo int
        int idade = 25; //Cria na memória uma porção alocada para essa variável

        //Declaraçao de variáveis do tipo long
        long cpf =  23465478909L;


        /***
         * Tipo numéricos com ponto flutuante:
         * float, tamanho 32 bits, valores -1,4024E-37 até 3,4028E+38, valor padrão 0.0f;
         * double, tamanho 64 bits, valores -4,94E-307 até 1,79E+308, valor padrão 0.0;
         */


        //Declaraçao de variáveis do tipo Float
        float codigoTransacao = 5.7f;

        //Declaraçao de variáveis do tipo double
        double altura = 1.68;


        /***
         * Tipo caractere unicode:
         * char, tamanho 16 bits, valores '\u0000' a 'uFFFF'
         */
        //Declaraçao de variáveis do tipo Char
        char sexo = 'F';


        /***
         * Tipo caractere unicode:
         * boolean, tamanho 1 bit, valores true ou false
         */
        //Declaraçao de variáveis do tipo boolean
        boolean ehVerdade = true;

        //Declaraçao de variáveis do tipo String
        String nome = "Rafael";

        System.out.println("Variavel Tipo byte: " + torrent);
        System.out.println("Variavel Tipo short: " + id);
        System.out.println("Váriavel Tipo Int: "  + idade);
        System.out.println("Variavel Tipo long: "  + cpf);
        System.out.println("Variavel Tipo Float: "  + codigoTransacao);
        System.out.println("Variável Tipo Double: "  + altura);
        System.out.println("Variável Tipo char: "  + sexo);
        System.out.println("Variavel Tipo Boelano: "  + ehVerdade);
        System.out.println("Variavel Tipo String: "  + nome);


    }
}