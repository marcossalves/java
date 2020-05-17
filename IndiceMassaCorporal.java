
/**
 * @author Marcos Severino Alves
 * Calculo índice da massa corporal java
 *
 */

package exercicios;
import java.text.DecimalFormat;
import java.util.Scanner;
public class IndiceMassaCorporal {

	public static void main(String[] args) {
		//<control><shift<f> (alinhamento)
		//variáveis
		double altura, peso, resultado1, resultado2;

		//objeto leitor (usado para capturar dados)
		Scanner leitor = new java.util.Scanner(System.in);
        //objeto formatador (usado para formatar o resultado)
		DecimalFormat formatador = new DecimalFormat ("0.0");
		System.out.println(" Calculo índice masssa corporal"); 

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

     if ( resultado2 <= 18.5 ) {
 	System.out.println("ABAIXO DO PESO");
     }
	
     else if ( resultado2 > 18.5 &&  resultado2 <= 24.9) {
 	System.out.println("PESO NORMAL");
     }
        
     else if ( resultado2 > 24.9 &&  resultado2 <= 29.9) {
    	 	System.out.println("SOBREPESO");
    	     }
     
     else if ( resultado2 > 29.9 &&  resultado2 <= 34.9) {
 	 	System.out.println("OBESIDADE GRAU 1");
 	     }
     
     else if ( resultado2 > 34.9 &&  resultado2 <= 39.9) {
 	 	System.out.println("OBESIDADE GRAU 2");
 	     }
     
     else if ( resultado2 > 39.9 &&  resultado2 <= 40.0) {
 	 	System.out.println("OBESIDADE GRAU 2");
 	     }
     
     else if ( resultado2 > 40.0 &&  resultado2 > 40.0) {
 	 	System.out.println("OBESIDADE GRAU 3");
 	     }
     
        leitor.close();
        
	}

}
