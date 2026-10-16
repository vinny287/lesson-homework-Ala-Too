import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {

        Scanner vision = new Scanner(System.in);
        System.out.println("task5");
        System.out.println("Enter points for attendance (/10):");
        int attPoint = vision.nextInt();
        System.out.println("Enter points for homework (/60):");
        int homePoint = vision.nextInt();
        System.out.println("Enter points for exam (/30):");
        int examPoint = vision.nextInt();
        if (attPoint > 10 | attPoint < 0 | homePoint > 60 | homePoint < 0 | examPoint > 30 | examPoint < 0)
            System.out.println("You entered incorrect data");
        else if (attPoint >= 0 && attPoint < 6)
            System.out.println("Failed! Your attendance os too low!");
        else if (examPoint >= 0 && examPoint < 17)
            System.out.println("Failed! Your exam points are not enough");
        else if (attPoint + homePoint + examPoint >= 65)
            System.out.println("You passed! Congratulations!");
        else {
            System.out.println("Failed! Total points are not enough");

        }

    }
}
