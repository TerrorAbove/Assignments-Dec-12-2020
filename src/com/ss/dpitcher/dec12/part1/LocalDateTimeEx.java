package com.ss.dpitcher.dec12.part1;

import java.time.LocalDateTime;

/**
 * 
 * @author David Pitcher
 *
 */
public class LocalDateTimeEx
{
	public static void main(String[] args)
	{
		//LocalDateTime representing the time 9:30 AM on December 4th, 2000.
		LocalDateTime ldt = LocalDateTime.of(2000, 12, 4, 9, 30);
		System.out.println(ldt);
	}
}
