package com.pluralsight.bookstore.util;

import java.util.Random;

/**
 * Created by ashutosh on 26/7/17.
 */
public class IsbnGererator implements NumberGenerator {
	@Override
	public String generateNumber(){
		return "13-5677-" + Math.abs(new Random().nextInt());
	}
}
