import java.util.*;
import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {
        //для Задания 1.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Задание 1.1.Введите целое число: ");
        if (scanner.hasNextInt()) {
            int numb = scanner.nextInt();
            System.out.println(numb);
        } else {
            System.out.println("Задание 1.1. Вы ввели не целое число");
        }

        int[] my_list = new int[]{1, 4, 8, 99, 7, 6};
        System.out.println(getIndex(my_list, 6, 5));

        /* Задание 2.
        2.1. Исключение для обработки значений строкового двумерного массива
        2.2. Исключение по длине второй размерности массива
        2.3. Исключение на нулевой массив
        public static int sum2d(String[][] arr) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < 5; j++) {
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                }
            }
            return sum;
        } */
    

        //для задания 3
        ex_01 obj = new ex_01();
        Integer[] myArray1 = new Integer[]{2,7,8,9,7};
        Integer[] myArray2 = new Integer[]{7,5,10,1,4};
        Integer[] myArray3 = obj.diffArray(myArray1, myArray2);
        System.out.println("Задание 3. Поэлементная разница в введенных массивах'");
        for (int i = 0 ; i < myArray3.length; i++)
            System.out.println(myArray3[i]);
    }



    /* Задание 3. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
    и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов 
    в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.*/

    public Integer[] diffArray(Integer[] myArray1, Integer[] myArray2) {
        int len = 0;
        if (myArray1 == null || myArray2 == null) {
			throw new RuntimeException("Задание 3. Оба массива должны существовать.");
		}
		else if (myArray1.length != myArray2.length) {
			throw new RuntimeException("Задание 3. Кол-во элементов массива должно быть одинаково.");
		}
        else {
            len = myArray1.length;
            Integer[] myarray3 = new Integer[len];
            for(int i = 0; i < len; i++) {
                if ((myArray1[i] == null) || (myArray2[i] == null))
                    throw new RuntimeException("Задание 3. В массиве есть значения Null");
                else myarray3[i]=myArray1[i]-myArray2[i];
            }
            return myarray3;
        }
        
    }
    
    private static int getIndex(int[] array, int min, int arg) {
        if (array == null) {
            System.out.println("Задание 1.2. Массив не задан");
            return -3;
        } else if (array.length < min) {
            System.out.println("Задание 1.3. Длина массива меньше заданной");
            return -1;
        } else {
            for (int i = 0; i < array.length; i++) {
                if (arg == array[i]) {
                    return i;
                }
            }
            System.out.println("Задание 1.4. Искомый элемент не найден");
            return -2;
        }
    }

}
