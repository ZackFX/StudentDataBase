package studentdatabaseapp;

import java.util.Scanner;



public class student {
	
	private String firstname;
	private String lastname;
	private int gradeYear;
	private String studentId;
	private String courses;
	private int tuitionBalance=0;
	private static int costOfCourse=600;
	private static int id=1000;
	
	//Constructor:  Prompt user to enter student year and name
	public student() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter Student firstname: ");
		this.firstname= in.nextLine();
		
		System.out.print("Enter Student Lastname: ");
		this.lastname= in.nextLine();
		
		System.out.print("1- freshmen\n2 sophmore\n3 junior\n4 senior\n Enter Student class level : ");
		this.gradeYear= in.nextInt();
		
		setStudentID();		
	}
	
	//Generate ID
	private void setStudentID() {
		
		//Student Id equal grade level + ID
		id++;
		this.studentId= gradeYear + " " + id ;		
	}
	
	//Enroll in courses 
	public void enroll() {
		
		do {
			System.out.print("Enter courses to enroll: (Q to quit) " );
			Scanner in = new Scanner(System.in);
			String course =in.nextLine();
			
			if ( !course.equals("Q")) {
				courses= courses + "\n  " + course;
				tuitionBalance= tuitionBalance + costOfCourse ;					
			}
			else { 
				break; 
				}
		}
		while ( 1!=0 );
	}
	
	// View Balance 
	public void viewBalance() {
		
		//System.out.println( "Your balance is : $" + tuitionBalance);	
	}
	
	//Pay Tuition
	public void payTuition() {
		
		System.out.print("Enter your payment: ");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance= tuitionBalance - payment;
		//System.out.println( " Thank your for paying $" + payment);
		viewBalance();		
	}

	//Show status
	public String showInfo() {
		return "Name: " + firstname + "  " + lastname +
				"\n Grade Level: "	+ gradeYear +
				"\n ID: " + studentId +
				"\n Courses enrolled:  " + courses +
				"\n Balance: $" + tuitionBalance;		
	}
}
