package contas;

public class Conta {
	//atributos
	public String cliente;
	public double saldo;
	
	//construtor
	public Conta () {
		System.out.println("Agência 0267");
		
	}
	
	// métodos sem retornos
	public void exibirSaldo () {
		System.out.println("Saldo: R$ " + saldo);
		
	}
	
	// Método sem retorno com parâmetros ( dados = váriaveis)
 void sacar (double valor) { 
	 saldo -= valor; // saldo = saldo - valor
	 System.out.println("Debito:" + valor);
	 
	 
 }
 
 void depositar (double valor) { 
	 saldo += valor; // saldo = saldo + valor
	 System.out.println("Crédito:" + valor);
	 
	 
 }
 
 // método sem retorno com objeto
 //Conta -> classe modelo
 //destino é o objeto
 void transferir (Conta destino, double valor) {
	 this.sacar (valor); // 1° você debita da conta
	 destino.depositar(valor); // 2° transferência
	 System.out.println("Transferência: " + valor);
 }
 
  // método com retorno
 double soma (double conta1, double conta2) {
	double total = conta1 + conta2;
	return total;
 }
 
}
