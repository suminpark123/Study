package java0822;

public class student {

	//value object 클래스
	
	
	//이름,학번,나이,자바점수, 웹점수,안드로이드점수

	private	String name;
	private String number;
	private int age;
	private int java;
	private int web;
	private int android;
	
	
	//this : 매개변수와 필드변수명이 같을때
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getWeb() {
		return web;
	}
	public void setWeb(int web) {
		this.web = web;
	}
	public int getAndroid() {
		return android;
	}
	public void setAndroid(int android) {
		this.android = android;
	}
	
	
	
	
		
	
}
