package javacorepractice.com;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StreamsTests {

	public ArrayList<String> namesList = new ArrayList<String>();

	public StreamsTests() {
		namesList.add("Ramana");
		namesList.add("Murthy");
		namesList.add("Gowri");
		namesList.add("Karthi");
		namesList.add("Anu");
		namesList.add("Nik");
		namesList.add("Anudeep");
		namesList.add("Chinnari");
		namesList.add("Swamy");
		namesList.add("Raja");
		namesList.add("Ranga");
		namesList.add("Anupaman");
	}

	@Test
	public void FilterWithoutUsingStream(Method method) {
		System.out.println("###########[ " + method.getName() + " ]###########");
		System.out.println("->Printing the arraylist");
		System.out.println(namesList);
		System.out.println("->Finding the total no of Names started with letter 'R'");
		int count = 0;
		for (int i = 0; i < namesList.size(); i++) {
			if (namesList.get(i).startsWith("A")) {
				count = count + 1;
			}
		}
		System.out.println(count + " Names started with first letter'A'");
		System.out.println("->Solving the same using Streams in Java");

	}

	@Test
	public void FliterWithStream(Method method) {
		System.out.println("###########[ " + method.getName() + " ]###########");
		// Stream aggregate operations will not effect the source data structure
		long count = namesList.stream().filter(s -> s.startsWith("R")).count();
		System.out.println(count + " Names started with first letter'R'");
	}

	@Test
	public void CreatingStream(Method method) {
		System.out.println("###########[ " + method.getName() + " ]###########");
		System.out.println("To get the names count which are exist with char 'i'");
		// There is no life for intermediate operation if there is no terminal operation
		// Terminal operation will execute only if the intermediate operation returns
		// true
		// We can pass the values directly to the 'Stream.of' instead of creating data
		// structure and using it"

		long count = Stream.of("Ramana", "Gowri", "Karthi", "Ranga", "Raja").filter(s -> s.contains("i")).count();
		System.out.println(count + " Names contains letter'i'");
	}

	@Test
	public void UsingFliterINStream(Method method) {
		System.out.println("###########[ " + method.getName() + " ]###########");
		// How t use filter in Java Stream API
		// Here the terminal operator .count() gets executed only when the body returns
		// true
		long d = Stream.of("Ramana", "Gowri", "Karthi", "Ranga", "Raja").filter(s -> {
			s.startsWith("K");
			return true;
		}).count();
		System.out.println(d + " Names started with first letter'K'");
	}

	@Test
	public void PrintStreamBasedOnCondition(Method method) {
		System.out.println("###########[ " + method.getName() + " ]###########");

		// This will print all the names whose length >4
		namesList.stream().filter(s -> s.length() > 4).forEach(s -> System.out.print(s+"\t"));
		// This will print only 1 result whose length >4
		// Here terminal operator limit will give only 1 value from the results
		namesList.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));
	}

	@Test
	public void StreamMap(Method method) {
		System.out.println("###########[ " + method.getName() + " ]###########");
		// To print the names ends with char 'a'
		// To change the results to Upper Case
		Stream.of("Ramana", "Gowri", "Karthi", "Ranga", "Rajana", "Ganga").filter(s -> s.endsWith("a"))
				.map(s -> s.toUpperCase()).forEach(s -> System.out.print(s+"\t"));

		// To print the names with start with char 'R'
		// To sort the results and then change to Upper Case
		Stream.of("Ramana", "Gowri", "Karthi", "Ranga", "Rajana").filter(s -> s.startsWith("G")).sorted()
				.map(s -> s.toUpperCase()).forEach(s -> System.out.print(s+"\t"));

	}

	@Test
	public void ConcatinateSteams(Method method) {
		System.out.println("###########[ " + method.getName() + " ]###########");
		Stream<String> s1 = Stream.of("Ramana", "Gowri", "Karthi", "Ranga", "Rajana");
		Stream<String> newStream = Stream.concat(s1, namesList.stream());
		// newStream.forEach(s->System.out.println(s));

		// To check the existance of "Ramana" in the stream and returning true if it
		// exists
		boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("Ramana"));
		System.out.println("Is Ramana exists? " + flag);
		Assert.assertTrue(flag);

	}

	@Test
	public void StreamCollect(Method method) {
		System.out.println("###########[ " + method.getName() + " ]###########");
		List<String> newList = Stream.of("Ramana", "Gowri", "Karthi", "Ranga", "Rajana", "Ganga")
				.filter(s -> s.endsWith("a")).map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println("New converted List " + newList);
		
		//To convert array to list
		List<Integer> nums = Arrays.asList(2, 34, 5, 2, 3, 5, 1, 34, 6, 9, 8, 9, 4);
		
		//To find the distinct no's from the list 
		nums.stream().distinct().forEach(s->System.out.print(s+"\t"));
		
		//to create new list with distinct no's and print 3rd index
		List<Integer> newDistLst=nums.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(newDistLst.get(3));
	}

}
