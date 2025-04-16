import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner =  new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para o nosso usuário e Obter pela scanner os valores digitados
        System.out.println("Digite o número da sua Conta: ");
        int numeroConta = scanner.nextInt(); 

        System.out.println("Digite a o número da sua Agência: ");
        String numeroAgencia = scanner.next();

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu saldo: ");
        double saldoCliente = scanner.nextDouble();

        //Exibir a mensagem conta criada

        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta "+ numeroConta+" e seu saldo "+ saldoCliente +" já está disponível para saque");

    }

}
