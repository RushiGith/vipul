package com.velocity.String;

public class StringReverseSentences {

	public static void main(String[] args) {
	String str="Welcome to you";
	String splitarry[]=str.split(" ");
	for(int i=splitarry.length-1;i>=0;i--)
		
	{
   	System.out.print(" "+splitarry[i]);
	}
	}

}
