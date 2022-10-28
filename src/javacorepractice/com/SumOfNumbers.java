package javacorepractice.com;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter total no's to sum: ");
		n = in.nextInt();
		
		int temp = 0;
		for(int i=1;i<=n;i++)
		{
			System.out.print("Enter No "+i+" : ");
			temp = temp +in.nextInt();
		}

		System.out.println("Total Sum : "+temp);
		
	}

}
