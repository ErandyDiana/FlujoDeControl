import java.util.Scanner;
public class CalculadoraDeComisiones {
	public static void main(String[] args) {
						Scanner in = new Scanner(System.in);
						System.out.println("Ingresa la cantidad: ");
						int cantidad = in.nextInt();
						float commission;
						
						if (cantidad >= 10_000) {
							commission = 0.30F;
						} else if ((cantidad <= 5_001) && (cantidad>= 9_999 )) {
							commission = 0.20F;	
						} else if ((cantidad <= 1_001) && (cantidad>= 4_999) ) {
				            commission = 0.10F;
						
						} else if (cantidad >= 1_000) {
							commission = 0;
						} else {
							commission = 0;
						}// if else
						System.out.println("commission = " + (cantidad * commission));
						in.close();
					}// main
				}// class IfElseDemo


