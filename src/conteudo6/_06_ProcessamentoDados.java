package conteudo6;

public class _06_ProcessamentoDados {

    public static void main(String[] args) {

        int x, y;
        double resultado;

        x = 5;
        y = 2;
        resultado =  x / y;

        //Exemplo sem casting
        System.out.println(resultado);

        //Casting é a conversão explicita dos valores
        //Exemplo com casting
        resultado =  (double) x / y;
        System.out.println(resultado);

        //Outro exemplo
        double a = 5.0;
        int b = (int)a;
        System.out.println(b);

    }
}
