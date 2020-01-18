package dev.ranieri.models;

import java.util.List;
import java.util.Set;

public class Entity {

	
	// Holds the class name
	private String cname;
	
	//Holds the no args constructor
	private String constructor;
	
	// holds the getters
	private List<String> getters;
	
	// holds the setters
	private List<String> setters;
	
	// To string method
	private String toStringMethod;

	public Entity() {
		super();
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getConstructor() {
		return constructor;
	}

	public void setConstructor(String constructor) {
		this.constructor = constructor;
	}

	public List<String> getGetters() {
		return getters;
	}

	public void setGetters(List<String> getters) {
		this.getters = getters;
	}

	public List<String> getSetters() {
		return setters;
	}

	public void setSetters(List<String> setters) {
		this.setters = setters;
	}

	public String getToStringMethod() {
		return toStringMethod;
	}

	public void setToStringMethod(String toStringMethod) {
		this.toStringMethod = toStringMethod;
	}

	@Override
	public String toString() {
		return "Entity [cname=" + cname + ", constructor=" + constructor + ", getters=" + getters + ", setters="
				+ setters + ", toStringMethod=" + toStringMethod + "]";
	}
	
}
