package Excessao;

import Excessao.entities.Account;
import Excessao.exceptions.businessException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Holder: ");
        String holder = sc.nextLine();
        System.out.print("Initial Balance: ");
        Double balance = sc.nextDouble();
        sc.nextLine();
        System.out.print("Withdraw Limit: ");
        Double withdrawLimit = sc.nextDouble();
        sc.nextLine();
        System.out.println();
        Account ac = new Account(number, holder, balance, withdrawLimit);
        System.out.print("Enter amount for withdraw: ");
        try {
            ac.withdraw(sc.nextDouble());
            System.out.println("New balance " + ac.getBalance());
        } catch (businessException e) {
            System.out.println(e.getMessage());
        }

    }

}
