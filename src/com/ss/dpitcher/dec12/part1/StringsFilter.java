package com.ss.dpitcher.dec12.part1;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * 
 * @author David Pitcher
 *
 */
public class StringsFilter
{
	public static void main(String[] args)
	{
		filter(Arrays.asList(args).stream()).forEach(str -> {
			System.out.println(str);
		});
	}
	
	/**
	 * Filters a list of strings by the following rule: Keep all 3 letter strings beginning with 'a'.
	 * @param stream the list of strings
	 * @return the filtered list of strings
	 */
	private static Stream<String> filter(Stream<String> stream)
	{
		return stream.filter(str -> {
			if(str != null && str.length() == 3)
			{
				if(str.charAt(0) == 'a' && Character.isLetter(str.charAt(1)) && Character.isLetter(str.charAt(2)))
				{
					return true;
				}
			}
			return false;
		});
	}
}
