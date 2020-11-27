package personalid;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        // TODO Auto-generated method stub
            //something about czech identification number i used it as source of information https://cs.wikipedia.org/wiki/Rodn%C3%A9_%C4%8D%C3%ADslo


        //creating scanner
        Scanner scan = new Scanner(System.in);
        
        //aksking user for birth number
        System.out.println("Please enter your personal identification number");

        //reading what user wrote
        String input = scan.next();

        //creating new personal identification number
        personalid idN = new personalid(input);

        //printing gender
        System.out.println("Gender: " + idN.getGender());

        //printing year of birth
        System.out.println("Year of birth: " + idN.getYear());

        //printing day of birth
        System.out.println("Day of birth: " + idN.getDay());
        

        //creating switch to print name of month instead of number of the month
		switch (idN.getMonth()) {
		case 0:
			break;
		case 1:
			System.out.println("Month of birth: January");
			break;
		case 2:
			System.out.println("Month of birth: February");
			break;
		case 3:
			System.out.println("Month of birth: March");
			break;
		case 4:
			System.out.println("Month of birth: April");
			break;
		case 5:
			System.out.println("Month of birth: May");
			break;
		case 6:
			System.out.println("Month of birth: June");
			break;
		case 7:
			System.out.println("Month of birth: July");
			break;
		case 8:
			System.out.println("Month of birth: August");
			break;
		case 9:
			System.out.println("Month of birth: September");
			break;
		case 10:
			System.out.println("Month of birth: October");
			break;
		case 11:
			System.out.println("Month of birth: November");
			break;
		case 12:
			System.out.println("Month of birth: December");
			break;

		}

		// debug just to see if everything prints correctly (delete later)

		System.out.println(idN.validate());
		System.out.println(idN.getGender());
		System.out.println(idN.getYear());
		System.out.println(idN.getMonth());
		System.out.println(idN.getDay());

	}

}
