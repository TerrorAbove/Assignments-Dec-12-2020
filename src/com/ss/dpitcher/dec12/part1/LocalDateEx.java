package com.ss.dpitcher.dec12.part1;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * 
 * @author David Pitcher
 *
 */
public class LocalDateEx
{
	public static void main(String[] args)
	{
		int year = 1500 + (int)(Math.random() * 1000);
		int month = 1 + (int)(Math.random() * 12);
		int day = 1 + (int)(Math.random() * 30);
		
		LocalDate date = LocalDate.of(year, month, day);
		
		System.out.println(date);

		do
		{
			date = date.minusDays(1);
		}
		while(!date.getDayOfWeek().equals(DayOfWeek.THURSDAY));
		
		System.out.println(date);
	}
}
