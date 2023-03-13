package PiggyBank;

public class piggyBank {

	//저금통 설계도면
	
	 private String name;
	 private int money;
	
	 //접근제한자
	 // public : 클래스 내/외부에서 접근할수있게 해주는 제한자
	 // private : 클래스 내부의 메소드를 통해서만 접근가능
	 //:외부에서는 필드,메소드에 접근할수없다.
	 // protected
	 //default
	 
	 
	 
	 
	
	public piggyBank() {
		
	}
	
	public piggyBank(String name, int money) {
		
		this.name = name;
		this.money = money;
	}
	
	//private감춰져있는 필드에 접근할수있게해주는 클래스 내부 메소드
	//수정
	//필드에 저장되어있는 데이터를 메인으로부터 받아온 데이터로 수정(대입/재할당)
	public void setName(String name) {
		 this.name=name;
	}
	
	
	public void setmoney(int money) {
		this.money=money;
	}
	
	
	
	
	
	//가져오기
	//필드에 저장되어있는 데이터가 무엇인지 확인
	//return
	//name
	public String getName() {
		return name;
	}
	
	
	
	public int getmoney() {
		return money;
	}
	
	
	
	
	//돈인출
	public int withdraw(int money ) {
		//얼마를 인출할건지 main으로부터 받아와서
		//해당 필드에 저장되어있는 잔액에서 money를 빼고
		//그 값을 다시 필드에 있는 money에 저장
		//인출후 잔액이 얼마 남아있는지 값을 돌려주자
		this.money-=money;
		return this.money;
		
	}
	//돈입금
	public int deposit(int money) {
		this.money+=money;
		return this.money;
	}
	
	
	public void showmoney() {
		System.out.println(name+"님의 잔액이"+money+"원 남았습니다.");
	}
	
	
	
}
