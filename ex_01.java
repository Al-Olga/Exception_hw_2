import java.util.*;
import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {
        inputNumbFloat();
    }

    private static float inputNumbFloat() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Введите дробное число (с запятой)");
                String input = scanner.nextLine();
                return Float.parseFloat(input);
            } catch (NumberFormatException e) {
                System.out.println("Введено не дробное число");
            }
            scanner.close();
        }
    }
}
