package conteudo1a5;

import java.util.Locale;

public class _05_SaidaDeDados {

    public static void main(String[] args) {

        //Classe que modifica a exibição de ponto flutuante de vírgula para ponto
        Locale.setDefault(Locale.US);

        //Como println o programa da uma quebra de linha
        System.out.println("Olá mundo");
        System.out.println("Olá boa noite");


        System.out.print("Olá! ");
        System.out.print("Sem quebra de linha.");

        //Escrever na tela o conteúdo de uma variável do tipo int
        int y = 32;
        System.out.println("O valor de y é: "+ y);


        //Escrever na tela o conteúdo de uma variável do tipo double
        double x = 10.35784;
        System.out.println("O valor de x é: "+ x);

        //Imprimindo com a quantidade de casas decimais desejadas
        //Printf = imprimir um dado formatado
        //%.2f é um padrão da liguagem para definir formatação de casas decimais
        //%n é um padrão utilizado no printf para quebrar a linha
        System.out.printf("O valor de x é:  %.2f%n", x);
        System.out.printf("O valor de x é:  %.3f%n", x);

        /**
         * Para concatenar vários elementos utilizando o println, utilizamos o operador " + "
         */
        System.out.println("Resutado = " + x + " Metros" );


        /**
         * Para concatenar vários elementos utilizando o printlf, informamos os texto e os marcadores onde queremos que
         * entrem os valores das variáveis;
         * Em seguida,devemos colocar as variáveis na mesma ordem em que elas foram marcadas
         */
        System.out.printf("Resultado = %.2f metros %n", x);

        String nome = "Flávio";
        int idade = 30;
        double renda = 5000.0;

        System.out.printf("%s tem %d anos e ganha R$%.2f reais%n", nome, idade, renda);
        System.out.printf(nome + " tem " + idade + " anos e ganha R$" + renda + " reais");

    }
}
