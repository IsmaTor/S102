package S1T2N2E1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
	
	static Scanner entrada = new Scanner(System.in);
	
	//mètodes de excepcions
	public static byte llegirByte(String missatge) throws InputMismatchException {
		byte edat = 0;
        boolean continua; 
        do { //crea el bucle
            try {//es preveuen excepcions al programa
                continua = false;
                System.out.print("Introdueix la teva edat: ");
                edat = entrada.nextByte();
            } catch (InputMismatchException ex) {
                System.out.println("Error de format.");
                entrada.next();
                continua = true;
            }
        } while (continua);//condición para fin del bucle
		return edat;	
        }
	
	public static int llegirInt(String missatge) throws InputMismatchException {
		int edat = 0;
		boolean continua;
		do {
			try {
				continua = false;
				System.out.println("Introdueix la teva edat: ");
				edat = entrada.nextInt();
			} catch (InputMismatchException ex) {
				System.out.println("Error de format.");
				entrada.next();
				continua = true;
			}
		} while (continua);
		return edat;
	}
	
	public static float llegirFloat(String missatge) throws InputMismatchException{
		float edat = 0;
		boolean continua;
		do {
			try {
				continua = false;
				System.out.println("Introdueix la teva edat; ");
				edat = entrada.nextFloat();
			} catch (InputMismatchException ex) {
				System.out.println("Error de format.");
				entrada.next();
				continua = true;
			}
		} while (continua);
		return edat;
	}
	
	public static double llegirDouble(String missatge) throws InputMismatchException {
		double edat = 0;
		boolean continua;
		do {
			try {
				continua = false;
				System.out.println("Introdueix la teva edat: ");
				edat = entrada.nextDouble();
			} catch (InputMismatchException ex) {
				System.out.println("Error de format.");
				entrada.next();
				continua = true;
			}
		} while (continua);
		return edat;
	}
	
	//mètodes de implantar la excepció
	public static char llegirChar(String missatge) throws Exception {
		
		boolean continua;
		do {
			try {
				continua = false;
				System.out.println("Introdueix un caràcter: ");
				missatge = entrada.next();
						if (missatge.length() !=1) {
							System.out.println("Has de escriure només un caràcter.");
							continua = true;
						}
			} catch (Exception ex) {
				System.out.println("Error de format.");
				entrada.next();
				continua = true;
			}
		} while (continua);
		
		return missatge.charAt(0);
	}
	
	public static String llegirString(String missatge) {
		boolean continua;
		do {
			try {
				continua = false;
				System.out.println("Introdueix la teva paraula: ");
				missatge = entrada.next();
			} catch (Exception ex) {
				System.out.println("Error de format. ");
				entrada.next();
				continua = true;
			}
		} while (continua);
		return missatge;
	}
	
	public static boolean llegirSiNo(String missatge) throws Exception {
		String afirmatiu = "S";
		String negatiu = "N";
		boolean continua = false;
		boolean resposta = false;
		
		do { 
			try {
				System.out.println("Introdueix Si (S) o No (N): ");
				missatge = entrada.next();
				continua = true;
				if (missatge.equalsIgnoreCase(afirmatiu)) { //la letra ha de coincidir
					continua = true;
					resposta = true;
				} else if (missatge.equalsIgnoreCase(negatiu)) { //la letra ha de coincidir
					continua = true;
					resposta = false;
				} else { // si no coinciden las letras al compararlas es false
					System.out.println("Error de formato.");
					continua = false; 
					}
				
			} catch (Exception ex) {
				System.out.println("Error de format.");
				entrada.next();
				continua = false;
			}
			} while (continua == false); // fin del bucle
		
		return resposta ;
	}
}
