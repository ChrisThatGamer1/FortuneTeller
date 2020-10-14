/*	
*	Project: This program will add the digits of a person's birth date to gather a single digit, which is called a numerology number. 
* 	Data: 5/24/20
* 	Author: Christopher Clark (N01242244)
*/

import java.util.Scanner;

public class Assign4 {

	// date crunching method
	public static int dateCrunching(int userNum) {
		if (userNum < 9)

			return userNum;

		// if number if of two digit
		return userNum / 10 + userNum % 10;
	}

	// date validating method
	static boolean dateValid(int year, int month, int day) {

		if (year >= 1500 && year <= 3000) {
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
				if (day > 0 && day <= 31) {
					return true;
				}
			} else if (month == 4 || month == 6 || month == 9 || month == 11) {
				if (day > 0 && day <= 30) {
					return true;
				}
			} else {
				if (month == 2) {
					if (year % 400 == 0) {
						if (day <= 29) {
							return true;
						}
					} else {
						if (day <= 28) {
							return true;
						}
					}
				}

			}
		} else {
			return false;
		}
		return false;
	}

// horoscope msg via switch case method  
	private static void getHoroscope(int choice) {

		switch (choice) {

		case 1:

			System.out.println("You will start a movement.");
			break;

		case 2:

			System.out.println("You will Major in Computer Science.");
			break;

		case 3:

			System.out.println("You are smart and intelligent but had working is importing as well");
			break;

		case 4:

			System.out.println("You will become rich, so spend it wisely.");
			break;

		case 5:

			System.out.println("You will have an intereseting year ahead.");
			break;

		case 6:

			System.out.println("You will play video games for a living.");
			break;

		case 7:

			System.out.println("Love is near.");
			break;

		case 8:

			System.out.println("Be careful of dogs.");
			break;

		case 9:

			System.out.println("Don't be afraid to fail, so you can succeed.");
			break;

		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your birthbay(use forward slashes).");

		while (true) {
			try {
				System.out.println("Enter date below:");
				String s = sc.nextLine();
				String dates[] = s.split("/");
				int year = Integer.parseInt(dates[2].trim());
				int day = Integer.parseInt(dates[1].trim());
				int month = Integer.parseInt(dates[0].trim());
				int num1;

				if (dateValid(year, month, day)) {

					num1 = dateCrunching(year + month + day);

					while (num1 > 9) {

						num1 = dateCrunching(num1);
					}
					System.out.print(num1 + " : ");
					getHoroscope(num1);
				} else {
					System.out.println("Wrong, try again.");
					System.out.println("Make sure you enter in a valid birth date, and use forward slashes.");

				}
			} catch (Exception e) {
				System.out.println("Wrong, try again.");

			}
		}
	}
}