package com.kh.chap02_set.model.vo;

public class Student {
	
	// �̸�, ����, ����
	private String name;
	private int age;
	private int score;
	
	public Student() {
	}
	public Student(String name, int age, int score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		// ���� ��ü(this)�� obj�� ��
		if (this == obj) // ���� ��ü�� �񱳰�ü�� �ּҰ��� ��ġ�ϴ°�?
			return true; // == �������� ����Ű�� ���� == ��� �ʵ尪�� ��ġ
		if (obj == null) // �񱳴���� null �ϰ��?
			return false; // ���� ��ġ�� ���� false
		if (getClass() != obj.getClass()) // �޼ҵ�� Ÿ�Ժ�
			return false;
		
		// ���� ������ ������ �������� �ʾ��� ���
		// �� ���빰�� �� ��
		Student other = (Student) obj;
		if (age != other.age) // ���� ��ü�� ���� ��ü�� ���̰� �ٸ� ���
			return false;
		if (name == null) { // ���� ��ü �̸����� null�� ���
			if (other.name != null) // �� ��ü �̸����� null�� �ƴҰ��
				return false;
		} else if (!name.equals(other.name)) // ���� ��ü �̸��� �񱳰�ü �̸��� �ٸ� ���
			return false;
		if (score != other.score) // ������ �޶�!
			return false;
		
		// ��� ��츦 ���ܳ����� ��쿡�� true
		return true;
	}
	
	
	
	
	
	
	
	
	/*
	// hashCode()
	@Override
	public int hashCode() {
		return (name + age + score).hashCode();
		// ��ü���� �ּ� 16���� ��¼����¼�� ���ñ⹹�ñ� 10������ ��ȯ
		// (�̸� + ���� + ����).�ؽ�
	}
	
	// equals()
	@Override
	public boolean equals(Object obj) {
		Student other = (Student)obj;
		
		// �̸�, ����, ����
		if(!this.name.equals(other.name) || this.age != other.age || this.score != other.score) {
			return false;
		}
		return true;
	}
	*/
	
	
	
	
	

}
