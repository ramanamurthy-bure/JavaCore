package javacorepractice.com;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class StreamsTests {

	public ArrayList<String> namesList = new ArrayList<String>();

	public StreamsTests() {
		namesList.add("Ramana");
		namesList.add("Murthy");
		namesList.add("Gowri");
		namesList.add("Karthi");
		namesList.add("Anudeep");
		namesList.add("Chinnari");
		namesList.add("Swamy");
		namesList.add("Raja");
		namesList.add("Ranga");
	}

	@Test(priority = 1)
	public void FilterWithoutUsingStream() {
		System.out.println("->Printing the arraylist");
		System.out.println(namesList);
		System.out.println("->Finding the total no of Names started with letter 'R'");
		int count = 0;
		for (int i = 0; i < namesList.size(); i++) {
			if (namesList.get(i).startsWith("R")) {
				count = count + 1;
			}
		}
		System.out.println(count + " Names started with first letter'R'");
		System.out.println("->Solving the same using Streams in Java");

	}

	@Test(priority = 2)
	public void FliterWithStream() {
		long count = namesList.stream().filter(s -> s.startsWith("R")).count();
		System.out.println(count + " Names started with first letter'R'");
	}
}
