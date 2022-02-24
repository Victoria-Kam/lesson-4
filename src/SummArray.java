import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SummArray {

    public void summArray(){

        int size;
        int summ = 0;

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

      System.out.println("Введи размер массива: ");

        while (!scan.hasNextInt()){
            System.out.print("Нужно ввести целое число\n!Попробуй еще раз: ");
            scan.nextLine();
        }
        size = scan.nextInt();

        int[] array = new int [size];

        for(int i = 0; i <array.length; i++)
        {
            array[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++)
        {
            summ += array[i];
        }

        System.out.println("Сумма всех элементов массива равна: " + summ);

    }
}
