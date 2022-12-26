package org.anudip.pojo;

public class Student {
	static {
		System.out.println("---------I am static block------------------");
	}
	private int id;
	private String name;

	public Student() {
		super();
		System.out.println("0 arg cons....");
	}

	public Student(int id, String name) {
		super();
		System.out.println("2 arg cons....");
		this.id = id;
		this.name = name;
	}

	public int getId() {
		System.out.println("ID Getter...");
		return id;
	}

	public void setId(int id) {
		System.out.println("ID Setter...");
		this.id = id;
	}

	public String getName() {
		System.out.println("Name Getter...");
		return name;
	}

	public void setName(String name) {
		System.out.println("Name Setter...");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}
