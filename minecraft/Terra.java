package minecraft;

public class Terra {

	public static void main(String[] args) {
		Bloco blocoTerra = new Bloco();
		blocoTerra.textura = "Terra";
		blocoTerra.resistencia = 1;
		System.out.println("Bloco: Terra");
		System.out.println("Textura: " + blocoTerra.textura);
		System.out.println("Resist�ncia: " + blocoTerra.resistencia);
		blocoTerra.minerar();
		System.out.println("_______________________________________");
	  
		//objeto 2
		Bloco blocoMadeira = new Bloco();
		blocoMadeira.textura = "Madeira";
		blocoMadeira.resistencia = 2;
		System.out.println("Bloco: Madeira");
		System.out.println("Textura: " + blocoMadeira.textura);
		System.out.println("Resist�ncia: " + blocoMadeira.resistencia);
		blocoMadeira.minerar();

		System.out.println("_______________________________________");
		
	

}

	}


