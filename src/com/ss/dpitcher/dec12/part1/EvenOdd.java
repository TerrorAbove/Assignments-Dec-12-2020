package com.ss.dpitcher.dec12.part1;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author David Pitcher
 *
 */
public class EvenOdd
{
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList(args);
		Object[] a = list.stream().map((str) -> {
			int i = 0;
			
			try
			{
				i = Integer.parseInt(str);
			}
			catch(NumberFormatException nfe)
			{
				nfe.printStackTrace();
				System.exit(1);
			}
			
			if(i % 2 == 0)
			{
				return "e"+i;
			}
			else
			{
				return "o"+i;
			}
		}).toArray();
		
		Utils.printArraySingleLine(a);
	}
}
