package mostrandodatos;

import java.util.Scanner;

public class MostrandoDatos {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Nombre");
	
	String nombre=input.nextLine();
	System.out.println("Apellido");
	String apellidos=input.nextLine();
	input.close();
	}

}
