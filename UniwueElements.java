package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;



public class UniwueElements {

	public static void main(String[] args) {
		/*   create  a list by getting the list elements from user   
		 * if there is duplicated elements remove them from the list   
		 * ask user to stop if they are done with words as   
		 * Enter list elements, to stop entrance press '*'    */
		
		List<String>list=new ArrayList<>();
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the elements of a list. If you want to stop entrance press * ");
		
		String str1="";
		
		while(!(str1.equals("*"))) {
			
			str1=scan.next();
	
		if(!str1.equals("*")){
			
			list.add(str1);
			
		}
	
		}
		
		System.out.println(list);
		Set<String>unique=new HashSet<>(list);
		
		System.out.println(unique);
		
		
		
	}

}
