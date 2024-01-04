package conteudo1a5;

public class _02_ExpressoesAritmeticas {
    public static void main(String[] args) {

        //Declaraçao de variáveis do tipo int
        int num1 = 20;
        int num2 = 10;
        int resultadoSoma, resultadoMultiplicacao, resultadoSubtracao, resultadoDivisao, resultadoResto;

        resultadoSoma = num1 + num2;
        resultadoMultiplicacao = num1 * num2;
        resultadoSubtracao = num1 - num2;
        resultadoDivisao = num1 / num2;
        resultadoResto = num1 % num2;

        //Exibição de dados no console com operação soma
        System.out.println("Operaçao Soma: " + resultadoSoma);

        //Exibição de dados no console com operação multiplicação
        System.out.println("Operaçao multiplicação: "+ resultadoMultiplicacao);

        //Exibição de dados no console com operação subtração
        System.out.println("Operaçao Subtração: "+ resultadoSubtracao);

        //Exibição de dados no console com operação divisão
        System.out.println("Operaçao divisão: "+ resultadoDivisao);

        //Exibição de dados no console com operação mode %
        System.out.println("Operaçao resto: " + resultadoResto);

    }
}