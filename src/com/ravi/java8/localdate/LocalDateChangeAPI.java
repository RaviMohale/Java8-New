package com.ravi.java8.localdate;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalDateChangeAPI {
	public static void main(String[] args) {
		System.out.println("--------LocalDateTime-----------"+LocalDateTime.now());
		System.out.println("=======  LocalDate========="+LocalDate.now());
		System.out.println("**********  LocalTime*******"+LocalTime.now());
		
		LocalDateTime localDateTime = LocalDateTime.of(2023, Month.FEBRUARY, 2, 01, 0);
		System.out.println(localDateTime);
		System.out.println(localDateTime.plusDays(12));
		System.out.println(localDateTime.minusDays(2));
	LocalDateTime locDate1 = LocalDateTime.of(2022, Month.SEPTEMBER, 3, 01, 0);
	
	// get localDateTime use duration........
		Duration d1 = Duration.between(localDateTime, locDate1);
		System.out.println("duration between the two date"+d1);
		
	// get localDate use Period...........
		
		LocalDate ld1 = LocalDate.now();
		LocalDate ld2 = LocalDate.of(1990, 02, 01);
		Period p1 = Period.between(ld1, ld2);
		System.out.println("---days---"+p1.getDays());
		System.out.println("----month---- "+p1.getMonths());
		System.out.println("---     year   ---"+p1.getYears());
		
		// ZoneDatetime  
		
		ZonedDateTime z1 = ZonedDateTime.now();
		System.out.println("!!!!!!!!!!!!!!  ZoneDateTime!!!!!!!!!!"+z1);
		
		// write a program to convert the IST into CST
		// ZoneID.of("America/Chicago") ;
		LocalDateTime lz1 = LocalDateTime.now();
		
		ZoneId usTimeZone = ZoneId.of("America/Chicago");
		System.out.println("US CTC time "+ z1.withZoneSameInstant(usTimeZone));
		System.out.println("local time"+ lz1);
		
		ZoneId ausTimeZone = ZoneId.of("Australia/Darwin");
		System.out.println("Austalia ACT time  "+ z1.withZoneSameInstant(ausTimeZone));
		System.out.println("local time  "+ lz1);
	}

}
