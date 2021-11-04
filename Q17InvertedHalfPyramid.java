package interviewquestions;

import java.util.Scanner;

public class Q17InvertedHalfPyramid {

	public static void main(String[] args) {
		
		/*
		  	Ask user to enter the number of lines of a inverted half pyramid by using numbers.
		  	Type a program to create the inverted half pyramid.
		    For example if the number of lines is 5, the pyramid will be like;  1 2 3 4 5
																				1 2 3 4 
																				1 2 3
																				1 2
																				1
	    */
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of lines of a half pyramid..");
		int num=scan.nextInt();
		
		for(int i=num;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}System.out.println();
		}
		
	}

}
