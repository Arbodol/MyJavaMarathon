package day4;

import java.util.Random;

/**Создать новый массив размера 100 и заполнить его случайными числами из
 диапазона от 0 до 10000.
 Затем, используя циклы for each вывести:
 - наибольший элемент массива
 - наименьший элемент массива
 - количество элементов массива, оканчивающихся на 0
 - сумму элементов массива, оканчивающихся на 0
 Использовать сортировку запрещено.
 */

public class task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10000);

        int smallest = array[0];
        int largest = array[0];
        for (int i = 1; i < array.length; ++i) {
            int value = array[i];
            if (value < smallest) {
                smallest = value;
            } else if (value > largest) {
                largest = value;
            }
        }
        System.out.println("Наибольший элемент массива: " + largest);
        System.out.println("Наименьший элемент массива: " + smallest);

        int zero = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 10 == 0) {
                zero++;
            }
        }
        System.out.println("количество элементов массива, оканчивающихся на 0: " + zero);

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 10 == 0) {
                sum += array[i];
            }
            }
        System.out.println("сумма элементов массива, оканчивающихся на 0: " + sum);
    }
}
