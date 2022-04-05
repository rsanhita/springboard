package com.samtech.shoprest.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	
	
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    
	private String firstName;
	private String lastName;
	
	//TODO - Change it to Calendar later
	private String dob;
	private String email;
	
	
	
	public Student(int id, String firstName, String lastName, String dob, String email) {
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
		
		    Student[] students = new Student[100];

		    Student student0 = new Student(0, "Zuber", "Thakur", "28-4-2011", "student0@testmail.com");
		    Student student1 = new Student(1, "Hansika", "Batra", "8-12-2017", "student1@testmail.com");
		    Student student2 = new Student(2, "Eshana", "Shah", "11-11-2007", "student2@testmail.com");
		    Student student3 = new Student(3, "Monisha", "Naidu", "8-8-2014", "student3@testmail.com");
		    Student student4 = new Student(4, "Kahaan", "Modi", "13-9-2006", "student4@testmail.com");
		    Student student5 = new Student(5, "Anila", "Seth", "21-5-2007", "student5@testmail.com");
		    Student student6 = new Student(6, "Alex", "Sharma", "16-4-2011", "student6@testmail.com");
		    Student student7 = new Student(7, "Raunak", "Shah", "4-8-2007", "student7@testmail.com");
		    Student student8 = new Student(8, "Anant", "Parekh", "10-10-2008", "student8@testmail.com");
		    Student student9 = new Student(9, "Salina", "Ranganathan", "6-6-2017", "student9@testmail.com");
		    Student student10 = new Student(10, "Vivaan", "Purohit", "6-6-2006", "student10@testmail.com");
		    Student student11 = new Student(11, "Candy", "Zacharia", "26-6-2017", "student11@testmail.com");
		    Student student12 = new Student(12, "Anjuli", "Biswas", "4-4-2008", "student12@testmail.com");
		    Student student13 = new Student(13, "Deshan", "Naidu", "15-3-2017", "student13@testmail.com");
		    Student student14 = new Student(14, "Kalindi", "Bawa", "20-12-2009", "student14@testmail.com");
		    Student student15 = new Student(15, "Ananta", "Parekh", "28-8-2010", "student15@testmail.com");
		    Student student16 = new Student(16, "Anang", "Mehta", "7-7-2013", "student16@testmail.com");
		    Student student17 = new Student(17, "Chahna", "Zacharia", "25-9-2017", "student17@testmail.com");
		    Student student18 = new Student(18, "Anbarasi", "Shah", "9-5-2010", "student18@testmail.com");
		    Student student19 = new Student(19, "Sadhil", "Mukherjee", "27-11-2010", "student19@testmail.com");
		    Student student20 = new Student(20, "Ranbir", "Mehta", "25-1-2013", "student20@testmail.com");
		    Student student21 = new Student(21, "Bhuv", "Zacharia", "3-11-2007", "student21@testmail.com");
		    Student student22 = new Student(22, "Akanksh", "Sharma", "27-3-2017", "student22@testmail.com");
		    Student student23 = new Student(23, "Lalika", "Rao", "18-6-2017", "student23@testmail.com");
		    Student student24 = new Student(24, "Anandita", "Shah", "11-3-2009", "student24@testmail.com");
		    Student student25 = new Student(25, "Brahma", "Zacharia", "15-11-2014", "student25@testmail.com");
		    Student student26 = new Student(26, "Balabhadr", "Mannan", "26-10-2011", "student26@testmail.com");
		    Student student27 = new Student(27, "Aarav", "Batra", "15-7-2013", "student27@testmail.com");
		    Student student28 = new Student(28, "Jash", "Mukherjee", "7-11-2014", "student28@testmail.com");
		    Student student29 = new Student(29, "Johar", "Shah", "17-1-2011", "student29@testmail.com");
		    Student student30 = new Student(30, "Monisha", "Pandey", "26-2-2014", "student30@testmail.com");
		    Student student31 = new Student(31, "Anuradha", "Modi", "2-6-2009", "student31@testmail.com");
		    Student student32 = new Student(32, "Laksh", "Seth", "4-4-2013", "student32@testmail.com");
		    Student student33 = new Student(33, "Gambhira", "Thakur", "5-1-2013", "student33@testmail.com");
		    Student student34 = new Student(34, "Andal", "Ray", "12-8-2007", "student34@testmail.com");
		    Student student35 = new Student(35, "Bakul", "Rao", "17-9-2017", "student35@testmail.com");
		    Student student36 = new Student(36, "Lakshman", "Saxena", "8-8-2010", "student36@testmail.com");
		    Student student37 = new Student(37, "Shalee", "Ray", "21-1-2008", "student37@testmail.com");
		    Student student38 = new Student(38, "Idhant", "Parekh", "22-10-2008", "student38@testmail.com");
		    Student student39 = new Student(39, "Kalynda", "Mannan", "19-7-2011", "student39@testmail.com");
		    Student student40 = new Student(40, "Harsha", "Seth", "16-8-2014", "student40@testmail.com");
		    Student student41 = new Student(41, "Sana", "Puri", "21-9-2009", "student41@testmail.com");
		    Student student42 = new Student(42, "Mohammad", "Singh", "5-5-2007", "student42@testmail.com");
		    Student student43 = new Student(43, "Damayanti", "Rao", "25-5-2014", "student43@testmail.com");
		    Student student44 = new Student(44, "Devi", "Puri", "14-2-2007", "student44@testmail.com");
		    Student student45 = new Student(45, "Gulshan", "Sharma", "13-1-2013", "student45@testmail.com");
		    Student student46 = new Student(46, "Nimit", "Mehta", "7-7-2011", "student46@testmail.com");
		    Student student47 = new Student(47, "Taksh", "Thakur", "1-1-2011", "student47@testmail.com");
		    Student student48 = new Student(48, "Anala", "Bawa", "8-4-2011", "student48@testmail.com");
		    Student student49 = new Student(49, "Artha", "Naidu", "10-2-2010", "student49@testmail.com");
		    Student student50 = new Student(50, "Anaka", "Mukherjee", "9-1-2011", "student50@testmail.com");
		    Student student51 = new Student(51, "Balakrish", "Saxena", "3-3-2009", "student51@testmail.com");
		    Student student52 = new Student(52, "Ishani", "Ray", "12-12-2009", "student52@testmail.com");
		    Student student53 = new Student(53, "Shalene", "Singh", "19-11-2010", "student53@testmail.com");
		    Student student54 = new Student(54, "Drisana", "Singh", "13-1-2008", "student54@testmail.com");
		    Student student55 = new Student(55, "Hem", "Purohit", "9-9-2009", "student55@testmail.com");
		    Student student56 = new Student(56, "Shaleena", "Bawa", "28-12-2009", "student56@testmail.com");
		    Student student57 = new Student(57, "Dasya", "Biswas", "14-10-2013", "student57@testmail.com");
		    Student student58 = new Student(58, "Jivan", "Thakur", "12-4-2008", "student58@testmail.com");
		    Student student59 = new Student(59, "Taarush", "Mukherjee", "23-7-2013", "student59@testmail.com");
		    Student student60 = new Student(60, "Rishit", "Ray", "24-12-2006", "student60@testmail.com");
		    Student student61 = new Student(61, "Neesha", "Mehta", "6-10-2013", "student61@testmail.com");
		    Student student62 = new Student(62, "Indu", "Sharma", "10-10-2011", "student62@testmail.com");
		    Student student63 = new Student(63, "Charu", "Rao", "14-6-2006", "student63@testmail.com");
		    Student student64 = new Student(64, "Hansika", "Bawa", "3-3-2006", "student64@testmail.com");
		    Student student65 = new Student(65, "Shanta", "Zacharia", "12-12-2006", "student65@testmail.com");
		    Student student66 = new Student(66, "Mahavira", "Modi", "13-5-2007", "student66@testmail.com");
		    Student student67 = new Student(67, "Gian", "Mukherjee", "15-3-2006", "student67@testmail.com");
		    Student student68 = new Student(68, "Mahavir", "Purohit", "9-9-2017", "student68@testmail.com");
		    Student student69 = new Student(69, "Salena", "Bawa", "4-12-2006", "student69@testmail.com");
		    Student student70 = new Student(70, "Anala", "Mukherjee", "5-9-2006", "student70@testmail.com");
		    Student student71 = new Student(71, "Durga", "Singh", "20-8-2010", "student71@testmail.com");
		    Student student72 = new Student(72, "Ishank", "Bawa", "23-11-2007", "student72@testmail.com");
		    Student student73 = new Student(73, "Mahesh", "Rao", "10-6-2009", "student73@testmail.com");
		    Student student74 = new Student(74, "Raj", "Parekh", "27-7-2011", "student74@testmail.com");
		    Student student75 = new Student(75, "Jay", "Seth", "2-2-2007", "student75@testmail.com");
		    Student student76 = new Student(76, "Elina", "Saxena", "18-2-2010", "student76@testmail.com");
		    Student student77 = new Student(77, "Kevin", "Pandey", "18-10-2011", "student77@testmail.com");
		    Student student78 = new Student(78, "Shantai", "Ranganathan", "1-1-2008", "student78@testmail.com");
		    Student student79 = new Student(79, "Shaili", "Mehta", "16-4-2013", "student79@testmail.com");
		    Student student80 = new Student(80, "Shaila", "Singh", "24-4-2013", "student80@testmail.com");
		    Student student81 = new Student(81, "Chaitanya", "Puri", "2-10-2008", "student81@testmail.com");
		    Student student82 = new Student(82, "Hanita", "Gill", "22-2-2007", "student82@testmail.com");
		    Student student83 = new Student(83, "Anjali", "Pandey", "5-5-2014", "student83@testmail.com");
		    Student student84 = new Student(84, "Anbu", "Mukherjee", "1-9-2009", "student84@testmail.com");
		    Student student85 = new Student(85, "Durga", "Saxena", "1-5-2010", "student85@testmail.com");
		    Student student86 = new Student(86, "Nisha", "Ray", "20-4-2008", "student86@testmail.com");
		    Student student87 = new Student(87, "Chaitali", "Saxena", "17-5-2014", "student87@testmail.com");
		    Student student88 = new Student(88, "Jaya", "Saxena", "11-7-2008", "student88@testmail.com");
		    Student student89 = new Student(89, "Anju", "Purohit", "11-11-2010", "student89@testmail.com");
		    Student student90 = new Student(90, "Himesh", "Ranganathan", "16-12-2017", "student90@testmail.com");
		    Student student91 = new Student(91, "Kalinda", "Mehta", "24-8-2014", "student91@testmail.com");
		    Student student92 = new Student(92, "Lata", "Parekh", "7-3-2017", "student92@testmail.com");
		    Student student93 = new Student(93, "Rashana", "Zacharia", "22-6-2006", "student93@testmail.com");
		    Student student94 = new Student(94, "Harshad", "Purohit", "6-2-2014", "student94@testmail.com");
		    Student student95 = new Student(95, "Divya", "Ranganathan", "2-2-2010", "student95@testmail.com");
		    Student student96 = new Student(96, "Kaeya", "Sharma", "3-7-2008", "student96@testmail.com");
		    Student student97 = new Student(97, "Angee", "Thakur", "14-2-2014", "student97@testmail.com");
		    Student student98 = new Student(98, "Yash", "Mehta", "19-3-2009", "student98@testmail.com");
		    Student student99 = new Student(99, "Rashanda", "Mukherjee", "23-3-2006", "student99@testmail.com");			
			
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
	


