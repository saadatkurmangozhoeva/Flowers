package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        Bouquet.assembleBouquet();
//        Bouquet.assembleBouquet();
        Bouquet bouquet = Bouquet.assembleBouquet();

        Bouquet.sort();

        System.out.print("\nВведите количество стеблей -> ");
        bouquet.findByLength(scan.nextInt());


    }

}
