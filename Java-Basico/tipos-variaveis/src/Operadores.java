public class Operadores {
    public static void main (String[] args) {
        int numero = 5;

        numero = - numero;

        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);

        //Repetição

        int numeroRepetir = 5;
        numeroRepetir = numeroRepetir + 2;

        //Incrementar é sobre a recorência de atribuição de um mesmo valor.
        System.out.println(numeroRepetir);

        //Incrementar em 1
        numeroRepetir++;

        System.out.println(numeroRepetir);

        //Ordem de incrementação, depois de mostrar a variavel.
        System.out.println(numeroRepetir++);

        //Ordem de incrementação, antes de mostrar a variavel.
        System.out.println(++numeroRepetir);

        //Essas regras valem também para decrementações!!

        //Testes de boolean
        boolean variavel = true;

        //Inverter variaveis booleanas

        variavel = !variavel;

        System.out.println(variavel);

        //Operador Ternário
        int a, b;

        a = 5;
        b = 6;

        String resuString = a == b ? "Verdadeiro" : "Falso";

        System.out.println(resuString);

        int resuInt = a == b ? 1 : 0;

        System.out.println(resuInt);
    }
}
