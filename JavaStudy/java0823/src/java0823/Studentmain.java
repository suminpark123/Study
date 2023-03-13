package java0823;

public class Studentmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student[] arr = new Student[4];
		
		arr[0]= new Student("박수민", 1,1);
		arr[1]= new Student("노강민", 1,2);
		arr[2]= new Student("서은유", 1,3);
		arr[3]= new Student("김기철", 1,4);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i].getName()+","+arr[i].getBan()+
					"반"+arr[i].getNum()+"번"+"\n");
		}
		
		
	}

}
