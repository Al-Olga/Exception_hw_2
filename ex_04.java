/* Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя. */

import java.util.*;
import java.util.Scanner;

public class ex_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();
        if(str.isEmpty())
           throw new IllegalArgumentException("Пустые строки вводить нельзя");
        else
           System.out.println(str);
    }
}   
  
