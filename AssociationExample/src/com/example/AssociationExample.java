/* 
 There are 2 types of Association
 
 Type 1 : is-a relationship - inheritance - extends
 Type 2 : has-a relationship
 
 Two forms of has-a relationship :
 1. Aggregation - loosely coupled - person and mobile, atm and bank
 2. Composition - tightly coupled - car and engine
 */

package com.example;

import java.util.ArrayList;
import java.util.List;

class Mobile {
	private String mobile_no;

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	@Override
	public String toString() {
		return "Mobile [mobile_no=" + mobile_no + "]";
	}
}

class Person {
	private String name;
	
	List<Mobile> numbers;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Mobile> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<Mobile> numbers) {
		this.numbers = numbers;
	}
}
public class AssociationExample {

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Poonam");

		Mobile number1 = new Mobile();
		number1.setMobile_no("1234567890");
		Mobile number2 = new Mobile();
		number2.setMobile_no("0987654321");
		
		List<Mobile> numberList = new ArrayList<Mobile>();
		numberList.add(number1);
		numberList.add(number2);
		person.setNumbers(numberList);
		System.out.println(person.getNumbers() + " are moblie numbers of the person " + person.getName());
		
	}
}
