package com.main;

import java.util.Scanner;

public class Ticket {
public void weekday() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of tickets");
	int n=sc.nextInt();
	System.out.println("total weekday ticket rate "+n*Main.ticketweekday);
	
}
public void weekend() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of tickets");
	int n=sc.nextInt();
	System.out.println("total weekday ticket rate "+n*Main.ticketweekend);
	
}


}
