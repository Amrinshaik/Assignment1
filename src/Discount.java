import java.util.Scanner;
public class Discount {
 public static void main(String[] args) {
	 Scanner object=new Scanner(System.in);
	 float newItem, newItemPrice, discount;
	 System.out.println("Enter the original price");
	 newItem=object.nextFloat();
	 System.out.println("Enter the discount");
	 discount=object.nextFloat();
	 newItemPrice = newItem-(newItem*(discount/100));
	 System.out.print("Price after discount is:" +newItemPrice);
	 object.close();
 }
}
