package dev.ranieri.creators;

import java.io.File;

public interface FileCreator<T> {
	
	/**
	 * Method that will generate a .java file for a given
	 * entity, service, controller etc...
	 * 
	 * @param t
	 * @return 
	 */
	File createFile(T t);

}

