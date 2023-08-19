package com.Demo1;

public class Customer {
	private Policy policy;
	private String name;
	private long number;
	public Policy getPolicy() {
		return policy;
	}
	public void setPolicy(Policy policy) {
		this.policy = policy;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Customer [policy=" + policy + ", name=" + name + ", number=" + number + "]";
	}

}
