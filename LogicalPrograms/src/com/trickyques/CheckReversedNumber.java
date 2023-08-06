package com.trickyques;

import java.util.Scanner;

public class CheckReversedNumber {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("Enter your value of FIRST VALUE:");
int firstvalue=scanner.nextInt();
System.out.println("Enter Value of SECOND VALUE:");
int secondvalue=scanner.nextInt();

firstvalue = firstvalue+secondvalue;
secondvalue = firstvalue-secondvalue;
firstvalue = firstvalue-secondvalue;

System.out.println("After Swap FIRST VALUE: "+firstvalue+"\nAfter Swap SECOND VALUE: "+secondvalue);
	scanner.close();
	}	
}
