import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;
        
        System.out.println("Por favor, digite o número da conta: ");
        numeroConta = sc.nextInt();
        System.out.println("Por favor, digite o número da agência: ");
        sc.nextLine();
        agencia = sc.nextLine();
        System.out.println("Por favor, digite o seu nome: ");
        nomeCliente = sc.nextLine();
        System.out.println("Por favor, digite o saldo: ");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
        ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        sc.close();
    }
}
