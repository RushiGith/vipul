package com.velocity.String;

public class CountEvenOddPrimeNumber {

	public static void main(String[] args) {
		int no,primeno=0,evenno=0,oddno=0,rem;
		System.out.println("Even no");
		System.out.println("Odd no");
		System.out.println("Prime no");
		for(int i=0;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even no is="+i);
				evenno++;
			}
				else {
					System.out.println("Odd no is="+i);
					oddno++;
					rem=i%10;
					i=(rem*10)+1;
					i=i/10;
					primeno++;
				}
			}
		System.out.println("Count Even no is ="+evenno);
		System.out.println("Count Odd no is ="+oddno);
		System.out.println("Count prime no is ="+primeno);
		
		}

	}


