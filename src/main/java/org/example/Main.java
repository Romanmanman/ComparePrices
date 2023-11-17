package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> list = new ArrayList<>();
        while (true){
            System.out.println("Enter \"=\" - to get the result or any other button to add the product");
            String next = scanner.next();
            if (next.equals("=")){
                break;
            }
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter product name:");
            String name = scan.nextLine();
            System.out.println("Enter weight:");
            double weight = scanner.nextDouble();
            System.out.println("Enter price:");
            double price = scanner.nextDouble();
            list.add(new Product(name, weight, price));
        }
        Collections.sort(list, ((o1, o2) -> (int) (o1.getPriceOfOneKG() - o2.getPriceOfOneKG())));
        int a = 1;
        for (Product p : list){
            System.out.println(a++ + ". " + p);
        }
    }
}