package com.using.hashset.service;

import com.using.hashset.model.Order;
import com.using.hashset.model.Restaurant;

import java.util.*;

public class RestaurantService {
    private HashMap<Integer,Restaurant> restaurants = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    void printCustomer(Restaurant r){

        System.out.println(r);
    }
    public Restaurant createRestaurant(){

            System.out.println("Please enter registerNo");
            int registerNo = Integer.parseInt(sc.nextLine());

            System.out.println("Please enter name");
            String name = sc.nextLine();

            System.out.println("Please enter city");
            String city = sc.nextLine();

            System.out.println("Please enter area");
            String area = sc.nextLine();

            Restaurant r = new Restaurant();

            r.setRegisterNo(registerNo);
            r.setName(name);
            r.setCity(city);
            r.setArea(area);
            restaurants.put(1,r);
            return r;
        }
    public void displayRestaurant(){
        Set<Map.Entry<Integer, Restaurant>> entrySet = restaurants.entrySet();
        for(Map.Entry<Integer,Restaurant>customerEntry : entrySet){
            System.out.println("Customer Info: " + restaurants );
        }
    }
}