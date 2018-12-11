// Без эксепшенов

import java.util.Scanner;

public class NameAndAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("How old are you, " + name + "?");
        int age = scan.nextInt();
        System.out.println("So, your name is " + name + " and you're " + age + " years old!");
    }
}


/*
Ввести с клавиатуры число и имя, вывести на экран строку:
           Я "имя” и мне "число” лет!
Требования:
• Программа должна выводить текст.
• Программа должна считывать данные с клавиатуры.
• Выведенный текст должен содержать введенное имя.
• Выведенный текст должен содержать введенное число.
 */