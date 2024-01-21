package com.velocity.String;

public class String1 {

	public static void main(String[] args) {
		String s1= new String("Velocity");
		String s2=new String("pune");
s1=s2;
         System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

	}

}
