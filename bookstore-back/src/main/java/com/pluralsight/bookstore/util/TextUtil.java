package com.pluralsight.bookstore.util;

/**
 * Created by ashutosh on 26/7/17.
 */
public class TextUtil {
	public String sanitize (String textToSantize){
		return textToSantize.replace("\\s+", " ");
	}
}
