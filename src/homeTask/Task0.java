package homeTask;

import java.util.Arrays;
import java.util.Scanner;

/*
* 0. Создайте массив целых чисел. Напишете программу, которая выводит
     сообщение о том, входит ли заданное число в массив или нет.
     Пусть число для поиска задается с консоли (класс Scanner).
* */
public class Task0 {

    public void zero() {

        int[] array = new int[100];
        int enterValue = 0;
        int middle = 0;
        int count = 0;
        boolean find = false;

        for (int i = 0, temp = 1; i < 100; i++, temp++) {           // заполняем массив
            array[i] += temp;
        }

        int min = array[0];         // задаем границы для поиска
        int max = array[99];

        middle = (min + max) / 2;           // ищем середину массива

        Scanner scan = new Scanner(System.in);

        System.out.print("Введи число: ");
        enterValue = scan.nextInt();

        while (!find) {         // пока не найдем введенное число, будем выполнять условия
            if (middle > enterValue) {
                max = middle;
                middle = (min + max) / 2;
                count++;
            } else if (middle < enterValue) {
                min = middle;
                middle = (min + max) / 2;
                count++;
            } else if (middle == enterValue) {
                System.out.println("Такое число есть! Его нашли за " + count + " шагов!");
                find = true;
            }
        }

    }
}

