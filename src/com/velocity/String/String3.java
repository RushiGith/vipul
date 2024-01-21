package com.velocity.String;

import java.util.Scanner;

public class String3 {
private static String getStudentName(String name)
{
	return name;
}
	public static void main(String[] args) {
System.out.println("Enter your name");
Scanner sc= new Scanner (System.in);
String name=sc.next();
String s=getStudentName(name);
System.out.println(s);
	}

}
