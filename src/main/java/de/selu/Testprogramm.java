package de.selu;
import java.util.Scanner;

public class Testprogramm{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.print("Bitte Text eingeben: ");
		String inputLine = scan.nextLine();


		System.out.println(inputLine.toUpperCase());
	}
}
