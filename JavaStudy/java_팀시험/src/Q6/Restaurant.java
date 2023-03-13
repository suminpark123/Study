package Q6;

public class Restaurant extends Store {
	double service;
	double flavor;
	double clean;
	public Restaurant(String name, String event, double price, double service, double flavor, double clean) {
		super();
		this.name = name;
		this.event = event;
		this.price = price;
		this.service = service;
		this.flavor = flavor;
		this.clean = clean;
	}
	public double grade() {
		double result = Math.round((this.price + this.service + this.clean + this.flavor) / 4 * 100) / 100.0;
		return result;
	}
	
	public String getName() {
		return name;
	}
}