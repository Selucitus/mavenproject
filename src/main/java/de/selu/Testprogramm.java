package de.selu;
import java.util.Scanner;
/**
 * 
 * @author selu
 *
 */
public class Testprogramm{
	public static void main(String[] args){
		System.out.println("starting...");
	//	praktikum5();
		System.out.println("terminating...");
	}

	public static void praktikum5() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Bitte Text eingeben: ");
		String inputLine = scan.nextLine();
	
	
		System.out.println(inputLine.toUpperCase());
		
		scan.close();
	}
}