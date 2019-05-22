package studentdatabaseapp;

import java.util.Scanner;

public class studentdatabaseapp {

	public static void main(String[] args) {
		
		
		
		//ask how many users we want to add
		System.out.print( " How many students you want to add:  ");
		Scanner in= new Scanner(System.in);
		int num = in.nextInt();
		student[] students= new student[num];
		
		
		
		//create n number of students
		for (int n=0;n<num;n++) {
			students[n] = new student();
			students[n].enroll();
			students[n].viewBalance();
			students[n].payTuition();
			
		}
		
	
		for (int n=0;n<num;n++) {
		System.out.println( students[n].showInfo());
		}

	}

}
