
/**
 * @author Marcos Severino Alves
 * Calculo índice da massa corporal java
 *
 */

package exercicios;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Imc {

	public static void main(String[] args) {
		//<control><shift<f> (alinhamento)
		//variáveis
		double altura, peso, resultado1, resultado2, abaixodopeso , pesonormal, sobrepeso,obesidadegrau1, obesidadegrau2, obesidadegrau3;
        abaixodopeso   = 18.5;
        pesonormal     = 24.9;
        sobrepeso      = 29.9;
        obesidadegrau1 = 34.9;
        obesidadegrau2 = 39.9;
        obesidadegrau3 = 40.0;
        
		//objeto leitor (usado para capturar dados)
		Scanner leitor = new java.util.Scanner(System.in);
        //objeto formatador (usado para formatar o resultado)
		DecimalFormat formatador = new DecimalFormat ("0.0");
		System.out.println(" Marcos Severino Alves \r\n" + 
				"\r\n" + 
				" Calculo índice da massa corporal \r\n" + 
				"\r\n" + 
				"18,5	     = Abaixo do peso\r\n" + 
				"18,5 e 24,9  = Peso normal\r\n" + 
				"25   e 29,9  = Sobrepeso\r\n" + 
				"30   e 34,9  = Obesidade grau 1\r\n" + 
				"35   e 39,9  = Obesidade grau 2\r\n" + 
				"40	     = Obesidade grau 3"); 

       //Entrada
        System.out.print("Dígite a Altura:");
        altura = leitor.nextDouble();
        System.out.print("Dígite o peso:");
        peso = leitor.nextDouble();
        //processamento
        resultado1 = (altura*altura);
        resultado2 = (peso / resultado1);
        //Saída
        
        System.out.println("Resultado: " + formatador.format (resultado2));

     if ( resultado2 <= abaixodopeso ) {
 	System.out.println("ABAIXO DO PESO");
     }
	
     else if ( resultado2 > abaixodopeso &&  resultado2 <= pesonormal) {
 	System.out.println("PESO NORMAL");
     }
        
     else if ( resultado2 > pesonormal &&  resultado2 <= sobrepeso) {
    	 	System.out.println("SOBREPESO");
    	     }
     
     else if ( resultado2 > sobrepeso &&  resultado2 <= obesidadegrau1) {
 	 	System.out.println("OBESIDADE GRAU 1");
 	     }
     
     else if ( resultado2 > obesidadegrau1 &&  resultado2 <= obesidadegrau2) {
 	 	System.out.println("OBESIDADE GRAU 2");
 	     }
     
     else if ( resultado2 > obesidadegrau2 &&  resultado2 <= obesidadegrau3) {
 	 	System.out.println("OBESIDADE GRAU 2");
 	     }
     
     else if ( resultado2 > obesidadegrau3 &&  resultado2 > obesidadegrau3) {
 	 	System.out.println("OBESIDADE GRAU 3");
 	     }
     
        leitor.close();
        
	}

}
