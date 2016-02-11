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

        int rows, cols, dronesCount, turns, maxPayload;
        rows = scanner.nextInt();
        cols = scanner.nextInt();
        dronesCount = scanner.nextInt();
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

        // Init drones

        // Drones start at warehouse 0
        Location start = warehouses.get(0).getLocation();

        List<Drone> drones = new ArrayList<>(dronesCount);
        for (int i = 0; i < dronesCount; i++) {
            Drone drone = new Drone(i, maxPayload, null, start);
            drones.add(drone);
        }

        int ordersCount = scanner.nextInt();
        List<Order> orders = new ArrayList<>(ordersCount);

        for(int i=0; i<ordersCount; i++) {

            int x = scanner.nextInt();
            int y = scanner.nextInt();

            int n = scanner.nextInt();
            List<Product> products = new ArrayList<>(n);

            for(int j=0; j<n; j++) {
                int type = scanner.nextInt();
                products.add(new Product(type, prodWeight.get(j)));
            }

            Order order = new Order(products, new Location(x, y));
            orders.add(order);
        }

        // TODO : init world
        World world = new World(warehouses, drones, orders);

        EventQueue eventQueue = new EventQueue();

        while(eventQueue.hasNext()) {
            Event event = eventQueue.getNext();
            event.execute(world);
            world.schedule();
        }
    }
}
