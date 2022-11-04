package patikadev;

import java.util.Scanner;

public class ManavKasaProgramı {

	public static void main(String[] args) {
		
		////variables are defined
		double pearsTL=2.14,applesTL=3.67,tomatoesTL=1.11,bananasTL=0.95,eggplantsTL=5.0;
		double pearsKG,applesKG,tomatoesKG,bananasKG,eggplantsKG;
		double totalAmount;
		
		Scanner input = new Scanner(System.in);
		
		//Getting kilos information from user
		System.out.println("Please Enter How Many Kilos Of Pears You Want :  ");
		pearsKG = input.nextDouble();
				
		System.out.println("Please Enter How Many Kilos Of Apples You Want :  ");
		applesKG = input.nextDouble();
		
		System.out.println("Please Enter How Many Kilos Of Tomatoes You Want :  ");
		tomatoesKG = input.nextDouble();
		
		System.out.println("Please Enter How Many Kilos Of Bananas You Want :  ");
		bananasKG = input.nextDouble();
		
		System.out.println("Please Enter How Many Kilos Of Eggplants You Want :  ");
		eggplantsKG = input.nextDouble();
		
		//calculating the total amount
		totalAmount = pearsKG*pearsTL+applesKG*applesTL+tomatoesKG*tomatoesTL+bananasKG*bananasTL+eggplantsKG*eggplantsTL;
		
		System.out.println("Total Amount : "+totalAmount+" TL");
	}

}
