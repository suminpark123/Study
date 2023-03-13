package java0816알고리즘;

import java.util.Scanner;

public class ex13_알파벳 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("==== 알파벳 빈도수 구하기====");
		
		
//		String [] arr= {"a","A","b","B","c","C","d","D","e","E",
//		"f","F","g","G","h","H","i","I","j","J","k","K"
//		,"l","L","m","M","n","N","o","O","p","P","q","Q",
//		"r","R","s","S","t","T","u","U","v","V","w","W",
//		"x","X","y","Y","z","Z"};

		// String[] arrr = new String[52]; 
		
		System.out.print("입력>> ");
		String nn=sc.nextLine();
		char[] arr=new char [nn.length()];
		
//		for(int i= 0; i<arr.length; i++) {
//			
//		 arr[i]= sc.next();
//		 break;
//		}
		
		
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		int g = 0;
		int h = 0;
		int aa = 0;
		int j = 0;
		int k = 0;
		int l = 0;
		int m = 0;
		int n = 0;
		int o = 0;
		int p = 0;
		int q = 0;
		int r = 0;
		int s = 0;
		int t = 0;
		int u = 0;
		int v = 0;
		int w = 0;
		int x = 0;
		int y = 0;
		int z = 0;
		
		
		
		
//		String [] arr= {"a","A","b","B","c","C","d","D","e","E",
//				"f","F","g","G","h","H","i","I","j","J","k","K"
//				,"l","L","m","M","n","N","o","O","p","P","q","Q",
//				"r","R","s","S","t","T","u","U","v","V","w","W",
//				"x","X","y","Y","z","Z"};
		
		
		
		for(int i =0; i<arr.length;i++) {
			
			arr[i] = nn.charAt(i);
			if(arr[i] == 'a') {
				a++;
			}
			else if("A".equals(arr[i])) {
				a++;
			}
			else if("b".equals(arr[i])) {
				b++;
			}
			else if("B".equals(arr[i])) {
				b++;
			}
			else if("c".equals(arr[i])) {
				c++;
			}
			else if("C".equals(arr[i])) {
				c++;
			}
			else if("d".equals(arr[i])) {
				d++;
			}
			else if("D".equals(arr[i])) {
				d++;
			}
			else if("e".equals(arr[i])) {
				e++;
			}
			else if("E".equals(arr[i])) {
				e++;
			}
			else if("f".equals(arr[i])) {
				f++;
			}
			else if("F".equals(arr[i])) {
				f++;
			}
			else if("g".equals(arr[i])) {
				g++;
			}
			else if("G".equals(arr[i])) {
				g++;
			}
			else if("h".equals(arr[i])) {
				h++;
			}
			else if("H".equals(arr[i])) {
				h++;
			}
			else if("i".equals(arr[i])) {
				aa++;
			}
			else if("I".equals(arr[i])) {
				aa++;
			}
			else if("j".equals(arr[i])) {
				j++;
			}
			else if("J".equals(arr[i])) {
				j++;
			}
			else if("k".equals(arr[i])) {
				k++;
			}
			else if("K".equals(arr[i])) {
				k++;
			}
			else if("l".equals(arr[i])) {
				l++;
			}
			else if("L".equals(arr[i])) {
				l++;
			}
			else if("m".equals(arr[i])) {
				m++;
			}
			else if("M".equals(arr[i])) {
				m++;
			}
			else if("n".equals(arr[i])) {
				n++;
			}
			else if("N".equals(arr[i])) {
				n++;
			}
			else if("o".equals(arr[i])) {
				o++;
			}
			else if("O".equals(arr[i])) {
				o++;
			}
			else if("p".equals(arr[i])) {
				p++;
			}
			else if("P".equals(arr[i])) {
				p++;
			}
			else if("q".equals(arr[i])) {
				q++;
			}
			else if("Q".equals(arr[i])) {
				q++;
			}
			else if("r".equals(arr[i])) {
				r++;
			}
			else if("R".equals(arr[i])) {
				r++;
			}
			else if("s".equals(arr[i])) {
				s++;
			}
			else if("S".equals(arr[i])) {
				s++;
			}
			else if("t".equals(arr[i])) {
				t++;
			}
			else if("T".equals(arr[i])) {
				t++;
			}
			else if("u".equals(arr[i])) {
				u++;
			}
			else if("U".equals(arr[i])) {
				u++;
			}
			else if("v".equals(arr[i])) {
				v++;
			}
			else if("V".equals(arr[i])) {
				v++;
			}
			else if("w".equals(arr[i])) {
				w++;
			}
			else if("W".equals(arr[i])) {
				w++;
			}
			else if("x".equals(arr[i])) {
				x++;
			}
			else if("X".equals(arr[i])) {
				x++;
			}
			else if("y".equals(arr[i])) {
				y++;
			}
			else if("Y".equals(arr[i])) {
				y++;
			}
			else if("z".equals(arr[i])) {
				z++;
			}
			else if("Z".equals(arr[i])) {
				z++;
			}
		}
		System.out.print("a : "+a+"\n");
		System.out.print("b : "+b+"\n");
		System.out.print("c : "+c+"\n");
		System.out.print("d : "+d+"\n");
		System.out.print("e : "+e+"\n");
		System.out.print("f : "+f+"\n");
		System.out.print("g : "+g+"\n");
		System.out.print("h : "+h+"\n");
		System.out.print("i : "+aa+"\n");
		System.out.print("j : "+j+"\n");
		System.out.print("k : "+k+"\n");
		System.out.print("l : "+l+"\n");
		System.out.print("m : "+m+"\n");
		System.out.print("n : "+n+"\n");
		System.out.print("o : "+o+"\n");
		System.out.print("p : "+p+"\n");
		System.out.print("q : "+q+"\n");
		System.out.print("r : "+r+"\n");
		System.out.print("s : "+s+"\n");
		System.out.print("t : "+t+"\n");
		System.out.print("u : "+u+"\n");
		System.out.print("v : "+v+"\n");
		System.out.print("w : "+w+"\n");
		System.out.print("x : "+x+"\n");
		System.out.print("y : "+y+"\n");
		System.out.print("z : "+z+"\n");
	}

}
