package TuteLab1;

import java.io.IOException;
import java.util.Scanner;

public class ItemDriverClassQ1  {

// Tutorial Prac 1
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		boolean cont;
		
		
		try {
			
			do {
				
			
				
			
			String ItemCode;
			String Description;
			double ItemPrice;
			System.out.print("Enter a catalogue code: ");
			ItemCode = scan.nextLine();
			System.out.print("Enter a description: ");
			Description = scan.nextLine();
			System.out.print("Enter a price: ");
			ItemPrice = scan.nextDouble();
			if (scan.hasNextLine())
				scan.nextLine();
			CatalogueItem item = new CatalogueItem(ItemCode, Description, ItemPrice);
			double itemTax = item.getPrice() * item.GetTax();
			
			System.out.print("The item details are: ");
			System.out.println();
			System.out.print("Code: " + item.getCode());
			System.out.println();
			System.out.print("Description: " + item.getCode());
			System.out.println();
			System.out.printf("Price: " + "%-10.2f", item.getPrice() + itemTax);
			System.out.println();
			System.out.printf("Tax: " + "%-10.2f",  itemTax);
			System.out.println();
			System.out.print("Enter another product? Y/N ");
			String response = scan.nextLine();
			if (response.equalsIgnoreCase("Y"))
			{
				cont = true;
			}
			else
			{
				cont = false;
			}
	
		}
		while (cont);
	} 
		catch (Exception e) {
			System.out.println("Error occurred " + e.getMessage());
		}
		
		finally {
			System.out.print("End program");
		}
		}
}
