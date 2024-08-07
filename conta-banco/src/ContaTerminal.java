import java.util.Locale;
import java.util.Scanner;
/**
* <h1>Conta</h1>
* O projeto ContaBanco receberá dados via terminal contendo as características de conta em banco conforme atributos informados
* 
* <b>Note:</b> Leia atentamente a documentação desta classes
* para desfrutar dos recursos oferecidos pelo autor
*
* @author  Rodrigo Ferreira
* @version 1.0
* @since   07/08/2024
*/
public class ContaTerminal {
    /**
     * Classe principal do projeto
     */
    public static void main(String[] args) throws Exception {
        /**
         * Entrada de dados pelo usuário via terminal utilizando a classe Scanner
         * ao final impressão dos dados informados pelo usuário
         */


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
