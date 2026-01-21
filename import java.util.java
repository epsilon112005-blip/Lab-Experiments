import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Get the number of items
        System.out.print("Enter number of items: ");
        int a = input.nextInt();

        System.out.println("Enter item value and discount percent \n");
        double totalPrice = 0;

        // 2. Loop to calculate price for each item
        for (int i = 1; i <= a; i++) {
            System.out.print("Item " + i + " price: ");
            int price = input.nextInt();

            System.out.print("Item " + i + " discount: ");
            int discount = input.nextInt();

            // Note: 100.0 ensures the math is done with decimals
            double discountAmount = price * (discount / 100.0);
            double finalPrice = price - discountAmount;
            totalPrice += finalPrice;
        }

        System.out.println("\nTotal price before bulk discount: " + totalPrice);

        // 3. Tiered Discount Logic (Fixed)
        if (totalPrice > 1000) {
            totalPrice = totalPrice - 150;
            System.out.println("Tier 1 Applied: -$150");
        } else if (totalPrice > 500) {
            totalPrice = totalPrice * 0.90;
            System.out.println("Tier 2 Applied: 10% Off");
        } else {
            // Price remains unchanged
            System.out.println("No bulk discount applied.");
        }

        // 4. Final Output formatted to 2 decimal places
        System.out.printf("Total Payable after discount: %.2f\n", totalPrice);
        
        input.close();
    }
}