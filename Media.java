/**
 * @author Marcos Severino Alves
 * Media java
 *
 */

package exercicios;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		//<control><shift<f> (alinhamento)
		//vari�veis
		double nota1, nota2, media;
		//objeto leitor (usado para capturar dados)
		Scanner leitor = new java.util.Scanner(System.in);
        //objeto formatador (usado para formatar o resultado)
		DecimalFormat formatador = new DecimalFormat ("0.0");
		System.out.println("C�lculo da m�dia");
       //Entrada
        System.out.print("D�gite a nota1:");
        nota1 = leitor.nextDouble();
        System.out.print("D�gite a nota2:");
        nota2 = leitor.nextDouble();
        //processamento
        media = (nota1 + nota2) /2;
        //Sa�da
        System.out.println("M�dia: " + formatador.format (media));
        if (media < 2 ) {
        	System.out.println("REPROVADO");	
        
        }else if (media >= 2 && media < 5) {
        	System.out.println("RECUPERA��O");	
        }else { System.out.println("APROVADO");
        }
        leitor.close();
        
	}

}
