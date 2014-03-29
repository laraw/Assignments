package TuteLab1;

import java.util.ArrayList;
import java.util.Scanner;

class ItemDriverClassQ23 {

	
	public static void main(String[] args) {
		String ItemCode;
		String Description;
		double ItemPrice;
		String country;
		
		ArrayList<CatalogueItem> items = new ArrayList<CatalogueItem>();
		Scanner scan = new Scanner(System.in);
		boolean cont;
		
		
		do {
		System.out.print("Enter a catalogue code: ");
		ItemCode = scan.nextLine();
		System.out.print("Enter a description: ");
		Description = scan.nextLine();
		System.out.println("Enter a country: ");
		country = scan.nextLine();
		System.out.print("Enter a price: ");
		ItemPrice = scan.nextDouble();
		if (scan.hasNextLine())
			scan.nextLine();
		CatalogueItem item = new CatalogueItem(ItemCode, Description, ItemPrice);
		double itemTax = item.getPrice() * item.GetTax();
		
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
		
		if (country.isEmpty()) {
			items.add(new CatalogueItem(ItemCode, Description, ItemPrice ));
		}
		
		else {
			items.add(new ImportedItem(ItemCode, Description, ItemPrice,country));
			
		}

	}
	while (cont);

	// Print details of products 
	System.out.println();
	for (int i = 0; i < items.size(); i++) {
		System.out.print("The item details are: ");
		System.out.println();
		System.out.print("Code: " + items.get(i).getCode());
		System.out.println();
		System.out.print("Description: " + items.get(i).getDesc());
		System.out.println();
		if (items.get(i) instanceof ImportedItem){
			System.out.println("Country: " + ((ImportedItem)items.get(i)).getCountry());
			System.out.println();
		}
		
		System.out.printf("Price: " + "%-10.2f", items.get(i).getPrice() + (items.get(i).getPrice()) * items.get(i).GetTax());
		System.out.println();
		System.out.printf("Tax: " + "%-10.2f",  (items.get(i).getPrice()) * items.get(i).GetTax());
		System.out.println();
	}
	System.out.println();
	System.out.println();

}
}


