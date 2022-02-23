package javacorepractice.com;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class StreamsTests {
	@Test
	public void regular() {
		
		ArrayList<String> arls=new ArrayList<String>();
		arls.add("Ramana");
		arls.add("Murthy");
		arls.add("Gowri");
		arls.add("Karthi");
		arls.add("Anudeep");
		arls.add("Chinnari");
		arls.add("Swamy");
		arls.add("Raja");
		arls.add("Ranga");
		
		System.out.println("**********************************************************");		
		System.out.println(arls);
		System.out.println("**********************************************************");
		for(int i=0;i<arls.size();i++)
		{
			System.out.println(arls.get(i));
		}
		System.out.println("**********************************************************");
		
		System.out.println("*********************Streamms*******************************");
	}
}
