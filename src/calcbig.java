import java.util.Scanner;
public class calcbig {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Введите ваше первое число: ");
    int num1 = input.nextInt();
    System.out.println("Введите ваше второе число: ");
    int num2 = input.nextInt();
    int res100 = num1 + num2;
    System.out.println("Результат сложения ваших чисел: " + res100);
    int res200 = num1 * num2;
    System.out.println("Результат умножения ваших чисел: " + res200);
    int res300 = num1 / num2;
    System.out.println("Результат деления ваших чисел: " + res300);
    int res400 = num1 - num2;
    System.out.println("Результат вычитания ваших чисел: " + res400);
}
}