package com.kh.chap02_abstractAndInterface.part02_family.model.vo;

public abstract class Person {
	
	private String name;
	private double weight;
	private int helath;
	
	public Person() {
	}
	public Person(String name, double weight, int helath) {
		this.name = name;
		this.weight = weight;
		this.helath = helath;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getHelath() {
		return helath;
	}
	public void setHelath(int helath) {
		this.helath = helath;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", weight=" + weight + ", helath=" + helath + "]";
	}
	
	public abstract void eat(); 
	public abstract void sleep();

}
