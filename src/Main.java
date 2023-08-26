import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lütfen adınızı giriniz...");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println("Hoş geldiniz " + name +" :)\nLütfen kart bakiyenizi giriniz...");
        int cash = input.nextInt();
        Customer newCustomer = new Customer(name, cash);
        newCustomer.printCustomerInfo();
        newCustomer.shop();
    }
}