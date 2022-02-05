package ru.skypro;

public class Main {

    public static void main(String[] args) {

        // Задание №1
        int number = 1;
        while (number <=10) {
            if (number == 10) {
                System.out.println(number);
                break;
            }
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
        for (int num = 10; num > 0; num--) {
            if (num == 1) {
                System.out.println(num);
                break;
            }
            System.out.print(num + " ");
        }

        // Задание №2
        for (int fridayDate = 7; fridayDate <= 31; fridayDate = fridayDate + 7) {
            System.out.println("Сегодня пятница, " + fridayDate + "-е число. Необходимо подготовить отчет.");
        }

        // Задание №3
        int currentYear = 2022;
        int beginning = currentYear - 200;
        int ending = currentYear + 100;
        for (int i = beginning; i < ending; i++) {
            if (i % 79 == 00) {
                System.out.println(i);
            }
        }
    }
}





