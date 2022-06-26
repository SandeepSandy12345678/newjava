package com.main;
import com.main.anad.*;
import com.main.travel.Jeep;
import com.main.about.Food;
public class Main {
public static String zoo_name;
String location="AUSTRALIA";
String timings="10AM-6PM";
String zoo_brief="The best ZOO in AUSTRALIA";
int  zoo_workers=600;
static int ticketweekend=500;
static int ticketweekday=250;

public static void main(String[] args) {
	Animals ag=new Animals();
	System.out.println(ag.toString());
	System.out.println(ag.welcome("zeozo"));
	Jeep j=new Jeep();
	Adoption ajj=new Adoption();
	System.out.println(ajj.welcome("zeozeo"));
Ticket t=new Ticket();
t.weekday();
t.weekend();
Food f=new Food();
f.Vegbuff();
f.nonvegbuff();
}
}

