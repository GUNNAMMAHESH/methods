package com.practise.constructorAndSettersGetters;

public class StudentGettersPutters {
	private float marks;
	public String name;
	protected int age;
	public String address;
	public long phNumber;
	
	public void setId(float id) {
		this.marks = id;
	}
	public float getId() {
		return marks;
	}
	
	public static void main(String[] args) {
		StudentGettersPutters s = new StudentGettersPutters();
		s.setId(75.2f);
		System.out.println(s.getId()+"%");
		
	}
	

}
class class2 extends StudentGettersPutters{
	
}
