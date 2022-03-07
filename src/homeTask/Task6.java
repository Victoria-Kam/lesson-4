package homeTask;

/*
* 6. Создайте массив строк. Заполните его произвольными именами
     людей. Отсортируйте массив. Результат выведите на консоль.
* */

import java.util.Arrays;

public class Task6 {

    public void sixth() {

        String[] names = new String[]{"Матвей", "Александр", "Виталий", "Стас", "Вячеслав", "Иван", "Ярослав"};

        System.out.println("Список имен до сортировки: " + Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("Список имен после сортировки: " + Arrays.toString(names));

    }
}
