package dev.ranieri.generators;

import java.util.List;

import dev.ranieri.models.Entity;
import dev.ranieri.models.Field;

public class EntityCodeGenerator implements CodeGenerator<Entity>{

	@Override
	public String generateClassName(Entity entity) {
		String className = "public class " + entity.getClassName() + "{\n";
		return className;
	}

	@Override
	public String generateConstructor(Entity entity) {
		String constructor = "public " + entity.getClassName() + "(){\n}\n";
		return constructor;
	}

	@Override
	public String generateToString(Entity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String generateGetters(Entity entity) {
		StringBuilder getters = new StringBuilder();
		List<Field> fields = entity.getFields();
		for(Field field: fields) {
			getters.append(field.generateGetter() + "\n");
		}
		return getters.toString();
	}

	@Override
	public String generateSetters(Entity entity) {
		StringBuilder setters = new StringBuilder();
		List<Field> fields = entity.getFields();
		for(Field field: fields) {
			setters.append(field.generateSetter() + "\n");
		}
		return setters.toString();
	}

}
