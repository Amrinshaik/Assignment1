import java.util.Scanner;
public class Linsearch {
public static void main(String[] args) {
	int num,i,x;
	int arr[]= {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter number to be searched");
	num=obj.nextInt();
	x=arr.length;
	for(i=0;i<x;i++) {
		if(arr[i]==num)
		{
			System.out.println("element found at position number " +(i+1));
			break;
		}
	}
	if(i==x)
		{
			System.out.println("element not found");
		}
	obj.close();
}
}
