package sortersTesterClasses;

import java.util.Comparator;
import java.util.Random;

import interfaces.Sorter;
import sorterClasses.BubbleSortSorter;

public class SortOrderTester {
	
	public static void main(String[] args){
		
		Integer[] arr = {5, 9, 20, 22, 20, 5, 4, 13, 17, 8, 22, 1, 3, 7, 11, 9, 10};
		
		Sorter<Integer> sorter = new BubbleSortSorter<Integer>();
		
		System.out.println("Sorting using Bubble Sort in increasing and decreasing order:");
		
		System.out.println("Original array:");
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i]+ " ");
		}
		
		sorter.sort(arr, new IntegerComparator1());
		System.out.println("\nIncreasing order:");
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i]+ " ");
		}
		
		sorter.sort(arr, new IntegerComparator2());
		System.out.println("\nDecreasing order:");
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i]+ " ");
		}
		
	}

}
