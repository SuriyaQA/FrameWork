package OnlineBooking;

import java.util.Scanner;

public class OlaDriver {

	static boolean b = true;
	public static void main(String[] args) {

	
		while(b) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Choose your Vehicle Mode");
		System.out.println("\t\tBike");
		System.out.println("\t\tAuto");
		System.out.println("\t\tCab");
		System.out.println("\t\tExit");
		String option = sc.next();
		
		Ola a = null;
		switch(option) {
		 
		case "Bike":{
			a = new Bike();
			Bike p = (Bike)a;
			System.out.println("Price :" + p.price);
		}
		break;
		case "Auto":{
			a = new Auto();
			Auto  p = (Auto)a;
			System.out.println("Price :" + p. price);
		}
		break;
		case "Cab":{
			a = new Cab();
			Cab  p = (Cab)a;
			System.out.println("Price :" + p. price);
		}
		break;
		
		case "Exit":{
			b = false;
			System.out.println("Thanks for Choosing Ola");
			break;
			
		}
		default :{
			System.out.println("Invalid Vehichle Mode");
		}
		}
		
		}
	}
}
