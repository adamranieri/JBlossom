package dev.ranieri.models;

import java.util.List;

public class Entity {

	
	// Holds the class name
	private String className;
	
	//Holds the no args constructor
	private String constructor;

	//Holds class fields
	private List<Field> fields;
	
	// To string method
	private String toStringMethod;

	public Entity() {
		super();
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getConstructor() {
		return constructor;
	}

	public void setConstructor(String constructor) {
		this.constructor = constructor;
	}

	public String getToStringMethod() {
		return toStringMethod;
	}

	public void setToStringMethod(String toStringMethod) {
		this.toStringMethod = toStringMethod;
	}

	@Override
	public String toString() {
		return "Entity [className=" + className + ", constructor=" + constructor + ", getters=" + ", setters="
				 + ", toStringMethod=" + toStringMethod + "]";
	}

	public List<Field> getFields() {
		return fields;
	}

	public void setFields(List<Field> fields) {
		this.fields = fields;
	}
	
}
