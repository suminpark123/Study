package Q6;

public class Salon extends Store{
		
		double technology;
		double kindness;
		
		public Salon(String name, String event, double technology, double kindness, double price) {
			super();
			this.name = name;
			this.event = event;
			this.price = price;
			this.technology = technology;
			this.kindness = kindness;
		}
		public double grade() {
			double result = Math.round((this.price + this.technology + this.kindness) / 3 * 100) / 100.0;
			return result;
		}
		
		public String getName() {
			return name;
		}
		
	}

