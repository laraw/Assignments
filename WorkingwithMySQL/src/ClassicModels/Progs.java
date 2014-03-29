package ClassicModels;


import java.util.Scanner;

public class Progs {
	
public static void createnewProduct() {
	Scanner console = new Scanner(System.in);
	System.out.println("Enter a product code: ");
	String productCode = console.nextLine();
	boolean productCodefound;
	productCodefound = DatabaseHelper.checkProductCode(productCode);
	while (productCodefound) {
		
		System.out.println("Product code exists!");
		System.out.println("Please enter a product code: ");
		productCode = console.nextLine();
		productCodefound = DatabaseHelper.checkProductCode(productCode);
	}
	System.out.println("Enter a product name: ");
	String productName = console.nextLine();
	Product firstProduct = new Product(productCode, productName);
	System.out.println("Enter a product line: ");
	String productLine = console.nextLine();
	boolean productLineExist;
	productLineExist = DatabaseHelper.checkProductLine(productLine);
	while (!productLineExist) {
		System.out.println("Product line does not exist!");
		System.out.println("Please enter a product line: ");
		productLine = console.nextLine();
		productLineExist = DatabaseHelper.checkProductLine(productLine);
	}
	firstProduct.setProductLine(productLine);
	System.out.println("Enter the product scale: ");
	firstProduct.setproductScale(console.nextLine());
	System.out.println("Enter the product vendor: ");
	firstProduct.setproductVendor(console.nextLine());
	System.out.println("Enter the product description: ");
	firstProduct.setproductDesc(console.nextLine());
	System.out.println("Enter the qty in stock: ");
	firstProduct.setStock(console.nextInt());
	if(console.hasNextLine())
	{
		console.nextLine();
	}
	System.out.println("Enter the product buy price: ");
	firstProduct.setPrice(console.nextDouble());
	if(console.hasNextLine())
	{
		console.nextLine();
	}
	System.out.println("Enter the product MSRP: ");
	firstProduct.setMSRP(console.nextDouble());
	if(console.hasNextLine())
	{
		console.nextLine();
	}
	
	DatabaseHelper.createProduct(firstProduct);
	console.close();

 }

public static void createNewProductLine() {
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
}
	

}

