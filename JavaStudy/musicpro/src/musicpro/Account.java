package musicpro;

public class Account {

	private int id;//계좌번호
	private String name; // 예금주
	private int balance; //잔액
	
	//필드 파트. 객체의 속성.
	
	//생성자
	public Account() {
		
	}

	public Account(int id, String name, int balance) {
	
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public String toString() {
		return "Account [id=" +id + ", name ="+name +", balance="
		+balance + "]";
	}
}
