package Quizzes.CoffeeShop;

import java.util.*;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] customers = new int[n][2];

        for (int i = 0; i < n; i++) {
            customers[i][0] = scanner.nextInt();
            customers[i][1] = scanner.nextInt();
        }

        Arrays.sort(customers, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(a[1], b[1]);
        });

        int totalMilk = 0;
        int totalCoffee = 0;
        int satisfiedCustomers = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (satisfiedCustomers >= (n + 1) / 2) {
                break;
            }
            totalMilk += customers[i][0];
            totalCoffee += customers[i][1];
            satisfiedCustomers++;
        }

        System.out.println(totalMilk + " " + totalCoffee);
    }
}
