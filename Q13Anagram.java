package interviewquestions;

public class Q13Anagram {

	public static void main(String[] args) {
		/*
		  Ask user to enter 2 Strings.
		  If the characters and the numbers of characters of the Strings are same then print "Anagram" on the console.
		  Otherwise, print "Not Anagram" on the console. 
		  Ignore cases.
		  For example; "Mary" and "army" and "RAMY" are Anagrams.
		*/
		
		String name1="Maray";
		String name2="aRamy";
		
		String arr1[]=name1.split("");
		String arr2[]=name2.split("");
		int count=0;
		for(int i=0; i<arr1.length;i++) {
			for(int j=i+1; j<arr2.length;j++) {
				if(arr1[i].equalsIgnoreCase(arr2[j])) {
					
				}
				
			}
			count++;
		}
	if(count==name1.length()&&count==name2.length()) {
		System.out.println("Anagram");
	}else {System.out.println("Anagram degil");
	}System.out.println(count);
	}
	}


