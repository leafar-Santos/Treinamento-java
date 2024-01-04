package conteudo7a9;

import java.util.Locale;
import java.util.Scanner;

public class _07_EntradaDeDadosParte1 {

    public static void main(String[] args) {

        //Alterando o padrão de ponto flutuante de vírgula para ponto
        Locale.setDefault(Locale.US);

        //Criando o scanner e associando ele ao meu teclado para receber dados
        Scanner sc = new Scanner(System.in);


        //Recebendo dados de String do usuário (Obs.: O next Lê apenas uma palavra)
        System.out.println("Digite algo:");
        String x = sc.next();
        System.out.println("Você digitou: "+ x);

        //Recendo dados de número inteiro do usuário
        System.out.println("Digite um número inteiro:");
        int num1 = sc.nextInt();
        System.out.println("Você digitou: "+ num1);

        //Recendo dados de número com ponto flutuante
        System.out.println("Digite um número com ponto flutuante:");
        double num2 = sc.nextDouble();
        System.out.println("Você digitou: "+ num2);

        //Recendo dados de número com boleano
        System.out.println("Digite um valor booelano");
        boolean verdade = sc.nextBoolean();
        System.out.println("Você digitou: "+ verdade);

        //Recendo apenas um caractere
        System.out.println("Digite um caractere");
        char genero = sc.next().charAt(0);
        System.out.println("Você digitou: "+ genero);



        //Inseridno mais de um dado ao mesmo tempo
        String nome;
        int idade;
        double altura;
        System.out.println("Informe na sequência seu nome, sua idade e a sua altura: ");
        nome = sc.next();
        idade = sc.nextInt();
        altura = sc.nextDouble();

        System.out.println("Os dados digitados foram:\n" +
                "Nome: " + nome +
                "\nidade: " + idade +
                "\nAltura: " + altura
        );

        //Fechando o scanner ao finalizar e execução
        sc.close();


    }

}
