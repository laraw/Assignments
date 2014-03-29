package ClassicModels;

import java.util.Scanner;






public class MainMenu {

	public static void main  (String[] args) throws ClassNotFoundException {
		
		Scanner console = new Scanner(System.in);
		System.out.println("Enter a product line name: ");
		String productLine = console.nextLine();
		boolean productLineFound;
		productLineFound = DatabaseHelper.checkProductLine(productLine);
		while (productLineFound) {
			
			System.out.println("Product line exists!");
			System.out.println("Please enter a product line: ");
			productLine = console.nextLine();
			productLineFound = DatabaseHelper.checkProductLine(productLine);
		}
		
		System.out.println("Enter a product line description: ");
		String productDesc = new String(console.nextLine());
		ProductLine newProductLine = new ProductLine(productLine, productDesc);
		DatabaseHelper.createProductLine(newProductLine);
		console.close();
		
//		Scanner console = new Scanner (System.in);
//		System.out.println("Welcome to Classic Models. Enter a selection from the menu. ");
//		System.out.println("A - Create a new Product");
//		System.out.println("B - Create a new Product Line");
//		System.out.print("X - Exit");
//		Character userinput = new Character(console.nextLine().charAt(0));
//		
//		switch (userinput)
//		{
//			case ('A'):
//				Progs.createNewProductLine();
//			break;
//			case ('B'):
//				Progs.createNewProductLine();
//			break;
//			case ('X'):
//			break;
//		}
//			
//		console.close();

	}

}
