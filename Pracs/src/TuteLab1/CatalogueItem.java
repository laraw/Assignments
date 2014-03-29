package TuteLab1;

public class CatalogueItem {
	private String Code;
	private String Desc;
	private double Price;
	private double Tax = 0.10;
	
	public CatalogueItem ()
	{
		
	}
	public CatalogueItem (String Code, String Desc, double Price){
		this.Code = Code;
		this.Desc = Desc;
		this.Price = Price;
				
	}
	
	public double GetTax() {
		return Tax;
	}
	
	public String getCode() {
		return Code;
	}
	
	public String getDesc() {
		return Desc;
	}
	
	public double getPrice() {
		return Price;
	}
	
	
}
