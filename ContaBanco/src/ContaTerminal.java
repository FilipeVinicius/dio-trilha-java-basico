import java.util.Scanner;

public class ContaTerminal {
   public static void main(String[] args) {
    int numero;
    String agencia;
    String nome_cliente;
    double saldo;

    
    Scanner tcd = new Scanner(System.in);

    System.out.println("Olá! Por favor, digite o número da sua conta");
    numero = tcd.nextInt();

    System.out.println("Por favor, digite o número da sua agência");
    agencia = tcd.next();

    System.out.println("Por favor, digite o seu nome");
    nome_cliente = tcd.next();

    System.out.println("Por favor, digite o número do seu saldo");
    saldo = tcd.nextDouble();

    System.out.println("Olá " + nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
     + agencia + ", conta " + numero + ", e seu saldo de " + saldo + " já está disponível para saque.");
   }
}
