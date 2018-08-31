import java.util.Scanner;
public class IdentifyPalindrome {
public static void main(String[] args) {
	int k=0;
	int count=0;
	String b="";
	String temp="";
	Scanner input=new Scanner(System.in);
	String word[]=new String[10];	
	System.out.println("give 10 inputs");
	for(int i=0;i<10;i++)
	{
		word[i]=input.nextLine();
	}
	String palindrome[] = new String[10];
	for( int i=0;i<10;i++)
	{
		int n=word[i].length();
		for(int j=n-1;j>=0;j--)
		{
			b=b+word[i].charAt(j);
		}
		if(word[i].equals(b))
		{
			count++;
			palindrome[k]=word[i];
			k++;
		}
		b="";
	}
	System.out.println("No. of palindromes: "+count);
	for(int j=0;j<count-1;j++)
	{
		for(int i=0;i<count-j-1;i++)
		{
			int n=palindrome[i].length();
			int m=palindrome[i+1].length();
			if(n<m)
			{
				temp=palindrome[i+1];
				palindrome[i+1]=palindrome[i];
				palindrome[i]=temp;
			}
		}
	}
	System.out.println("palindromes in descending order : ");
	for(int i=0;i<count;i++)
	{
		int n=palindrome[i].length();
		System.out.println(palindrome[i]+" : "+n);
	}
	input.close();
}
}
