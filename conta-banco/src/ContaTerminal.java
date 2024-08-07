import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //mensagem inicial
        System.out.println("Seja bem-vindo ao nosso banco!");
        
        //entrada do numero da conta
        System.out.println("Por favor, digite agora o número da sua conta: ");
        int numeroDaConta =  scanner.nextInt();
        
        //entrada do numero da agencia
        System.out.println("Por favor, digite agora o número da Agência. Exemplo: 000-0");
        String agencia = scanner.next();

        //entrada do nome do usuário
        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.next();

        //entrada do saldo da conta
        System.out.println("Digite o saldo da sua conta: ");
        double saldo = scanner.nextDouble();
        

        System.out.println("\"Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, \nsua agência é " + agencia + " ," +  "\nconta " + numeroDaConta + "\ne seu saldo " + saldo + " já está disponível para saque\".");

        
    }
}
