package com.gmail.javaoop.lesson1.homework;
/*
Написать метод, находящий количество дней, прошедших с дня рождения человека.
		День рождения задается в формате “YYYY-MM-DD”, где YYYY - год (4 цифры),
		MM - номер месяца (2 цифры), DD - номер дня (2 цифры)
 */


import java.time.LocalDate;

public class DaysFromBirthDateCalculator {

	public static void main(String[] args) {
		String birthDateString = "2006-06-01";
        long daysNumber = daysFromBirthDate(birthDateString);
        System.out.println("Total days from " + birthDateString + " to the present day : " + daysNumber + " days");
    }

    public static long daysFromBirthDate(String birthDateString) {
        if (birthDateString.length() == 0) {
            throw new IllegalArgumentException("Empty string of date");
        }
        LocalDate formatBirthDate = LocalDate.parse(birthDateString);

        long birthDayPassFromEpochDay = formatBirthDate.toEpochDay();
        long dayNowPassFromEpochDay = LocalDate.now().toEpochDay();

        return dayNowPassFromEpochDay - birthDayPassFromEpochDay;
    }
}
//    Total days from 1980-01-01 to the present day : 14053 days
//Total days from 2006-06-01 to the present day : 4405 days
