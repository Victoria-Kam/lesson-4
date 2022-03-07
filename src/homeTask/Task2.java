package homeTask;

/*
* 2. Создайте и заполните массив случайным числами и выведете
     максимальное, минимальное и среднее значение.
     Для генерации случайного числа используйте метод Math.random().
     Пусть будет возможность создавать массив произвольного размера.
     Пусть размер массива вводится с консоли.
* */

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    public void second() {

        int size;
        double minimum = 0;
        double maximun = 0;
        double summ = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите размер массива: ");

        size = scan.nextInt();

        double[] array = new double[size];

        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);           // Заполняем массив
        }

        minimum = array[0];
        maximun = array[0];

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < size; i++) {          // Поиск наименьшего элемента массива
            if (minimum > array[i]) {
                minimum = array[i];
            }

            if (maximun < array[i]) {             // Поиск наибольшего элемента массива
                maximun = array[i];
            }

            summ += array[i];
        }
        System.out.println("Минимальное число массива: " + minimum);
        System.out.println("Максимальное число массива: " + maximun);
        System.out.println("Среднее значение элементов массива: " + summ / size);
    }
}
