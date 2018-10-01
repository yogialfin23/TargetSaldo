package com.company;

/**
 * Yogie Alfin Salim
 * 10117100
 * IF - 3
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double Saldo, Bunga, Bunga1;
        double Bulan = 0;
        int Bulan1;

        Scanner sc = new Scanner(System.in);
        System.out.println("=====Program Bunga Bank======");
        System.out.print("Saldo Awal     : Rp ");
        Saldo = sc.nextDouble();
        System.out.print("Bunga/Bulan (%): ");
        Bunga = sc.nextDouble();
        System.out.print("Lama Menabung  : ");
        Bulan1 = sc.nextInt();

        System.out.println();
        Bunga = Bunga / 100;
        for (Bulan = 1; Bulan <= Bulan1; Bulan++) {
            Bunga1 = Saldo * Bunga;
            Saldo = (int) (Saldo + Bunga1);
            System.out.println("Saldo di bulan ke- " + Bulan + "  Rp " + Saldo);

        }
    }
}
