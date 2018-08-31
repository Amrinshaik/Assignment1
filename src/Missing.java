import java.util.Scanner;
public class Missing {
public static void main(String[] args)
{
	int arr[]=new int[10], n=3, total=0;
	Scanner no=new Scanner(System.in);
	System.out.println("Enter the array");
	for(int i=0;i<n;i++)
	{
	arr[i]=no.nextInt();
	}
	total=(n+1)*(n+2)/2;
	for(int i=0;i<n;i++)
	{
		total=total-arr[i];
	}
	System.out.println("missing element: " +total);
	no.close();
}
}