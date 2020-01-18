package dev.ranieri.generators;

import java.util.List;

public interface CodeGenerator {
	
	String generateClassName(String cname);
	
	String generateConstructor(String constuctor);
	
	String generateGetter(String field);
	
	String generateSetter(String field);
	
	String generateToString(List<String> fields);
	
}
