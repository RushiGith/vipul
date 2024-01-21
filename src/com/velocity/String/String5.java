package com.velocity.String;

public class String5 {

	public static void main(String[] args) {
		String str="Rushikesh Gomase Amravti Gopal Nagar";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch == ' ');
			{
				count++;
			}
		}

		System.out.println("Spaces in the String are="+count);
	}

}
