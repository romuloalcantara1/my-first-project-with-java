import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Earned amount:");
        System.out.println("""
                        Bubblegum: $202
                        Toffee: $118
                        Ice cream: $2250
                        Milk chocolate: $1680
                        Doughnut: $1075
                        Pancake: $80""");
        System.out.println("Income: $5405");

        int income = 5405;

        System.out.println("Staff expenses:");
        int staffExpenses = scanner.nextInt();

        System.out.println("Other expenses:");
        int otherExpenses = scanner.nextInt();        
        
        int netIncome = income - staffExpenses - otherExpenses;

        System.out.println("Net income: $" + netIncome);
    }
}