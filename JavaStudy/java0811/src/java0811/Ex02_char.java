package java0811;

public class Ex02_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char c = 'A';
		System.out.println(c);
		
		int i = c;
		System.out.println(i);
		i='B';
				System.out.println(i);
		i='D';
		System.out.println(i);
		c=69;
		System.out.println(c);
		i = 'a';
		System.out.println(i);
		i ='0';
		System.out.println(i);
		
		for(char d = 'a'; d<'z'; d++) {
			System.out.println(d);
			
		}
		System.out.println((char)('a'+3));
		System.out.println((int)'김');
		System.out.println((int)'ㄱ');
	}

}
