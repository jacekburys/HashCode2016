package com.unicorn;

import com.unicorn.events.Event;
import com.unicorn.events.EventQueue;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
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

        int prodTypesCount = Integer.parseInt(scanner.next());
        List<Integer> prodWeight = new ArrayList<>(prodTypesCount);

        for(int i=0; i<prodTypesCount; i++) {
            prodWeight.set(i, scanner.nextInt());
        }

        int warehousesCount = scanner.nextInt();
        List<Warehouse> warehouses = new ArrayList<>(warehousesCount);

        for(int i=0; i<warehousesCount; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            Warehouse warehouse = new Warehouse(new Location(x,y));

            for(int j=0; j<prodTypesCount; j++) {
                // Read the count of the product
                int count = scanner.nextInt();
                warehouse.addProduct(new Product(j, prodWeight.get(j)), count);
            }

            warehouses.add(warehouse);
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

        // TODO : init world
        World world = new World();

        EventQueue eventQueue = new EventQueue();

        while(eventQueue.hasNext()) {
            Event event = eventQueue.getNext();
            event.execute(world);
        }
    }
}
