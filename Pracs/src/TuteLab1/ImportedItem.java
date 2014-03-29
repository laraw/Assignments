package TuteLab1;

public class ImportedItem extends CatalogueItem {
	
	String country;
	
	public ImportedItem(String Code, String Desc, double Price){
		super(Code, Desc, Price);
		
	}
	
	public ImportedItem(String Code, String Desc, double Price, String country){
		super(Code, Desc, Price);
		this.country = country;
		
	}
	public String getCountry () {
		return country;
	}

}
