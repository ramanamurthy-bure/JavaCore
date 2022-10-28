package javacorepractice.com;

import java.util.Scanner;

public class MaxOf3Nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter A : ");
		int A = in.nextInt();
		
		System.out.println("Enter B : ");
		int B = in.nextInt();
		
		System.out.println("Enter C : ");
		int C = in.nextInt();
		
		if (A>B && A>C)
		{
			System.out.println("A is bigger among A,B,C");
		}else if(B>A && B>C)
		{
			System.out.println("B is bigger among A,B,C");	
		}else
		{
			System.out.println("C is bigger among A,B,C");
		}
	}
}
