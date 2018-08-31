import java.util.Scanner;
public class Duplicates {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the string");
	String input = in.nextLine();
    char ch;
    String ans="";
    for(int i=0;i<input.length();i++)
    {
    	ch=input.charAt(i);
    	if(ch != ' ')
    	{
    		ans=ans+ch;
    		input=input.replace(ch, ' ');
    	}
    }
	System.out.println(" "+ans);
	in.close();
}
}
