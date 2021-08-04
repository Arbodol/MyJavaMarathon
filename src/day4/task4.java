package day4;

import java.util.Arrays;
import java.util.Random;

import static java.util.Arrays.*;

/**Создать новый массив размера 100 и заполнить его случайными числами из
 диапазона от 0 до 10000.
 Найти максимум среди сумм трех соседних элементов. Для найденной тройки с
 максимальной суммой выведите значение суммы и индекс первого элемента тройки.
 Пример:
 *Для простоты пример показан на массиве размера 10
 [1, 456, 1025, 65, 954, 2789, 4, 8742, 1040, 3254]
 Тройка с максимальной суммой: [2789, 4, 8742]
 Вывод в консоль:
 11535
 5
 *Пояснение. Первое число - сумма тройки [2789, 4, 8742]. Второе число - индекс
 первого элемента тройки, то есть индекс числа 2789.
 */

public class task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10000);

        int maxSum = 0;
        int maxSumIndex = 0;
        for (int i = 0; i < array.length - 2; i++) {
            int sum = 0;
            sum = array[i] + array[i + 1] + array[i + 2];
            if (sum > maxSum) {
                maxSum = sum;
                maxSumIndex = i;
            }
            System.out.println(maxSum);
            System.out.println();
            System.out.println(maxSumIndex);
        }
    }
}