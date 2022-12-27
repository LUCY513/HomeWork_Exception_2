import java.io.IOException;
import java.util.Scanner;
import java.util.SimpleTimeZone;

// 2.2 Разработайте программу, которая выбросит Exception,
// когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("| Enter a string |");

        try {
            enterString(scanner);
        } catch (Exception e) {
            System.out.println(": You enter string empty :");
        }
    }

    public static void enterString(Scanner str) throws IOException {
        String string = str.nextLine();

        if (string == null || string.isEmpty()) {
            throw new IOException();
        } else {
            System.out.println("Your string -> " + string);
        }
    }
}