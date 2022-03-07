package homeTask;

import java.util.Arrays;
import java.util.Random;

/*
* 3. Создайте 2 массива из 5 чисел.
    Выведите массивы на консоль в двух отдельных строках.
    Посчитайте среднее арифметическое элементов каждого массива и
    сообщите, для какого из массивов это значение оказалось больше (либо
    сообщите, что их средние арифметические равны).
* */
public class Task3 {

    public void third() {

        int size = 5;
        int firstMean = 0;
        int secondMean = 0;

        int[] first = new int[size];
        int[] second = new int[size];

        Random random = new Random();

        for (int i = 0; i < size; i++) {          // Заполнение двух массивов
            first[i] = random.nextInt(100);
            second[i] = random.nextInt(100);
        }

        for (int i = 0; i < size; i++) {
            firstMean += first[i];
            secondMean += second[i];
        }

        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));

        firstMean /= size;
        secondMean /= size;

        if (firstMean == secondMean) {
            System.out.println("Среднее значение двух массивов равны");
        } else if (firstMean > secondMean) {
            System.out.println("Среднее значение первого массива - " + firstMean + " больше чем у второго - " + secondMean);
        } else if (firstMean < secondMean) {
            System.out.println("Среднее значение второго массива - " + secondMean + " больше чем у первого - " + firstMean);
        }
    }
}
