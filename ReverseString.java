import java.util.Arrays;  
public class ReverseString {
	
	public static String[] reverse(String str[]) {
		String[] rev = new String[str.length];
		for (int i = 0, j = str.length - 1; j >= 0; i++, j--) 		{
			rev[i] = str[j];
		}
		return rev;
	}
	
	public static void main(String[] str) {
		//Case 1: Reverse an Array
		String[] str1 = {"P", "R","A","N","A","V","I"};
		String[] revStr = reverse(str1);
		//System.out.println(Arrays.toString(revStr));
		
		//Case 2: Reverse a word
		String word = "PRANAVI1";
		String[] revWordArr = reverse(word.split(""));
		//System.out.println(String.join("", revWordArr));
		
		//Case 3: Reverse Word in a sentence
		//Input1: PRANAVI RANJAN => RANJAN PRANAVI
		//Input2: I Love You => You Love I
		String wordSen = "I Love You";
		String[] wordSenArr = reverse(wordSen.split(" "));
		//System.out.println(String.join(" ", wordSenArr));
		
		//Case 4:Reverse a sentance
		//Input:PRANAVI RANJAN => NAJNAR IVANARP
		String sentance="PRANAVI RANJAN";
		String[] revSentanceArr = reverse(sentance.split(""));
		//System.out.println(String.join("", revSentanceArr));
		
		//Case 5:
		//Input PRANAVI RANJAN=>IVANARP NAJNAR
		String str2="PRANAVI RANJAN";
		String[] strArray=str2.split(" ");
		String[] sArray=new String[strArray.length]; 
			for(int count=0;count<=strArray.length-1;count++){
				String[] reverseStrArr = reverse((strArray[count]).split("")); //Input: ["p", "r"] => ["r", "p"]
				sArray[count] = String.join("", reverseStrArr); // "rp"
				
			}
			// ["rp", "ar"]
		 //System.out.println(String.join(" ",sArray)); // "rp ar"
		 
		//Case 6:
		//Input PRANAVI RANJAN=>RANJAN PRANAVI
		String string="PRANAVI RANJAN";
		String[] strArr=reverse(string.split(" "));//Input:["PRANAVI","RANJAN"]=>["RANJAN","PRANAVI"]
		//System.out.println(String.join(" ",strArr));
		
		//Case 7
		//Input PRANAVI RANJAN=>IVANARP RANJAN
		String string1="PRANAVI RANJAN";
		String[] s4=string1.split(" ");//["PRANAVI","RANJAN"]
		String[] reverString=reverse(s4[0].split(""));//Input--["P","R".....],Output---["R","P"]
		s4[0]=String.join("",reverString);
		System.out.println(s4[0]);
		System.out.println(String.join(" ",s4));
		
		
	}
}