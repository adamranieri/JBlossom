import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import dev.ranieri.models.Field;

class FieldTests {

	@Test
	void test_generateGetter() {
		Field field = new Field();
		field.setType("String");
		field.setFieldName("firstName");
	
		String getter = field.generateGetter();
		String[] lines = getter.split("\n");
		
		assertEquals("public String getFirstName(){", lines[0]);
		assertEquals("\treturn this.firstName;", lines[1]);
		assertEquals("}", lines[2]);
		
	}
	
	@Test
	void test_generateSetter() {
		Field field = new Field();
		field.setType("String");
		field.setFieldName("lastName");
		
		String setter = field.generateSetter();
		String[] lines = setter.split("\n");
		
		assertEquals("public void setLastName(String lastName){", lines[0]);
		assertEquals("\tthis.lastName = lastName;", lines[1]);
		assertEquals("}", lines[2]);
	}
	
	@Test
	void test_generateFieldDeclaration() {
		Field field = new Field();
		field.setType("String");
		field.setFieldName("birthMonth");
		field.setAccessModifier("private");
		
		String declaration = field.generateFieldDeclaration();
		assertEquals("private String birthMonth;", declaration);
	}

}
