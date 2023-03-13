package java0818;

import java.util.Arrays;

public class ex01_메소드실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//정수형 1차원배열 arr을 선언한다.그리고{15,10,2,8,23}으로 초기화 한다.
		// 이 배열을 매개변수로 받아 평균 값을 구해 반환해주는 average메소드를 작성하시오.

		int[] arr = {15,10,2,8,23};
		int[] arr2= {7,8,7,9,10,11};
		double d =average(arr);
		double e =average(arr2);
		System.out.println(d);
		System.out.println(e);
		
		System.out.println(Arrays.toString(arr2));
		System.out.println(arraytostring(arr2));
		
		double[] score2= {80.5,77.7,50.5,99.4};
		System.out.println(arraytostring(score2));
	}
	
	public static double average(int[] a){
		double result =0;
		
		double sum=0;
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
		}
		result = sum/a.length;
		return result;
	}
	public static String arraytostring(int[] a) {
	String	result ="[";
		for(int i=0; i<a.length-1; i++) {
			result+=a[i]+", ";
		}
	
		return result+a[a.length-1]+"]";
	}
	public static String arraytostring(double[] a) {
		String	result ="[";
			for(int i=0; i<a.length-1; i++) {
				result+=a[i]+", ";
			}
		
			return result+a[a.length-1]+"]";
		}

}
