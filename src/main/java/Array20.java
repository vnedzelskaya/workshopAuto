import java.util.Scanner;

public class Array20 {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Number " + i + "?");
            numbers[i] = scan.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2 == 0) {
                System.out.println("Even (четные): " + numbers[i]);
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2 != 0) {
                System.out.println("Odd (нечетные): " + numbers[i]);
            }
        }
    }
}


/*
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива с четными и нечетными числами.
4. Вывести оба массива на экран, каждое значение выводить с новой строки.
 */