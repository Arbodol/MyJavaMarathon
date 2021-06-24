package day1;

/**
 * Вывести на экран слово “JAVA”, в строку, чтобы оно повторилось 10 раз, используя цикл while.
 * Вывод в консоль должен быть таким: JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA
 */

public class task1 {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 9) {
            System.out.print("JAVA ");
            i = i+1;
        }
    }

}
