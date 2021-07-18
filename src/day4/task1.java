package day4;

import java.util.Arrays;
import java.util.Scanner;

/**
// С клавиатуры вводится число n - размер массива. Необходимо создать массив
//указанного размера и заполнить его случайными числами от 0 до 10. Затем вывести
//содержимое массива в консоль, а также вывести в консоль информацию о:
//а) Длине массива
//б) Количестве чисел больше 8
//в) Количестве чисел равных 1
//г) Количестве четных чисел
//д) Количестве нечетных чисел
//е) Сумме всех элементов массива
//Пример:
//Введено число 10. Сгенерирован следующий массив:
//[4, 8, 4, 9, 5, 2, 2, 3, 3, 6]
//Информация о массиве:
//Длина массива: 10
//Количество чисел больше 8: 1
//Количество чисел равных 1: 0
//Количество четных чисел: 6
//Количество нечетных чисел: 4
//Сумма всех элементов массива: 46
*/

public class task1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = scn.nextInt();
        int[] array = new int[n];
        int count = 0;

        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * 10);
            }
        System.out.println("Информация о массиве: " + Arrays.toString(array));
        System.out.println("Длина массива: " + array.length);

        for (int i = 0; i < array.length; i++){
            if (array[i] > 8){
                count++;
            }
            }
        System.out.println("Количество чисел больше 8: " + count);
        count = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] == 1){
                count++;
            }
        }
        System.out.println("Количество чисел равных 1: " + count);
        count = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Количество четных чисел: " + count);
        count = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 != 0) {
                count++;
            }
        }
        System.out.println("Количество нечетных чисел: " + count);
        count = 0;

        for (int i = 0; i < array.length; i++){
            count += array[i];
        }
        System.out.println("Сумма всех элементов массива: " + count);
        }
}
