package banco;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa ps = new Pessoa();
		System.out.println("Digite o nome");
		ps.setNome(sc.next());
		System.out.println("Digite o cpf");
		ps.setCpf(sc.nextInt());
		System.out.println("Digite sua idade ");
		ps.setIdade(sc.nextInt());
		System.out.println("Digite seu saldo");
		ps.setSaldo(sc.nextInt());
		System.out.println("Digite o valor do deposito");
		ps.depositar(sc.nextInt());
		System.out.println("Digite o valor do saque");
		ps.saque(sc.nextInt());
		System.out.println(ps);

	}

}
