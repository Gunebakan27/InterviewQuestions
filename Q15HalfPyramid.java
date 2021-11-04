package interviewquestions;

import java.util.Scanner;

public class Q15HalfPyramid {

	public static void main(String[] args) {

		/*
	  	Ask user to enter the number of lines of a half pyramid.
	  	Type a program to create the half pyramid.
  	    For example if the number of lines is 5, the pyramid will be like;  * 
																		    * * 
																		    * * * 
																		    * * * * 
																		    * * * * *
    */
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of lines of a half pyramid..");
		int num=scan.nextInt();
		
		for(int i=0;i<num;i++) {
			
			
			for(int j=0; j<=i;j++) {
				System.out.print("* ");
				
			}System.out.println();
		}
		
		
	}

}
