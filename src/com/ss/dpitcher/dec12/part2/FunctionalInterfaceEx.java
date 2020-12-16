package com.ss.dpitcher.dec12.part2;

import com.ss.dpitcher.dec12.part1.Utils;

/**
 * 
 * @author David Pitcher
 *
 */
public class FunctionalInterfaceEx
{
	public static void main(String[] args)
	{
		int[] dataSet = {4, 5, 898, 3, 12, 1117};
		
		PerformOperation isOdd = b -> b % 2 == 1;
		PerformOperation isPrime = b -> Utils.isPrime(b);
		PerformOperation isPalindrome = b -> Utils.isPalindrome(b);
		
		for(int a : dataSet)
		{
			System.out.println(a + " is " + (isOdd.checkInt(a) ? "Odd" : "Even") + ", "
					+ (isPrime.checkInt(a) ? "Prime" : "Composite")+ ", "
					+ (isPalindrome.checkInt(a) ? "Palindrome" : "Not a Palindrome"));
		}
		
		System.out.println();
		System.out.println("The rightmost digits are: ");
		
		DoSomething ds = b -> (b % 10);
		
		System.out.print("[");
		for(int i = 0; i < dataSet.length; i++)
		{
			System.out.print(ds.modifyInt(dataSet[i]));
			
			if(i < dataSet.length-1)
				System.out.print(",");
		}
		System.out.print("]");
	}
}
