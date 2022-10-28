package javacorepractice.com;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter circle radius: ");
		int radius = in.nextInt();
		double area = Math.PI * radius * radius;
		System.out.println("Area of circle : " + area);

	}

}
