package com.velocity.String;

public class String6 {

	public static void main(String[] args) {
		String r="Rushikesh Gomase Amravtri";
		char[] arry = r.toCharArray();
		int count=0;
		for(char x:arry)
		{
	     if(x== ' ')
			{
				count++;
			}
			
		}
          System.out.println(count);
	}

}
