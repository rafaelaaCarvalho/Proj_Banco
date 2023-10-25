package banco;

public class Pessoa {
	
	private String nome;
	private int cpf;
	private int idade;
	private int saldo;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(int deposito) {
	 
		
		saldo = saldo + deposito;
	}
	
	
	public void saque (int saque) {
	if (saque <= saldo) {
		saldo = saldo - saque;
		System.out.println("Saque realizado com sucesso");
	}
		
	else {
		System.out.println("Saldo Insuficiente");
	}
	}
	
	
	
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + ", saldo=" + saldo + "]";
	}
	
	
	
	
	
}



