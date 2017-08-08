package jp.co.rakus.git_sample_mae.domain;

import java.util.List;

public class Human {

	private String name;
	private int age;
	private List<Animal> animalList;
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
	public List<Animal> getAnimalList() {
		return animalList;
	}
	public void setAnimalList(List<Animal> animalList) {
		this.animalList = animalList;
	}
	
	
}
