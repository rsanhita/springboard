package com.samtech.shoprest.comperator;
import java.util.*;

import com.samtech.shoprest.model.Student;

	
	  
	public class  NewNameComparator implements Comparator<Student>{
		
		public int compare(Student s1,Student s2){  
			//return s1.getFirstName.compareTo(s2.getFirstName);
			
			String fname1 = s1.getFirstName();
			String fname2 = s1.getFirstName();
			
			return s1.getFirstName().compareTo(s2.getFirstName());
	}  
	}  



	