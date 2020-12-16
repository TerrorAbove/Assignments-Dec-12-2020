package com.ss.dpitcher.dec12.part1;

import java.util.Arrays;

/**
 * 
 * @author David Pitcher
 *
 */
public class StringSorter
{
	public static void main(String[] args)
	{
		String[] array = {
				"String1",
				"abcdefg",
				"hello",
				"Smoothstack",
				"code is fun",
				"Hello World!"
		};
		
		System.out.println("Shortest to longest: ");
		System.out.println();
		
		Arrays.sort(array, (s1, s2) -> s1.length() - s2.length());
		Utils.printArray(array);
		
		System.out.println();
		System.out.println("Longest to shortest: ");
		System.out.println();
		
		Arrays.sort(array, (s1, s2) -> s2.length() - s1.length());
		Utils.printArray(array);
		
		System.out.println();
		System.out.println("Alphabetically by first character: (case insensitive)");
		System.out.println();
		
		Arrays.sort(array, (s1, s2) -> Character.toLowerCase(s1.charAt(0)) - Character.toLowerCase(s2.charAt(0)));
		Utils.printArray(array);
		
		System.out.println();
		System.out.println("Strings containing 'e' first: ");
		System.out.println();
		
		Arrays.sort(array, (s1, s2) -> (s2.contains("e") ? 1 : 0) - (s1.contains("e") ? 1 : 0));
		Utils.printArray(array);
		
		System.out.println();
		System.out.println("Strings containing 'e' first: (static helper method)");
		System.out.println();
		
		Arrays.sort(array, (s1, s2) -> Utils.compareStrings(s1, s2));
		Utils.printArray(array);
	}
}
