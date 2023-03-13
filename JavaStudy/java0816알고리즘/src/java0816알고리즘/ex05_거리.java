package java0816알고리즘;

public class ex05_거리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {92,32,52,9,81,2,68};
		int b=0;
		int c=0;
		int min =a[0]-a[1];
		for(int i =0; i<a.length; i++) {
			for(int j= 0; j<a.length; j++) {
				
				if(a[i]<a[j]) {
					if(min>a[j]-a[i]) {
						min = a[j]-a[i];
						b=i;
						c=j;
					}
					else if(a[j]<a[i]) {
						if(min>a[i]-a[j]) {
							min=a[i]-a[j];
							b=i;
							c=j;
						}
					}
				}
			}
		}
		System.out.println("result = ["+c+", "+b+"]");
	}

}
