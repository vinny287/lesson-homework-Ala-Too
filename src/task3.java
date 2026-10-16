import java.util.Scanner;

void main() {

    Scanner WED = new Scanner(System.in);
    int x = WED.nextInt();
    if (x % 2 == 0) {
        System.out.println("Ваше число делится");
    } else {
        System.out.println("Ваше число не делится");
    }
}
