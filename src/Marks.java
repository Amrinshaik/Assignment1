import java.util.Scanner;
public class Marks {
public static void main(String[] args) {
	Scanner a=new Scanner(System.in);
	int arr[]=new int[3];
	int i;
	System.out.println("Enter 3 subject marks");
	for(i=0;i<3;i++) {
		arr[i]=a.nextInt();
	}
		if(arr[0]>60 && arr[1]>60 && arr[2]>60)
		{
			System.out.println("passed");
		}
		else if((arr[0]>60 && arr[1]>60)||(arr[1]>60 && arr[2]>60)||(arr[2]>60 && arr[1]>60))
		{
			System.out.println("promoted");
		}
		else
		{
			System.out.println("failed");
		}
		a.close();
}
}
