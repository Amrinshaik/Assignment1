import java.util.Scanner;
public class palindrome {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n, rem, rev=0, original;
		System.out.println("Enter the input");
		n=obj.nextInt();
		original=n;
		while(n != 0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(rev==original)
			System.out.println(true);
			else
				System.out.println(false);
		obj.close();
	}

}
