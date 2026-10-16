import java.util.Scanner;

public class task4 {
    public static void main(String[] args){

        Scanner Minion = new Scanner(System.in);
        System.out.println("Enter your operation:");

        double a1 = Minion.nextDouble();
        char b = Minion.next().charAt(0);
        double a2 = Minion.nextDouble();

      if (b == '+')
          System.out.println("Addition result:" + (a1+a2));

      else if (b == '-')
          System.out.println("Substruction result:" +(a1-a2));
      else if (b == '*')
          System.out.println("Multiplication result:" + (a1*a2));
      else if (b == '/'){
          if (a2 != 0)
          System.out.println("Division result:" + (a1/a2));
          else {
              System.out.println("Not possible");
          }
      }
      else {
          System.out.println("Wrong operation");
      }


    }
}