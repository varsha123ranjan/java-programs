import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class DuplicateCharacter{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any String");
	String str=sc.next();
	duplicateCharacters(str);
	}
public static void duplicateCharacters(String str){
        if(str==null){
	System.out.println("null string");
	}
	if(str.isEmpty()){
	System.out.println("Empty string");
	}
	if(str.length()==1){
	System.out.println("single char string");
	}
char[] words=str.toCharArray();
Map<Character,Integer> charMap=new HashMap<Character,Integer>();
	for(char ch:words){
		if(charMap.containsKey(ch)){
			charMap.put(ch,charMap.get(ch)+1);
			}else{
			charMap.put(ch,1);
				}
	}
System.out.println(charMap.entrySet());
Set<Map.Entry<Character,Integer>> entrySet=charMap.entrySet();
	for(Map.Entry<Character,Integer> entry:entrySet){
		if(entry.getValue()>1){
			System.out.println(entry.getKey()+":"+entry.getValue());
			}
	}
}




}