package dev.ranieri.creators;

import java.io.File;
import java.io.FileWriter;

import dev.ranieri.generators.EntityCodeGenerator;
import dev.ranieri.models.Entity;

public class EntityCreator implements FileCreator<Entity> {

	public File createFile(Entity entity) {
		EntityCodeGenerator generator = new EntityCodeGenerator();
		FileWriter file;
		try {
			file = new FileWriter("~/Desktop/" + entity.getClassName() + ".java");
			file.write(generator.generateClassName(entity));
			file.write(generator.generateConstructor(entity));
			file.write(generator.generateGetters(entity));
			file.write(generator.generateSetters(entity));
			file.write("}");
			file.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
