import java.util.Scanner;
public class task7 {
    public static void main(String[] args) {
        Scanner disc = new Scanner(System.in);

        System.out.println("Please enter next details: ");
        System.out.println("Total purchase amount: ");
        double amount = disc.nextDouble();

        if (amount < 100) {
            System.out.println("No discount for your purchase.");
            System.out.println("Final price: $" + amount );
        } else {
            System.out.println("Premium member (true/false): ");
            boolean member = disc.nextBoolean();

            System.out.println("Previous orders: ");
            int order = disc.nextInt();

            System.out.println("Discount coupon (true/false): ");
            boolean coupon = disc.nextBoolean();

            System.out.println("Birthday month (true/false): ");
            boolean birth = disc.nextBoolean();
            System.out.println("Original price: $" + amount);
            if (amount >= 200 && member) {
                if (coupon || birth) {
                    System.out.println("    Discount: 20%");
                    System.out.println("    Discount amount: $" + amount * 0.2);
                    amount *= 0.8;
                    System.out.println("    Final price: $" + amount);
                } else {
                    System.out.println("    Discount: 15%");
                    System.out.println("    Discount amount: $" + amount * 0.15);
                    amount *= 0.85;
                    System.out.println("    Final price: $" + amount );
                }
            } else if (amount >= 150 && (member || order >= 10)) {
                System.out.println("    Discount: 15%");
                System.out.println("    Discount amount: $" + amount * 0.15);
                amount *= 0.85;
                System.out.println("    Final price: $" + amount );
            } else if (amount >= 100 && coupon) {
                System.out.println("    Discount: 10%");
                System.out.println("    Discount amount: $" + amount * 0.1);
                amount *= 0.9;
                System.out.println("    Final price: $" + amount );
            } else {
                System.out.println("    No discount for your purchase.");
                System.out.println("    Final price: $" + amount );
            }
        }
    }
}