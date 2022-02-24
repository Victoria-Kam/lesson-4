
// Игра угадай число

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int count = 1;
        int randValue;
        int playerValue;
        boolean continueGame = true;
        boolean guessTheNumber = false;
        String answer = "";

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Игра: Угадай число!");
        System.out.println("Првила: Я загадал число, а ты попробуй отгадать!");
        System.out.println("Чтобы закрыть игру, введи цифру 0. Если хочешь поиграть, то введи число: ");
        while (continueGame) {

            randValue = rand.nextInt(15) + 1;

            while (!guessTheNumber) {
                while (!scan.hasNextInt()) {
                    System.out.println("Нужно целое число! Попробуй еще раз: ");
                    scan.next();
                }
                playerValue = scan.nextInt();
                if (playerValue == 0) {
                    System.out.println("Хорошего дня!");
                    return;
                }
                if (randValue == playerValue) {
                    System.out.println("Молодец! Ты угадал число за " + count + " попыток(-ки)");
                    guessTheNumber = true;
                } else if (randValue > playerValue) {
                    System.out.println("Мое загаданное число больше твоего введенного числа! Продолжай отгадывать!");
                    count++;
                } else if (randValue < playerValue) {
                    System.out.println("Мое загаданное число меньше твоего введенного числа! Продолжай отгадывать!");
                    count++;
                }
            }
            System.out.print("Хочешь сыграть еще раз (да/нет)?: ");
            answer = scan.next();
            if (answer.equals("да")) {
                System.out.println("Хорошо! продолжаем игру!\nВведи число: ");
                guessTheNumber = false;
                count = 1;
                continue;
            } else if (answer.equals("нет")) {
                System.out.println("Хорошо! спасибо за игру! Хорошего дня! \n");
                continueGame = false;
            }
        }
    }
}
