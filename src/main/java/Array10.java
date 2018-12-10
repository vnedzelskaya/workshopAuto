import java.util.Scanner;

public class Array10 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Number " + i + "?");
            numbers[i] = scan.nextInt();
        }
        for (int i = 9; i > -1; i--) {
            System.out.println(i + ": " + numbers[i]);
        }
    }
}

/*
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.
 */
