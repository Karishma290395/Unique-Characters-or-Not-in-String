package test5;
import java.util.Scanner;
public class stringhasuniquecharacter {

	public static void main(String[] args) {
		
		Scanner countrySc = new Scanner(System.in);
		
		System.out.println("Please enter the country name.");
		String country = countrySc.nextLine();
		
		boolean unique = true;
		for (int i = 0; i < country.length(); i++) {

			for (int j = 0; j < country.length(); j++) {

				if (i != j && country.charAt(i) == country.charAt(j)) {
					unique = false;
					break;
				}
			}
		}
		if (unique) {
			System.out.println("String has all unique character");
		} else {
			System.out.println("String is not unique");
		}
		countrySc.close();
	}

}
