package contas;

public class Conta {
	//atributos
	public String cliente;
	public double saldo;
	
	//construtor
	public Conta () {
		System.out.println("Ag�ncia 0267");
		
	}
	
	// m�todos sem retornos
	public void exibirSaldo () {
		System.out.println("Saldo: R$ " + saldo);
		
	}
	
	// M�todo sem retorno com par�metros ( dados = v�riaveis)
 void sacar (double valor) { 
	 saldo -= valor; // saldo = saldo - valor
	 System.out.println("Debito:" + valor);
	 
	 
 }
 
 void depositar (double valor) { 
	 saldo += valor; // saldo = saldo + valor
	 System.out.println("Cr�dito:" + valor);
	 
	 
 }
 
 // m�todo sem retorno com objeto
 //Conta -> classe modelo
 //destino � o objeto
 void transferir (Conta destino, double valor) {
	 this.sacar (valor); // 1� voc� debita da conta
	 destino.depositar(valor); // 2� transfer�ncia
	 System.out.println("Transfer�ncia: " + valor);
 }
 
  // m�todo com retorno
 double soma (double conta1, double conta2) {
	double total = conta1 + conta2;
	return total;
 }
 
}
