import java.util.Scanner;
public class CharacterOccurence{
	public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any String:");
	String str=input.next();
	getCharOccurence(str,'a');
	}

public static void getCharOccurence(String str,char val){
	int count=0;
	for(char c:str.toCharArray()){
		if(c==val){
			count++;
			}
		}
	System.out.println(val+":"+count);
	}





}