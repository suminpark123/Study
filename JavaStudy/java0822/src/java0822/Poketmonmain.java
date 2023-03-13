package java0822;

public class Poketmonmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//new Pokemon("꼬부기" , "물", "C") 이 방식도 가능
		// 생성자를 생성하고 난뒤에 (인자, 타입 일치시키기 전부)
		Poketmon p1 = new Poketmon("꼬부기","물","C");
		
//		p1.name ="꼬부기";
//		p1.type = "물";
//		p1.grade = "C";
		
		Poketmon p2 = new Poketmon("파이리","불","C");
		
//		p2.name = "파이리";
//		p2.type = "불";
//		p2.grade = "C";
		
		Poketmon p3 = new Poketmon("이상해씨","풀","C");
		
//		p3.name = "이상해씨";
//		
		
		System.out.println(p1.name);
		System.out.println(p1.getType());
		
		p1.setType("전기");  // set은 수정기능
		System.out.println(p1.type);
		
	}

}
