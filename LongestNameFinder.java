package com.gmail.javaoop.lesson1.homework;
 
 /*
 Написать метод, находящий самое длинное имя пользователя в списке имен. 
 Если список пустой, бросить исключение IllegalArgumentException.
 Использовать цикл for-each 
  */
 import java.util.Arrays;
 import java.util.ArrayList;
 
 public class LongestNameFinder {
	 public static void main(String[] args) {
		 
		 ArrayList<String> names = new ArrayList<>(Arrays.asList("Pavel", "Ivan", "Vasiliy", "Anastasiia", "Olga", "Mariia"));
		 System.out.println("The longest name is" + longestName(names));
	}

	 public static String longestName(ArrayList<String> names) {
		 if (names.isEmpty()) {
			 throw new IllegalArgumentException("The ArrayList is empty");
		 }
		 int maxLengthName = 0;
		 String longestName = "";
		 
		 for (String name : names) {
	         if (name.length() > maxLengthName) {
	             maxLengthName = name.length();
	             longestName = name;
	         }
		 }
		 return longestName;
	 }
 }
 
