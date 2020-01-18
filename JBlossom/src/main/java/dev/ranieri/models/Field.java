package dev.ranieri.models;

import java.util.List;

import dev.ranieri.utils.StringUtil;

public class Field {
	
	private String fieldName;
	
	private String type;
	
	private String accessModifier = "";
	
	private List<Annotation> annotations;
	
	public Field(){
		
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAccessModifier() {
		return accessModifier;
	}

	public void setAccessModifier(String accessModifier) {
		this.accessModifier = accessModifier;
	}
	
	public List<Annotation> getAnnotations() {
		return annotations;
	}

	public void setAnnotations(List<Annotation> annotations) {
		this.annotations = annotations;
	}
	
	public String generateGetter() {
		StringBuilder builder = new StringBuilder("public ");
		builder.append(this.type + " ");
		builder.append("get" + StringUtil.capitalizeFirstLetter(this.fieldName));
		builder.append("(){\n\t");
		builder.append("return this." + this.fieldName + ";\n}\n");
	
		return builder.toString();
	}
	
	public String generateSetter() {		
		StringBuilder builder = new StringBuilder("public ");
		builder.append("void ");
		builder.append("set" + StringUtil.capitalizeFirstLetter(this.fieldName));
		builder.append("(" + this.type + " " + this.fieldName + "){\n\t");
		builder.append("this." + this.fieldName + " = " + this.fieldName + ";\n}\n");
		return builder.toString();
	}

	public String generateFieldDeclaration() {		
		StringBuilder builder = new StringBuilder(this.accessModifier + " ");

		builder.append(this.type + " ");
		builder.append(this.fieldName + ";");
		return builder.toString();
	}

	
	
	
}
