import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Homework {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        summBetween(5, 255);
        determineSignOfNumber();
        numberSing(-23413);
        someMethod("I`m tired", 5);
        leap();
    }

    private static void leap(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введіть рік: ");
        int year = 0;
        try {
            year = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }

    private static void someMethod(String s, int count) {
        for(int i = 0; i < count; i++) {
            System.out.println(s);
        }
    }

    private static boolean numberSing(int number) {
        return number < 0;
    }

    private static void determineSignOfNumber() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введіть число: ");
        String input = null;
        try {
            input = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int number = Integer.parseInt(input);
        System.out.println(number >= 0 ? "Додатнє число" : "Від'ємне число");
    }

    private static boolean summBetween(int a, int b) {
        if(a + b >= 10 || a + b <= 20) {
            return true;
        }
        return false;
    }

    private static void compareNumbers() {
        int a = 3;
        int b = 5;
        System.out.println(a >= b ? "a >= b" : "a < b");
    }

    private static void printColor() {
        int value = 523;
        if (value <= 0) {
            System.out.println("Червоний");
        }
        else if (0 <= value && 100 >= value) {
            System.out.println("Жовтий");
        }
        else {
            System.out.println("Зелений");
        }
    }

    private static void checkSumSign() {
        int a = 5;
        int b = 6;
        System.out.println(a + b > 0 ? "Сума позитивна" : "Сума негативна");
    }

    private static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }
}
