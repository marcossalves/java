package contas;

public class PessoaFisica {

	public static void main(String[] args) {

		Conta cc1 = new Conta();
        cc1.cliente = "Leandro Ramos";
        cc1.saldo = 10000;
        System.out.println(" Cliente: " + cc1.cliente);
        cc1.exibirSaldo();
        cc1.sacar(1000);
        cc1.exibirSaldo();
        System.out.println("-----------------------------");
		Conta cc2 = new Conta();
		
        cc2.cliente = "Robson vaamonde";
        cc2.saldo = 8500;
        System.out.println(" Cliente: " + cc2.cliente);
        cc2.exibirSaldo();
        cc2.depositar(5000);
        cc2.exibirSaldo();
        System.out.println("-----------------------------");
        System.out.println("Transfer�ncia");
        System.out.println("Cliente: " + cc1.cliente);
        System.out.println("Favorecido: " + cc2.cliente);
        cc1.transferir(cc2, 2000);
       System.out.println("");
       System.out.println();
       System.out.println("Cliente: " + cc1.cliente);
	  cc1.exibirSaldo();
	  System.out.println("Cliente: " + cc2.cliente);
	  cc2.exibirSaldo();
      System.out.println("-----------------------------");
      System.out.println("Relat�rio gerencial");
      Conta gerente = new Conta ();
      double relatorio = gerente.soma(cc1.saldo, cc2.saldo);
      System.out.println("Saldo Total nas contas:" + relatorio);
	}

}
