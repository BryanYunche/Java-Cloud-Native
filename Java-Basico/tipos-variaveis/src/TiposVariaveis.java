public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        //Tipos Primitivos
        //Forma de representar milhar usando double
        String meuNome = "Bryan Young";
        double salarioMinimo = 2500.33;
        byte idade = 123;
        short ano = 2025;
        int cep = 21070333; // Se o número começar com zero talvez seja necessário mudar o tipo de variável.
        long cpf = 98765432109L; // Se o número começar com zero talvez seja necessário mudar o tipo de variável. É preciso perceber que o tipo long precisa terminar com L pro java entender que é do tipo long.
        float pi = 3.14F;//encerrar com um F pois o Java pode indentificar como uma variaável do tipo double.

        //Exemplo de casting
        short numeroCurto = (short) cep;
    
        //Exemplo de constantes, convenção de ser escrita em caixa alta e usar underlines.
        final double VALOR_DE_PI = 3.14;
    }
}
