package com.javaex.ex03;

public class Person {
	
	private String name;
	private String hp;
	private String com;
	
	public Person() {
		
	}

	public Person(String name, String hp, String com) {
		this.name = name;
		this.hp = hp;
		this.com = com;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getCom() {
		return com;
	}

	public void setCom(String com) {
		this.com = com;
	}

	@Override
	public String toString() {
		return "List [name=" + name + ", hp=" + hp + ", com=" + com + "]";
	}
	
	public void showInfo() {
		System.out.println("이름: "+name);
		System.out.println("핸드폰: "+hp);
		System.out.println("회사: "+com);
		System.out.println("");
	}
	
	public String save() {
		return name+","+hp+","+com;
	}
}
