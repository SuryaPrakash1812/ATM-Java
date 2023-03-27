package com.surya;

import java.util.Scanner;

public class Others {
	private int opin=123;
	int bal =10000;
	Scanner s=new Scanner(System.in);
	public int getOpin() {
		return opin;
	}

	public void setOpin(int opin) {
		this.opin = opin;
	}
	public void balance()
	{
	
	System.out.println("your acc bal is:"+bal);
	}
	public void withdraw()
	{
		System.out.println("enter amount:");
		int amt = s.nextInt();
	
		if(amt>bal) {
			System.out.println("insufficient balance in account");
		} 
		else {
		System.out.println("collect cash      "+"remaining cash:"+(bal-amt));
		}
	}
	public void changePin()
	{
		System.out.println("enter old pin:");
		int oldpin=s.nextInt();
		if(oldpin==opin) {
		System.out.println("enter new pin:");
		int newpin=s.nextInt();
		System.out.println("your pin has been changed successfully");
		newpin=oldpin;
		}
		else {
			System.out.println("invalid oldpin");
		}
	}
	public void addCash()
	{
		System.out.println("enter amount to be added:");
		long add = s.nextLong();
		System.out.println("your balalance :"+(bal+add));
	}

}
