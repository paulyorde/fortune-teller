package fortuneTeller;

import java.util.Scanner;

public class FortuneTellerApp {

	public static void main(String[] args) {
		FortuneTeller teller = new FortuneTeller();
		Person user = null;
		Scanner scanner = new Scanner(System.in);
		String firstName = null, lastName = null, birthMonth = null, favoriteColor = null;
		String response = null;

		do {
			// get user data
			System.out.println("What is your first name? ");
			firstName = scanner.next();			
			System.out.println("What is your last name? ");
			lastName = scanner.next();
			System.out.println("What is your age? ");
			int age = scanner.nextInt();
			System.out.println("What is your birth month? ");
			birthMonth = scanner.next();
			System.out.println("How many siblings do you have? ");
			int siblings = scanner.nextInt();
			System.out.println(
					"What is your favorite ROYGBIV color? " + " enter \"Help\" for a list of ROYGBIV colors ");
			favoriteColor = scanner.next();
			if (favoriteColor.equalsIgnoreCase("help")) {
				System.out.println("HELP");
				for (ROYGBIV color : ROYGBIV.values()) {
					System.out.println(color);
				}
				System.out.println("\n which of the ROYGBIV colors is your favorate?");
				favoriteColor = scanner.next();
			}

			user = new Person(firstName, lastName, birthMonth, age, siblings, favoriteColor);

			// print users fortune
			System.out.println(user.getFirstName() + " " + user.getLastName() + teller.ageTeller(user.getAge())
					+ teller.birthMonthTeller(user.getFullName(), user.getBirthMonth())
					+ teller.siblingsTeller(user.getSiblings()) + teller.colorTeller(user.getFavoriteColor()));

			System.out.println("Would you like to continue: Y or N");
			response = scanner.next();
					
		} while (response.equalsIgnoreCase("Y"));
	
		scanner.close();
	}
}
