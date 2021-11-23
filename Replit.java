package practice;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Replit {

	public static void main(String[] args) {
//		Ask user to enter a name and a character, then check how many times the character is repeated in the name using loops in the name
//
//		e.g:
//
//		char ch1= 'a' ;
//
//		String name =“John came late"
//
//		Expected Output: Number of a = 2
		
	
//		String name="John came late";
//	
//		char c='a';
//		
//		
//		int sumOfChars=0;
//		
//		for(int i=0;i<name.length();i++) {
//			if(name.charAt(i)==c) {
//				sumOfChars++;
//			}
//			
//			
//		}
//		System.out.println("Number of a is: "+sumOfChars);
		
//		   int sum=0;
//		    for(int i=0;i<101;i++){
//		      sum+=i;
//		    }
//		    System.out.print( "Sum of Natural Numbers "+sum);
	
		
//	    Scanner scan=new Scanner(System.in);
//	    System.out.println("Enter 2 integer to find GCD and LCM");
//	    int num1=scan.nextInt();
//	    int num2=scan.nextInt();
//
//	    int GCD=0;
//	    int LCM=1;
//	    for(int i=1;i<=num1||i<=num2;i++){
//	      if(num1%i==0&&num2%i==0){
//	        GCD=i;
//	   
//	      }
//	     
//	    
//	   	     LCM=num1/GCD*num2/GCD*GCD;
//
//
//	    }
//System.out.println(GCD);
//System.out.println(LCM);
		
//		Write a code that returns the duplicate chars in a String array.(interview Question)
//
//		Input :
//
//		String str=“Javaisalsoeasy”
//
//		Output: [a, s]
		
		String str="Javass";
		String arr[]=str.split("");
		List<String>list=new ArrayList<>();
		System.out.println(Arrays.toString(arr));
		
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i].equals(arr[j])) {
						list.add(arr[i]);
				
						System.out.println(list);
					
				}
					
			}
				
		}
//			
		
		
//		int x=6;
//		System.out.print(x+"!=");
//		while(x>0) {
//			System.out.print(x+"*");
//			x--;
//		}
//		System.out.println("="+factorial(6));
//
//	  }
//	  public static int factorial(int x){
//	    
//	    int result=1;
//	    for(int i=x;i>0;i--){
//	      result=result*i;
//	      
//	  
//	      
//	    }
//	    return result; 
	

//	    int givenNumber=6;
//	    int sum=0;
//
//	    for(int i=1;i<givenNumber;i++){
//	      if(givenNumber%i==0){
//	        sum=sum+i;
//	 
//	 
//	    }}
//	   
//	       if(sum==givenNumber){
//		          System.out.println(givenNumber+" is Perfect Number");
//		       
//
//	        }else {
//	        System.out.println(givenNumber+" is not Perfect Number");
//	        }
//	      
			
	    
//		   for(char c='a';c<='z';c++){
//			   int ascii=c;
//			      System.out.print(" Ascii value of "+c+" = "+ ascii);
//			    }
//	    Scanner scan=new Scanner(System.in);
//	    System.out.println("Enter your weight..");
//	    double weight=scan.nextDouble();
//	    System.out.println("Enter your height..");
//	    double height=scan.nextDouble();
//
//	    double BMI=weight/(height*height);
//
//	     if(BMI>29){
//	      System.out.println("Your BMI is: "+BMI+" obese");
//	    }   else if(BMI>25){
//	      System.out.println("Your BMI is: "+BMI+" You re fat");
//	    }  else if(BMI>18.5){
//	      System.out.println("Your BMI is: "+BMI+" Your weight is ideal");
//	    }else {System.out.println("Your BMI is: "+BMI+" Your weight is weak");
//
//	    }
//		Scanner scan=new Scanner(System.in);
//	    System.out.println("Name..");
//	    String name=scan.nextLine();
//	    System.out.println("Surname..");
//	    String surName=scan.nextLine();
//	    System.out.println("Credit Card Number..");
//	    String ccn=scan.nextLine();
//	    
//	    System.out.print(name.substring(0, 1).toUpperCase());
//	    int i=name.length()-2;
//	    
//	    while(i>0) {
//	    	System.out.print("*");
//	    	i--;
//	    }
//	    
//	  System.out.print(" "+surName.substring(0, 1).toUpperCase());
//    int j=surName.length()-2;
//	    
//	    while(j>0) {
//	    	System.out.print("*");
//	    	j--;
//	    }
//	    System.out.println();
//	    
//	    if(ccn.length()==16) {
//	    System.out.println("CCN:**** **** **** "+ccn.substring(13));
//	  }else{System.out.println("Invalid credit card number");
//	  
//	  }
//		 Scanner scan=new Scanner(System.in);
//		    System.out.println("Enter a name with 3 character..");
//		    String name=scan.next();
//		    String result=name.charAt(0)==name.charAt(1)||name.charAt(0)==name.charAt(2)?"String has duplicate characters":"String has unique characters";
//		    System.out.println(result);
		
//		  String name1="mehmet";
//		    String name2="ahmet";
//		    String nameNew="";
//		    if(name1.length()%2==0){
//		      nameNew=name1.substring(0, name1.length()/2)+name2+name1.substring(name1.length()/2);
//		      System.out.println(nameNew);
//		    }else {System.out.println("Name2 cannot be inserted in the name1");
//		    }
//		 Scanner scan=new Scanner(System.in);
//		    System.out.print("Enter a number..");
//		    int num=scan.nextInt();
//		    System.out.println(num*num*num/2);
		
//		   Scanner scan=new Scanner(System.in);
//		      System.out.print("Enter minutes");
//				    int min=scan.nextInt();
//		        
//		        int year=min/(365*24*60);
//		        int day=min%(365*24*60)/(24*60);
//		        System.out.println(min+" dakika yaklasik "+year+" yil "+day+" gündür");

//		Scanner scan=new Scanner(System.in);
//	    System.out.println("Günde kac bardak cay iciyorsunuz?");
//	    int cay=scan.nextInt();
//	    System.out.println("Bir bardak caya ne kadar seker atiyorsunuz?");
//	    double seker=scan.nextInt();
//	    double toplam=cay*seker*1,7*365;
//
//	    System.out.println("Yilda "+cay*seker*1.7*365+" kg seker kullaniyor.");
		
//		int max=Integer.MAX_VALUE;
//		int min=Integer.MIN_VALUE;
//		
//		System.out.println("Max: "+max);
//		System.out.println("Min: "+min);

	}
	

}
