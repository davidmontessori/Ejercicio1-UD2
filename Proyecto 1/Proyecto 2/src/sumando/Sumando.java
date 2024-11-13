package sumando;

import java.util.Scanner;

public class Sumando {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("dame dos numeros");
	int numero1=input.nextInt();
	int numero2=input.nextInt();
	
	int suma=(numero1+numero2);
	System.out.println("la suma es "+suma);
	
	
	
	
	
	input.close();
	}

}
