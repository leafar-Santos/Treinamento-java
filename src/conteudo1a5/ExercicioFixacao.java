package conteudo1a5;

import java.util.Locale;

public class ExercicioFixacao {

    public static void main(String[] args) {

        //Inicie as seguinte variaveis:

        String product1 = "computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char  gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double price3 = 53.234567;


        /**
         * Em seguida, usando os valores das variáveis, produza a seguinte saida na tela do console
         *
         * Produtos:
         * Computer, with price is $2100,00
         * Office desk, with price is $ 650,50
         *
         * Record: 30 years old, code 5290 and gender: F
         *
         * Measue with eigth decimal pleaces: 53,23456700
         * Rouded with tree decimal pleaces: 53,235
         * US decimal point: 53.235
         */


        System.out.println("Produtos:");
        System.out.printf("Computer, with price is %.2f%n", price1);
        System.out.printf("Office desk, with price is %.2f%n", price2);
        System.out.println();
        System.out.println("Record: " + age + " years old " + "code " + code + " and gender: " + gender);
        System.out.println();
        System.out.printf("Measue with eigth decimal pleaces: %.8f%n", price3);
        System.out.printf("Rouded with tree decimal pleaces: %.3f%n", price3);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", price3);

    }
}
