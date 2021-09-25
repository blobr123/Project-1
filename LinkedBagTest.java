import java.util.Arrays;

public class LinkedBagTest 
{

	public static void main(String[] args) 
	{
		LinkedBag<String> bag1 = new LinkedBag<String>();
		bag1.add("a");
		bag1.add("b");
		bag1.add("c");
		System.out.println("bag1: " + Arrays.toString(bag1.toArray()));
		
		LinkedBag<String> bag2 = new LinkedBag<String>();
		bag2.add("b");
		bag2.add("b");
		bag2.add("d");
		bag2.add("e");
		System.out.println("bag2: " + Arrays.toString(bag2.toArray()));
		
		BagInterface<String> everything = bag1.union(bag2);
		System.out.println("The union of bag1 and bag2: " + Arrays.toString(everything.toArray()));
		
		BagInterface<String> commonItems = bag1.intersection(bag2);
		System.out.println("The intersection of bag1 and bag2: " + Arrays.toString(commonItems.toArray()));
		
		BagInterface<String> leftOver1 = bag1.difference(bag2);
		System.out.println("The difference of bag1 and bag2: " + Arrays.toString(leftOver1.toArray()));
		
		BagInterface<String> leftOver2 = bag2.difference(bag1);
		System.out.println("The difference of bag2 and bag1: " + Arrays.toString(leftOver2.toArray()));

	}

}