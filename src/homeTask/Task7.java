package homeTask;

// 7.Реализуйте алгоритм сортировки пузырьком.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task7 {

    public void seventh() {

        int size = 0;
        int temp;

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введи размер массива: ");

        size = scan.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Входящий массив: " + Arrays.toString(array));

        temp = array[0];

        for (int i = 0; i < size; i++) {            // Проход по массиву
            for (int j = 0; j < i; j++) {           // Проход по массиву до конкретного элемента
                if (array[j] > array[i]){           // Проверяем ВСЕ элементы ДО конкретного (внутреннему циклу)
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        System.out.println("Получившийся массив: " + Arrays.toString(array));
    }
}
