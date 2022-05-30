package com.samtech.shoprest.comperator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

import org.apache.commons.lang3.StringUtils;
import org.apache.tomcat.jni.Local;

import com.samtech.shoprest.model.Student;

public class DobComparator implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {
		
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		System.out.println("std dob :::" + s1.getDob() +" :: "+s2.getDob());
		
		LocalDate myd1 = LocalDate.parse(s1.getDob(), myFormatObj);
		LocalDate myd2 = LocalDate.parse(s2.getDob(), myFormatObj);
		 
		//String mydate1 = myFormatObj.format(myd1);
		//String mydate2 = myFormatObj.format(myd2);

			return myd1.compareTo(myd2);
		
		

		
	}
	
}

	// This method will take input a String representing the date in MM-DD-YYYY
	// format.
	// returns a String representing the same date in YYYY-MM-DD format
	
	/*
	 * private String convertDateFormat(String date) {
	 * 
	 * String[] tokens = StringUtils.split(date, "-");
	 * 
	 * // String newDate = tokens[0] + "-" + tokens[1] + "-" + tokens[2];
	 * 
	 * System.out.println("DD :" + tokens[0]); System.out.println("MM :" +
	 * tokens[1]); System.out.println("YYYY :" + tokens[2]);
	 * 
	 * String newDate = tokens[0] + "-" + tokens[1] + "-" + tokens[2];
	 * System.out.println("NewDate :::" + newDate); return newDate; }
	 * 
	 * }
	 */
