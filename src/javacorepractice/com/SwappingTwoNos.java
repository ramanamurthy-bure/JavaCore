package javacorepractice.com;

import java.util.Scanner;

public class SwappingTwoNos {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in)) {
			
			int A,B;
			System.out.print("Enter A: ");
			A = in.nextInt();
			System.out.print("Enter B: ");
			B = in.nextInt();
			System.out.println("Method-1 - Without 3rd variable- Using + and - ");
			System.out.println("Before Swapping A : " + A + " B : " + B);
			A = A + B;
			B = A - B;
			A = A - B;
			System.out.println("After Swapping A : " + A + " B : " + B);
			System.out.println("*********************************************");
			System.out.println("Method-2 - With 3rd variable");
			System.out.println("Before Swapping A:  " + A + " B : " + B);		
			int temp;
			temp = A;
			A = B;			
			B = temp;					
			System.out.println("After Swapping A: " + A + " B: " + B);
			
			System.out.println("Method-3 - Without 3rd variable- Using * and / ");
			System.out.println("Before Swapping A : " + A + " B : " + B);
			A = A * B;
			B = A / B;
			A = A / B;
			System.out.println("After Swapping A : " + A + " B : " + B);
			
			
		}
	}
}
