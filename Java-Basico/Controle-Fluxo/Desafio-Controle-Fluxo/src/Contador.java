import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal  = new Scanner(System.in);

        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();

        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try {
            //Tentar executar o código
            contar(parametroUm, parametroDois);            
            
            
        } catch (ParametrosInvalidosException exception) {
            //Imprimir a mensagem: O segundo deve ser maior que o primeio
            System.out.println("O segundo deve ser maior!");
        }
        
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        //Validar se parametro um é menor que parametro dois
        if (parametroUm >= parametroDois)
            throw new ParametrosInvalidosException();

        int contagem = parametroDois - parametroUm;

        for(int x = 1; x <= contagem; x++ ){
            System.out.println("Imprimindo numero: " + x);
        }

    }

    
}
