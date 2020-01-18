package dev.ranieri.generators;

public interface CodeGenerator<T> {
	
	String generateClassName(T t);
	
	String generateConstructor(T t);
	
	String generateGetters(T t);
	
	String generateSetters(T t);
	
	String generateToString(T t);

}
