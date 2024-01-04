package conteudo7a9;

import java.util.Locale;
import java.util.Scanner;

public class _08_EntradaDeDadosParte2 {

    public static void main(String[] args) {

        //Alterando o padrão de ponto flutuante de vírgula para ponto
        Locale.setDefault(Locale.US);

        //Criando o scanner e associando ele ao meu teclado para receber dados
        Scanner sc = new Scanner(System.in);


        //Recebendo dados de String do usuário e lendo a linha inteira(usamos o nextLine)
        System.out.println("Digite algo:");
        String nomeCompleto = sc.nextLine();
        System.out.println("Você digitou: "+ nomeCompleto);



        //Quebra de linha pendente
        /**
         * Quando você usa um comando de leitura diferete do nextLine() e dá alguma quebra de linha,
         * essa quebra de linha fica "pendente" na entrada padrão.
         * Se você fizer um nextLine(), aquela quebra de linha pendente será absorvida pelo nextLine().
         *Veja o exemplo abaixo
         */

        int x;
        String s1, s2,s3;

        x = sc.nextInt(); //Comando diferente do nextLine
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados digitados");

        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        /**
         * Solução: Fazerum nextLine()extra ants de fazer um nesxLine() do seu interesse.
         */
        /*
        x = sc.nextInt(); //Comando diferente do nextLine
        sc.nextLine();//nextLine()extra para ser consumido
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados digitados");

        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        */


        //Fechando o scanner ao finalizar e execução
        sc.close();


    }

}
