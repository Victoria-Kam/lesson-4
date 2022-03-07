package homeTask;

/*
* 5. Создайте массив и заполните массив.
     Выведите массив на экран в строку.
     Замените каждый элемент с нечётным индексом на ноль.
     Снова выведете массив на экран на отдельной строке.
* */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task5 {

    public void fifth() {

        int size = 0;

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите расмер массива: ");

        while (!scan.hasNextInt()) {         // Проверка на ввод целочисленного числа
            System.out.println("Введите целое число!");
            scan.next();
        }

        size = scan.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("Входящий массив: " + Arrays.toString(array));

        for (int i = 0; i < size; i++) {
            if (i % 2 == 1) {
                array[i] = 0;
            }
        }
        System.out.println("Исходящий массив: " + Arrays.toString(array));
    }
}
