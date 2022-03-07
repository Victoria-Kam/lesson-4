package homeTask;

/*
* 4. Создайте массив из n случайных целых чисел и выведите его на экран.
     Размер массива пусть задается с консоли и размер массива может быть
     больше 5 и меньше или равно 10.
     Если n не удовлетворяет условию - выведите сообщение об этом.
     Если пользователь ввёл не подходящее число, то программа должна
     просить пользователя повторить ввод.
     Создайте второй массив только из чётных элементов первого массива,
     если они там есть, и вывести его на экран.
* */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4 {

    public void fourth() {

        boolean verificationСompleted = false;
        int size = 0;
        int count = 0;

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите расмер массива: ");

        while (!verificationСompleted) {
            while (!scan.hasNextInt()) {         // Проверка на ввод целочисленного числа
                System.out.println("Введите целое число!");
                scan.next();
            }
            size = scan.nextInt();
            if (size < 5 || size > 10) {         // Проверка введенного числа на попадание в заданный диапазон
                System.out.println("Размер массива должен быть в диапазоне от 5 до 10 включительно");
            } else {
                verificationСompleted = true;
            }
        }

        int[] first = new int[size];

        for (int i = 0; i < size; i++) {         //Заполняем массив случайными числами
            first[i] = random.nextInt(100);
        }

        System.out.println("Полученный массив: " + Arrays.toString(first));

        for (int i = 0; i < size; i++) {            //Поиск четных чисел в массиве
            if (first[i] % 2 == 0) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Четных чисел в массиве нет!");
            return;
        }

        int[] second = new int[count];

        for (int i = 0, j = 0; i < size; i++) {
            if (first[i] % 2 == 0) {
                second[j] = first[i];
                j++;
            }
        }

        System.out.println("Второй новый массив из четных чисел первого массива: " + Arrays.toString(second));
    }
}
