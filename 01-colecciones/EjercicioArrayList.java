
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioArrayList {

	public static void main(String[] args) {
		
		ArrayList <Integer> numeros = new ArrayList<>();
		
		Scanner entrada = new Scanner(System.in);
		
		while(!numeros.contains(0)) {
			try {
				System.out.print("Numero: ");
				int numero = entrada.nextInt();
				entrada.nextLine();
				
				if(numero == 0) {
					System.out.println("----Fin del programa----");
					System.out.println("Total suma: " + sumaNumeros(numeros));
					System.out.printf("La media es: %.2f%n", mediaNumeros(numeros));
					System.out.println("Hay " + numerosMayoresMedia(numeros) + " número/s que son superiores a la media");
					break;
				} else {
					numeros.add(numero);
					System.out.println(numero);
				}
			} catch (InputMismatchException e) {
				System.out.println("Error, introduzca valores númericos");
				entrada.nextLine();
			}
			
		}
		
		entrada.close();
	}
	
	
	public static int sumaNumeros(ArrayList <Integer> numeros) {
		int totalSuma = 0;
		
		for(int i=0; i<numeros.size();i++) {
			totalSuma=numeros.get(i) + totalSuma;
		}
		
		return(totalSuma);
	}
	
	
	public static double mediaNumeros(ArrayList <Integer> numeros) {
		double media = (double)(sumaNumeros(numeros))/numeros.size();
		return media;
	}
	
	
	public static int numerosMayoresMedia(ArrayList <Integer> numeros) {
		int contador = 0;
		double media = mediaNumeros(numeros);
		
		for(int i = 0; i<numeros.size(); i++) {
			if(numeros.get(i) > media) {
				contador = contador + 1;
			}
		}
		
		return contador;
	}
}
