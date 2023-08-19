package com.Demo1;

public class Policy {

	private String name;
	private long amount;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Policy [name=" + name + ", amount=" + amount + ", age=" + age + "]";
	}
	
}
