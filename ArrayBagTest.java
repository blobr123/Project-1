import java.util.Arrays;

public class ArrayBagTest 
{

	public static void main(String[] args) 
	{
		ResizableArrayBag<String> bag1 = new ResizableArrayBag<String>(3);
		bag1.add("a");
		bag1.add("b");
		bag1.add("c");
		
		ResizableArrayBag<String> bag2 = new ResizableArrayBag<String>(4);
		bag2.add("b");
		bag2.add("b");
		bag2.add("d");
		bag2.add("e");
		
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
