import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Por favor, digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Por favor, digite qual sua Agencia:  ");
		String agencia = sc.next();
		
		
		System.out.print("Por favor digite o numero da conta: ");
		int numero = sc.nextInt();
		
		System.out.print("Por favot, digite seu saldo: ");
		double saldo = sc.nextDouble();
		
		
		System.out.println("Ola " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta " + numero +" e seu saldo "+ saldo + " já está disponível para saque");
		
		
		sc.close();
		

	}

}
