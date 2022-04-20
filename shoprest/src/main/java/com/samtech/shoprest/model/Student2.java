package com.samtech.shoprest.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name = "student")
public class Student2 {
	
	
    @Id
    @Column(name = "id")
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name = "first_name")
	private String firstName;
    
    @Column(name = "last_name")
	private String lastName;
	
	//TODO - Change it to Calendar later
    @Column(name = "dob")
	private String dob;
    
   

	@Column(name = "last_name")
	private String email;
	
	
	
	public Student2(long id, String firstName, String lastName, String dob, String email) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.email = email;
	}
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	/*
	 * public static void main (String[] args) {
	 * 
	 * //Student student = new Student(0, null, null, null, null)
	 * 
	 * createMultipleStudents(); }
	 */
	
	public void createMultipleStudents () { 
		
		    Student2[] students = new Student2[100];

		    Student2 student0 = new Student2(0, "Zuber", "Thakur", "28-4-2011", "student0@testmail.com");
		    Student2 student1 = new Student2(1, "Hansika", "Batra", "8-12-2017", "student1@testmail.com");
		    Student2 student2 = new Student2(2, "Eshana", "Shah", "11-11-2007", "student2@testmail.com");
		    Student2 student3 = new Student2(3, "Monisha", "Naidu", "8-8-2014", "student3@testmail.com");
		    Student2 student4 = new Student2(4, "Kahaan", "Modi", "13-9-2006", "student4@testmail.com");
		    Student2 student5 = new Student2(5, "Anila", "Seth", "21-5-2007", "student5@testmail.com");
		    Student2 student6 = new Student2(6, "Alex", "Sharma", "16-4-2011", "student6@testmail.com");
		    Student2 student7 = new Student2(7, "Raunak", "Shah", "4-8-2007", "student7@testmail.com");
		    Student2 student8 = new Student2(8, "Anant", "Parekh", "10-10-2008", "student8@testmail.com");
		    Student2 student9 = new Student2(9, "Salina", "Ranganathan", "6-6-2017", "student9@testmail.com");
		    Student2 student10 = new Student2(10, "Vivaan", "Purohit", "6-6-2006", "student10@testmail.com");
		    Student2 student11 = new Student2(11, "Candy", "Zacharia", "26-6-2017", "student11@testmail.com");
		    Student2 student12 = new Student2(12, "Anjuli", "Biswas", "4-4-2008", "student12@testmail.com");
		    Student2 student13 = new Student2(13, "Deshan", "Naidu", "15-3-2017", "student13@testmail.com");
		    Student2 student14 = new Student2(14, "Kalindi", "Bawa", "20-12-2009", "student14@testmail.com");
		    Student2 student15 = new Student2(15, "Ananta", "Parekh", "28-8-2010", "student15@testmail.com");
		    Student2 student16 = new Student2(16, "Anang", "Mehta", "7-7-2013", "student16@testmail.com");
		    Student2 student17 = new Student2(17, "Chahna", "Zacharia", "25-9-2017", "student17@testmail.com");
		    Student2 student18 = new Student2(18, "Anbarasi", "Shah", "9-5-2010", "student18@testmail.com");
		    Student2 student19 = new Student2(19, "Sadhil", "Mukherjee", "27-11-2010", "student19@testmail.com");
		    Student2 student20 = new Student2(20, "Ranbir", "Mehta", "25-1-2013", "student20@testmail.com");
		    Student2 student21 = new Student2(21, "Bhuv", "Zacharia", "3-11-2007", "student21@testmail.com");
		    Student2 student22 = new Student2(22, "Akanksh", "Sharma", "27-3-2017", "student22@testmail.com");
		    Student2 student23 = new Student2(23, "Lalika", "Rao", "18-6-2017", "student23@testmail.com");
		    Student2 student24 = new Student2(24, "Anandita", "Shah", "11-3-2009", "student24@testmail.com");
		    Student2 student25 = new Student2(25, "Brahma", "Zacharia", "15-11-2014", "student25@testmail.com");
		    Student2 student26 = new Student2(26, "Balabhadr", "Mannan", "26-10-2011", "student26@testmail.com");
		    Student2 student27 = new Student2(27, "Aarav", "Batra", "15-7-2013", "student27@testmail.com");
		    Student2 student28 = new Student2(28, "Jash", "Mukherjee", "7-11-2014", "student28@testmail.com");
		    Student2 student29 = new Student2(29, "Johar", "Shah", "17-1-2011", "student29@testmail.com");
		    Student2 student30 = new Student2(30, "Monisha", "Pandey", "26-2-2014", "student30@testmail.com");
		    Student2 student31 = new Student2(31, "Anuradha", "Modi", "2-6-2009", "student31@testmail.com");
		    Student2 student32 = new Student2(32, "Laksh", "Seth", "4-4-2013", "student32@testmail.com");
		    Student2 student33 = new Student2(33, "Gambhira", "Thakur", "5-1-2013", "student33@testmail.com");
		    Student2 student34 = new Student2(34, "Andal", "Ray", "12-8-2007", "student34@testmail.com");
		    Student2 student35 = new Student2(35, "Bakul", "Rao", "17-9-2017", "student35@testmail.com");
		    Student2 student36 = new Student2(36, "Lakshman", "Saxena", "8-8-2010", "student36@testmail.com");
		    Student2 student37 = new Student2(37, "Shalee", "Ray", "21-1-2008", "student37@testmail.com");
		    Student2 student38 = new Student2(38, "Idhant", "Parekh", "22-10-2008", "student38@testmail.com");
		    Student2 student39 = new Student2(39, "Kalynda", "Mannan", "19-7-2011", "student39@testmail.com");
		    Student2 student40 = new Student2(40, "Harsha", "Seth", "16-8-2014", "student40@testmail.com");
		    Student2 student41 = new Student2(41, "Sana", "Puri", "21-9-2009", "student41@testmail.com");
		    Student2 student42 = new Student2(42, "Mohammad", "Singh", "5-5-2007", "student42@testmail.com");
		    Student2 student43 = new Student2(43, "Damayanti", "Rao", "25-5-2014", "student43@testmail.com");
		    Student2 student44 = new Student2(44, "Devi", "Puri", "14-2-2007", "student44@testmail.com");
		    Student2 student45 = new Student2(45, "Gulshan", "Sharma", "13-1-2013", "student45@testmail.com");
		    Student2 student46 = new Student2(46, "Nimit", "Mehta", "7-7-2011", "student46@testmail.com");
		    Student2 student47 = new Student2(47, "Taksh", "Thakur", "1-1-2011", "student47@testmail.com");
		    Student2 student48 = new Student2(48, "Anala", "Bawa", "8-4-2011", "student48@testmail.com");
		    Student2 student49 = new Student2(49, "Artha", "Naidu", "10-2-2010", "student49@testmail.com");
		    Student2 student50 = new Student2(50, "Anaka", "Mukherjee", "9-1-2011", "student50@testmail.com");
		    Student2 student51 = new Student2(51, "Balakrish", "Saxena", "3-3-2009", "student51@testmail.com");
		    Student2 student52 = new Student2(52, "Ishani", "Ray", "12-12-2009", "student52@testmail.com");
		    Student2 student53 = new Student2(53, "Shalene", "Singh", "19-11-2010", "student53@testmail.com");
		    Student2 student54 = new Student2(54, "Drisana", "Singh", "13-1-2008", "student54@testmail.com");
		    Student2 student55 = new Student2(55, "Hem", "Purohit", "9-9-2009", "student55@testmail.com");
		    Student2 student56 = new Student2(56, "Shaleena", "Bawa", "28-12-2009", "student56@testmail.com");
		    Student2 student57 = new Student2(57, "Dasya", "Biswas", "14-10-2013", "student57@testmail.com");
		    Student2 student58 = new Student2(58, "Jivan", "Thakur", "12-4-2008", "student58@testmail.com");
		    Student2 student59 = new Student2(59, "Taarush", "Mukherjee", "23-7-2013", "student59@testmail.com");
		    Student2 student60 = new Student2(60, "Rishit", "Ray", "24-12-2006", "student60@testmail.com");
		    Student2 student61 = new Student2(61, "Neesha", "Mehta", "6-10-2013", "student61@testmail.com");
		    Student2 student62 = new Student2(62, "Indu", "Sharma", "10-10-2011", "student62@testmail.com");
		    Student2 student63 = new Student2(63, "Charu", "Rao", "14-6-2006", "student63@testmail.com");
		    Student2 student64 = new Student2(64, "Hansika", "Bawa", "3-3-2006", "student64@testmail.com");
		    Student2 student65 = new Student2(65, "Shanta", "Zacharia", "12-12-2006", "student65@testmail.com");
		    Student2 student66 = new Student2(66, "Mahavira", "Modi", "13-5-2007", "student66@testmail.com");
		    Student2 student67 = new Student2(67, "Gian", "Mukherjee", "15-3-2006", "student67@testmail.com");
		    Student2 student68 = new Student2(68, "Mahavir", "Purohit", "9-9-2017", "student68@testmail.com");
		    Student2 student69 = new Student2(69, "Salena", "Bawa", "4-12-2006", "student69@testmail.com");
		    Student2 student70 = new Student2(70, "Anala", "Mukherjee", "5-9-2006", "student70@testmail.com");
		    Student2 student71 = new Student2(71, "Durga", "Singh", "20-8-2010", "student71@testmail.com");
		    Student2 student72 = new Student2(72, "Ishank", "Bawa", "23-11-2007", "student72@testmail.com");
		    Student2 student73 = new Student2(73, "Mahesh", "Rao", "10-6-2009", "student73@testmail.com");
		    Student2 student74 = new Student2(74, "Raj", "Parekh", "27-7-2011", "student74@testmail.com");
		    Student2 student75 = new Student2(75, "Jay", "Seth", "2-2-2007", "student75@testmail.com");
		    Student2 student76 = new Student2(76, "Elina", "Saxena", "18-2-2010", "student76@testmail.com");
		    Student2 student77 = new Student2(77, "Kevin", "Pandey", "18-10-2011", "student77@testmail.com");
		    Student2 student78 = new Student2(78, "Shantai", "Ranganathan", "1-1-2008", "student78@testmail.com");
		    Student2 student79 = new Student2(79, "Shaili", "Mehta", "16-4-2013", "student79@testmail.com");
		    Student2 student80 = new Student2(80, "Shaila", "Singh", "24-4-2013", "student80@testmail.com");
		    Student2 student81 = new Student2(81, "Chaitanya", "Puri", "2-10-2008", "student81@testmail.com");
		    Student2 student82 = new Student2(82, "Hanita", "Gill", "22-2-2007", "student82@testmail.com");
		    Student2 student83 = new Student2(83, "Anjali", "Pandey", "5-5-2014", "student83@testmail.com");
		    Student2 student84 = new Student2(84, "Anbu", "Mukherjee", "1-9-2009", "student84@testmail.com");
		    Student2 student85 = new Student2(85, "Durga", "Saxena", "1-5-2010", "student85@testmail.com");
		    Student2 student86 = new Student2(86, "Nisha", "Ray", "20-4-2008", "student86@testmail.com");
		    Student2 student87 = new Student2(87, "Chaitali", "Saxena", "17-5-2014", "student87@testmail.com");
		    Student2 student88 = new Student2(88, "Jaya", "Saxena", "11-7-2008", "student88@testmail.com");
		    Student2 student89 = new Student2(89, "Anju", "Purohit", "11-11-2010", "student89@testmail.com");
		    Student2 student90 = new Student2(90, "Himesh", "Ranganathan", "16-12-2017", "student90@testmail.com");
		    Student2 student91 = new Student2(91, "Kalinda", "Mehta", "24-8-2014", "student91@testmail.com");
		    Student2 student92 = new Student2(92, "Lata", "Parekh", "7-3-2017", "student92@testmail.com");
		    Student2 student93 = new Student2(93, "Rashana", "Zacharia", "22-6-2006", "student93@testmail.com");
		    Student2 student94 = new Student2(94, "Harshad", "Purohit", "6-2-2014", "student94@testmail.com");
		    Student2 student95 = new Student2(95, "Divya", "Ranganathan", "2-2-2010", "student95@testmail.com");
		    Student2 student96 = new Student2(96, "Kaeya", "Sharma", "3-7-2008", "student96@testmail.com");
		    Student2 student97 = new Student2(97, "Angee", "Thakur", "14-2-2014", "student97@testmail.com");
		    Student2 student98 = new Student2(98, "Yash", "Mehta", "19-3-2009", "student98@testmail.com");
		    Student2 student99 = new Student2(99, "Rashanda", "Mukherjee", "23-3-2006", "student99@testmail.com");			
			
		    students[0]=student0;
			students[1]=student1;
			students[2]=student2;
			students[3]=student3;
			students[4]=student4;
			students[5]=student5;
			students[6]=student6;
			students[7]=student7;
			students[8]=student8;
			students[9]=student9;
			students[10]=student10;
			students[11]=student11;
			students[12]=student12;
			students[13]=student13;
			students[14]=student14;
			students[15]=student15;
			students[16]=student16;
			students[17]=student17;
			students[18]=student18;
			students[19]=student19;
			students[20]=student20;
			students[21]=student21;
			students[22]=student22;
			students[23]=student23;
			students[24]=student24;
			students[25]=student25;
			students[26]=student26;
			students[27]=student27;
			students[28]=student28;
			students[29]=student29;
			students[30]=student30;
			students[31]=student31;
			students[32]=student32;
			students[33]=student33;
			students[34]=student34;
			students[35]=student35;
			students[36]=student36;
			students[37]=student37;
			students[38]=student38;
			students[39]=student39;
			students[40]=student40;
			students[41]=student41;
			students[42]=student42;
			students[43]=student43;
			students[44]=student44;
			students[45]=student45;
			students[46]=student46;
			students[47]=student47;
			students[48]=student48;
			students[49]=student49;
			students[50]=student50;
			students[51]=student51;
			students[52]=student52;
			students[53]=student53;
			students[54]=student54;
			students[55]=student55;
			students[56]=student56;
			students[57]=student57;
			students[58]=student58;
			students[59]=student59;
			students[60]=student60;
			students[61]=student61;
			students[62]=student62;
			students[63]=student63;
			students[64]=student64;
			students[65]=student65;
			students[66]=student66;
			students[67]=student67;
			students[68]=student68;
			students[69]=student69;
			students[70]=student70;
			students[71]=student71;
			students[72]=student72;
			students[73]=student73;
			students[74]=student74;
			students[75]=student75;
			students[76]=student76;
			students[77]=student77;
			students[78]=student78;
			students[79]=student79;
			students[80]=student80;
			students[81]=student81;
			students[82]=student82;
			students[83]=student83;
			students[84]=student84;
			students[85]=student85;
			students[86]=student86;
			students[87]=student87;
			students[88]=student88;
			students[89]=student89;
			students[90]=student90;
			students[91]=student91;
			students[92]=student92;
			students[93]=student93;
			students[94]=student94;
			students[95]=student95;
			students[96]=student96;
			students[97]=student97;
			students[98]=student98;
			students[99]=student99;
			
			System.out.println(students.length);

		}
		


	}
	


