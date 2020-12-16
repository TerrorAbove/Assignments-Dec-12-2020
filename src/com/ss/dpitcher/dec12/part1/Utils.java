package com.ss.dpitcher.dec12.part1;

public class Utils
{
	/**
	 * Sorts strings based on whether they contain the character 'e'. Strings with 'e' will appear before others.
	 * @param s1 the first String
	 * @param s2 the second String
	 * @return an int denoting order, in the range [-1, 1].
	 */
	public static int compareStrings(String s1, String s2)
	{
		if(s2.contains("e"))
		{
			if(s1.contains("e"))
			{
				return 0;
			}
			else
			{
				return 1;
			}
		}
		else
		{
			if(s1.contains("e"))
			{
				return -1;
			}
			else
			{
				return 0;
			}
		}
	}
	
	/**
	 * Prints an array of objects line by line
	 * @param array an Object[] to print
	 */
	public static void printArray(Object[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
	}
	
	/**
	 * Prints an array on a single line with elements comma-separated.
	 * @param array an Object[] to print
	 */
	public static void printArraySingleLine(Object[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			if(i < array.length - 1)
			{
				System.out.print(array[i]+",");
			}
			else
			{
				System.out.print(array[i]);
			}
		}
	}
	
	/**
	 * Checks whether a given positive integer is prime.
	 * @param num an integer greater than 1
	 * @return true if the number is prime
	 */
	public static boolean isPrime(int num)
	{
		assert num > 1;
		
		if(num % 2 == 0 && num != 2)
			return false;
		
		for(int i = 3; i < Math.sqrt(num); i += 2)
			if(num % i == 0)
				return false;
		
		return true;
	}
	
	/**
	 * Checks whether a given non-negative integer is a palindrome.
	 * @param num a non-negative integer
	 * @return true if the number is a palindrome
	 */
	public static boolean isPalindrome(int num)
	{
		assert num >= 0;
		
		String str = num + "";
		
		for(int i = 0; i < str.length()/2; i++)
		{
			if(str.charAt(i) != str.charAt(str.length() - (i + 1)))
			{
				return false;
			}
		}
		
		return true;
	}
}
