package com.Demo;

public class Category {
	private String name;
	private Policy policy;
	
	public Category(String name, Policy policy) {
		super();
		this.name = name;
		this.policy = policy;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Policy getPolicy() {
		return policy;
	}
	public void setPolicy(Policy policy) {
		this.policy = policy;
	}
	public void show() {
		System.out.println("category name  :"+name);
		System.out.println("Policy Name  :"+policy.getName());
		System.out.println("Policy Amount   :"+policy.getAmount());
	}

}
