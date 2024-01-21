package com.velocity.practice;

public class ReverseWordinString {

	public static void main(String[] args) {
	String str="Rushikesh Is Good Boy";
	String str2="boy is good rushikesh";
	int count=0;

	String splitarrya[]=str.split(" ");
	
	for(int i=splitarrya.length-1;i>=0;i--)
	{
	    
	      System.out.println(" "+splitarrya[i]);

		}
	
    System.out.println(" "+str2.equals(str));
	

}
}


