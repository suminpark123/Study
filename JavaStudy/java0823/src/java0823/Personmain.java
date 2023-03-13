package java0823;

import java.util.Arrays;

public class Personmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Person p1 = new Person("정세연",19);
		Person p2 = new Person("김미희",20);
		
		System.out.println("이름 :"+p1.getName());
		System.out.println("이름 :"+p2.getName());
		
		Person[] arr= new Person[2];
		
		
		arr[0]= new Person("정세연",19);
		arr[1]= new Person("김미희",20);
		
		System.out.println("이름 :" +arr[0].getName());
		System.out.println("이름 :" +arr[1].getName());
		
		double s=0;
		for(int i= 0; i<arr.length; i++) {
//			System.out.println(arr[i].getName());
			s+=arr[i].getAge();
		}
		
		System.out.println(s/arr.length);
		
		
		
	}

}
