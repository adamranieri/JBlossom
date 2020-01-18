package dev.ranieri.utils;

public class StringUtil {

	public static String capitalizeFirstLetter(String word) {
		String capitalized = word.toUpperCase();
		if(word.length() > 1)
			capitalized = word.substring(0,1).toUpperCase() + word.substring(1);
		return capitalized;
	}
}
