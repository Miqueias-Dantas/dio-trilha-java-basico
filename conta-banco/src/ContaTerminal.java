import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite o seu nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o sua agência:");
        String agencia = scanner.nextLine();
        
        System.out.println("Digite o número da sua conta:");
        int conta = scanner.nextInt();
        
        
        System.out.println("Por favor, digite o seu saldo:");
        float saldo = scanner.nextFloat();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+conta+" e o seu saldo "+saldo+" já está a disponivel para saque");
        
        scanner.close();
    }
}
