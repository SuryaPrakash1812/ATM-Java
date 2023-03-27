package com.surya;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		Others o=new Others();
		 Scanner s = new Scanner(System.in);
 while(true)
	{ 
		System.out.println("enter your pin:");
		int pin=s.nextInt();
		int opin = 123;
		if(opin==pin) {
			System.out.println("1.check bal");
			System.out.println("2.withdraw cash");
			System.out.println("3.change pin");
			System.out.println("4.add cash");
			System.out.println("5.exit");
			int option=s.nextInt();
			
			if(option==1) {
				o.balance();
			}
			else if(option==2) {
				o.withdraw();
			}
			else if(option==3) {
				o.changePin();
			}
			else if(option==4) {
				o.addCash();
			}
			else if(option==5)
			{
				System.out.println("THANK YOU..");
				System.exit(option);
			}
		}
	

		else  {
			System.out.println("invalid pin");
		}
	}
 }
}
