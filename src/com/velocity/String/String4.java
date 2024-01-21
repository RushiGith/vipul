package com.velocity.String;

public class String4 {

	public static void main(String[] args) {
		String str="Rushikesh";
		String r="Gomase";
		System.out.println(str.length());
		System.out.println(str.charAt(6));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
           // System.out.println(str.concat("Amravati"));
            //System.out.println(str.compareTo(r));
            System.out.println(r);
            System.out.println(str.hashCode());
            System.out.println(r.hashCode());
             str=r;
            System.out.println(str==r);
            
	}

}
