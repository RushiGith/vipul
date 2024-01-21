package com.velocity.practice;

public class CountStringSpaces {

	public static void main(String[] args) {
    String str="Rushikesh Gomase Amrvati Mahsrashtra";
    char []arrya=str.toCharArray();
     int count=0;
    for(char x:arrya)
    {
    	if(x== ' ')
    	{
    		count++;
    	}
    }
System.out.println("Spaces in the String is="+count);
	}

}
