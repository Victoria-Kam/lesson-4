package homeTask;

import java.util.Arrays;
import java.util.Scanner;

/*
* 1. Создайте массив целых чисел. Удалите все вхождения заданного
     числа из массива.
     Пусть число задается с консоли (класс Scanner). Если такого числа нет -
     выведите сообщения об этом.
     В результате должен быть новый массив без указанного числа.
* */

public class Task1 {

    public void first() {
        int[] array = {10, 12, 17, 18, 28, 38, 40, 46, 17, 62, 165,1597};

        int count = 0;
        int size = 0;
        int value;

        Scanner scan = new Scanner(System.in);

        System.out.print("Введи число: ");
        value = scan.nextInt();

        for (int i = 0; i < array.length; i++) {            //ищем введенное число в массиве, и считаем сколько раз оно встречается в массиве
            if (array[i] == value) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Такого числа нет в массиве!");
        }
        for (int i = 0; i < array.length; i++) {            // считаем размерность нового массива, не включая введенное число
            if (array[i] == value) {
                continue;
            } else {
                size++;         // новый размер массива
            }
        }

        int[] array2 = new int[size];

        //for(int i = 0; i < array.length; i++)
        for (int i = 0, j = 0; j < array.length; i++, j++) {          // заполняем новый массив
            //for()
            if (array[j] == value) {            //если в старом значении есть введенное число
                if (j == array.length-1) {      // Проверка индекса, последний ли он в массиве
                    break;
                }
                array2[i] = array[++j];         // то в новом массиве записываем следующий элемент старого массива
            }
            array2[i] = array[j];               // иначе присваиваем значения из старого массива в новый
        }



        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }
}

