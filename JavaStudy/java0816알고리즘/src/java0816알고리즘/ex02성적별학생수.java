package java0816알고리즘;

public class ex02성적별학생수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] score = {"A","A","B","C","D","A","C","D","D","D","F"}; 
		
		int x =0;
		int y =0;
		int z =0;
		int a =0;
		int b =0;
		System.out.print("A : ");

		for(int i=0; i<score.length; i++) {
			if("A".equals(score[i])) {	
				x++;
			}
			else if("B".equals(score[i])) {
				y++;
			}
			else if("C".equals(score[i])) {
				z++;
			}
			else if("C".equals(score[i])) {
				z++;
			}
			else if("D".equals(score[i])) {
				a++;
			}
			else if("F".equals(score[i])) {
				b++;
			}
			
			
		}System.out.print(x+"명\n");
		System.out.print("B : ");
		System.out.println(y+"명");
		System.out.print("C : ");
		System.out.println(z+"명");
		System.out.print("D : ");
		System.out.println(a+"명");
		System.out.print("F : ");
		System.out.println(b+"명");
	}

}
