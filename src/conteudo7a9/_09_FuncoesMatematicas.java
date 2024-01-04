package conteudo7a9;

public class _09_FuncoesMatematicas {

    public static void main(String[] args) {

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double a,b,c;

        //Calcula a raiz quadrada de um número
        a = Math.sqrt(x);
        b = Math.sqrt(y);
        c = Math.sqrt(25.0);

        System.out.println("A raíz quadrada de "+ x + " = "+ a);
        System.out.println("A raíz quadrada de "+ y + " = "+ b);
        System.out.println("A raíz quadrada de 25.0"+ " = "+ c);

        //Potenciação
        a = Math.pow(x,y);
        b = Math.pow(y,2.0);
        c = Math.pow(5.0,2.0);

        System.out.println(x + " elevado a " + y + " = " + a);
        System.out.println(y + " elevado ao quadrado é: " + b);
        System.out.println("5 elevado ao quadrado é: " + c);


    }
}
