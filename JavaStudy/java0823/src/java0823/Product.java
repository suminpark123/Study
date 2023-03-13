package java0823;

public class Product {
	
	
	private String name;
	private int unitPrice;
	private int amount;
	
	
	
	public Product(String name, int unitPrice, int amount) {
		super();
		this.name = name;
		this.unitPrice = unitPrice;
		this.amount = amount;
	}
	
	
	public String getName() {
		return name;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public int getAmount() {
		return amount;
	}


	@Override
	public String toString() {
		return name +" "+unitPrice +" "+ amount+"\n";
	}
	
	
	

}
