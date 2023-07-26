import java.util.Scanner;
public class DescuentosEnPeliculas {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		System.out.print("Ingresa tu edad: ");
		int edad = in.nextInt();
		float ticketPrice = 7F;
		
		if (edad >= 60) {
			ticketPrice *= 0.55F ;
			
		} else if (edad <= 5) {
			ticketPrice *= 0.60F;
		}
System.out.println("Precio del ticket: $" + ticketPrice);
in.close();
	}

}
