package application;

import entities.info;
import java.util.Locale;
import java.util.Scanner;

public class Employer {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        info emp = new info();
        System.out.print("Name: ");
        emp.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        emp.salary = sc.nextDouble();
        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.println("Employee: " + emp);
        System.out.println();
        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emp.increase(percentage);
        System.out.println();
        System.out.println("Updated data" + emp);

        sc.close();
    }
}