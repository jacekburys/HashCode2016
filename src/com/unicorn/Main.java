package com.unicorn;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner;
        try {
            scanner = new Scanner(new File(args[0]));
        } catch(Exception e) {
           return;
        }

        int rows, cols, drones, turns, maxPayload;
        rows = scanner.nextInt();
        cols = scanner.nextInt();
        drones = scanner.nextInt();
        turns = scanner.nextInt();
        maxPayload = scanner.nextInt();

        int prodTypes = Integer.parseInt(scanner.next());
        int[] prodWeight = new int[prodTypes];

        for(int i=0; i<prodTypes; i++) {
            prodWeight[i] = scanner.nextInt();
        }

        int warehouses = scanner.nextInt();

        for(int i=0; i<warehouses; i++) {
            int r = scanner.nextInt();
            int c = scanner.nextInt();

            // TODO : init warehouse

            for(int j=0; j<prodTypes; j++) {
               // TODO : save values in warehouse
            }
        }

        int orders = scanner.nextInt();

        for(int i=0; i<orders; i++) {
            // TODO : init order

            int r = scanner.nextInt();
            int c = scanner.nextInt();

            int n = scanner.nextInt();
            for(int j=0; j<n; j++) {
                int type = scanner.nextInt();
                // TODO : put item in order
            }
        }

    }
}
