package com.samtech.shoprest.comperator;

import java.util.Comparator;

import org.apache.commons.lang3.StringUtils;

import com.samtech.shoprest.model.Student;

public class FirstNameComparator  implements Comparator<Student> {
//StringUtils.
	@Override
	public int compare(Student s1, Student s2) {
		
		StringUtils.toRootUpperCase(s1.getFirstName());
		//String str1 = s1.getFirstName();
	//str1.
		//return s1.getFirstName().StringUtils.toRootUpperCase(null).compareTo(s2.getFirstName()StringUtils.toRootUpperCase(null));
		
		
		// TODO Auto-generated method stub
		//return xxxxx.compareTo(yyyyyyy);
	
	return StringUtils.toRootUpperCase(s1.getFirstName()).compareTo(StringUtils.toRootUpperCase(s2.getFirstName()));
		
		
	}

}
