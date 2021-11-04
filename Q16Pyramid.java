package interviewquestions;

import java.util.Scanner;

public class Q16Pyramid {

	public static void main(String[] args) {
		/*
	  	Ask user to enter the number of lines of a inverted half pyramid.
	  	Type a program to create the inverted half pyramid.
	    For example if the number of lines is 5, the pyramid will be like;  * * * * *
																			* * * *
																			* * * 
																			* *
																			*
    */
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of lines of a half pyramid..");
		int num=scan.nextInt();
//		
//		for(int i=num;i>0;i--) {
//			for( int j=i;j>0;j--) {
//				System.out.print("* ");
//			}System.out.println();
//		}
//		
		for (int i=0; i<5; i++) {
	        for(int j=i; j<5; j++){
	            System.out.print("* ");
	        }
	        System.out.println();
	    }

		
	    

	}

}
