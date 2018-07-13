package com.gmail.javaoop.lesson1.homework;
/*
Написать метод, находящий все имена, начинающиеся с буквы startLetter, в списке имен.
Использовать цикл for-each.
 */

import java.util.Arrays;
import java.util.ArrayList;

public class NamesWithStartLetterFinder {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>(Arrays.asList("Pavel", "Ivan", "Vasiliy", "Anastasiia", "Olga", "Mariia"));
        char startLetter = 'A';
        System.out.println(namesWithStartLetter(names, startLetter).toString());
    }

    public static ArrayList<String> namesWithStartLetter(ArrayList<String> names, char startLetter) {
        ArrayList<String> namesWithStartLetter = new ArrayList<>();

        for (String name : names) {
            if (startLetter == name.charAt(0)) {
                namesWithStartLetter.add(name);
            }
        }
            return namesWithStartLetter;
    }
}
