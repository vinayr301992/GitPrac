package javaPrac;

public class FindingVowels {

	public static void main(String[] args) {

		String str="Check if vowels are present in a string";
		String strCase=str.toLowerCase();
		
		for(int i=0;i<strCase.length();i++) {
			if(strCase.charAt(i)=='a' ||strCase.charAt(i)=='e'||strCase.charAt(i)=='i'||strCase.charAt(i)=='o'||strCase.charAt(i)=='u') {
				
				System.out.println(" Given String contains "+ strCase.charAt(i)+ " at index "+ i);
				 
			}
			
			
		}
		
		
	}

}
