package com.alex.demo.reflect;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author alex
 * @Created Feb 8, 2021 1:54:31 PM
 * @Description
 *              <p>
 *              被反射类
 */
public class Book {

	private final static String TAG = "BookTag";

	@Getter
	@Setter
	private String name;

	@Getter
	@Setter
	private String author;

	public Book() {
	}

	private Book(String name, String author) {
		this.name = name;
		this.author = author;
	}

	private String declaredMethod(int index) {
		String string = null;
		switch (index) {
		case 0:
			string = "I am declaredMethod 1 !";
			break;
		case 1:
			string = "I am declaredMethod 2 !";
			break;
		default:
			string = "I am declaredMethod 1 !";
		}
		return string;
	}

	@Override
	public String toString() {
		return "Book{" + "name='" + name + '\'' + ", author='" + author + '\'' + '}';
	}

}