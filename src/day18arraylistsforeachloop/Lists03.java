package day18arraylistsforeachloop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists03 {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		
		list1.add(12);
		list1.add(21);
		list1.add(32);
		list1.add(25);
		list1.add(90);
		
		List<Integer> list2 = new ArrayList<>();
		
		list2.add(111);
		list2.add(222);
		list2.add(333);
		list2.add(444);
		list2.add(555);
		
		// How to join two lists
		// it is adding the elements at the end of the list
		System.out.println(list1.addAll(list2));// @return {@code true} if this list changed as a result of the call
		
		
		System.out.println(list1);
		System.out.println(list2);
		
		list1.addAll(2, list2);
		System.out.println(list1);
		
		
		// How to delete all elements from a list
		// Removes all of the elements from this list (optional operation).
	    // The list will be empty after this call returns.
		//list2.clear();
		System.out.println(list2);
		
		//
		// How to check existence of multiple elements
		// list1.containsAll(list2) method returns true if all elements exist in the first list
		System.out.println(list1.containsAll(list2));
		
		
		// How to get the index of last occurance of an element in a list
		
		System.out.println(list1.lastIndexOf(111));//10
		
		// How to remove Multiple elements from a list
		list1.removeAll(list2);
		System.out.println(list1);
		
		// How to delete elements by using some conditions
		// It returns true if any elemenets is removed otherwise it returns false
		list1.removeIf(t -> t%2 != 0);
		System.out.println(list1);
		
		// How to get a specific part of a list
		// subList(1, 3) ==> 1 is inclusive, 3 is exclusive
		// subList(1, 3) ==> it returns the sublist
		System.out.println(list1.subList(1, 3));
		
		//
		// How to convert a list to an array
		System.out.println(Arrays.toString(list2.toArray()));
		
		// How to convert an array to a list <== We use that many times
		int arr[] = {1, 54, 21, 13};
		List<int[]> list3 = Arrays.asList(arr);
		
		System.out.println(list3);
		
		
		
	}

}
