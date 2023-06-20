/* Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
вместо этого, необходимо повторно запросить у пользователя ввод данных.
*/

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
