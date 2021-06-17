package Exercicios_Heranca;

import Exercicios_Heranca.entities.Company;
import Exercicios_Heranca.entities.Individual;
import Exercicios_Heranca.entities.TaxPayer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();
        System.out.print("Enter the number of tax payers: ");

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Individual od company (i/c)?");
            System.out.println("Tax payer #" + i + 1 + " data:");
            char q = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual Income: ");
            Double anualIncome = sc.nextDouble();
            if (q == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextInt();
                list.add(new Individual(name, anualIncome, healthExpenditures));
            } else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                list.add(new Company(name, anualIncome, numberOfEmployees));
            }

        }
        System.out.println();
        System.out.println("TAXES PAYED");
        double sum = 0.0;
        for (TaxPayer tp : list) {
            double tax = tp.tax();
            System.out.println(tp.getName() + ": $" + String.format("%.2f", tax));
            sum += tax;
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $" + String.format("%.2f", sum));

    }
}
