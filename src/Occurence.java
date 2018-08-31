import java.util.Scanner;

public class Occurence {
	public static void main(String[] args) {
		int count = 0;
		int size, i;

		Scanner scan = new Scanner(System.in);
		String names[] = new String[30],input;
		System.out.println("Enter the name to be searched");
	    input = scan.nextLine();
		System.out.println("Enter the count of names to be entered");
		size = scan.nextInt();
		System.out.println("Enter the names");
		for (i = 0; i <=size; i++) {
			names[i] = scan.nextLine();
		
			if (names[i].equals(input))
			{
				count++;
			} 
			}
		System.out.println("Frequency is " +count);
		scan.close();
		}
	}
