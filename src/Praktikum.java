import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int inputYear = scanner.nextInt();
        if (isLeapYear(inputYear)) {
            System.out.println("12.09." + inputYear);
        } else {
            System.out.println("13.09." + inputYear);
        }
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || year % 4 == 0;
    }
}