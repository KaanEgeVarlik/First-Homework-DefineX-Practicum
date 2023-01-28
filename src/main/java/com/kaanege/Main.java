package com.kaanege;


import com.kaanege.service.GeneralService;



public class Main {
    public static void main(String[] args) {

        CreatedObjects dummyObject = new CreatedObjects();

        System.out.println("House list is as follows : " + dummyObject.getHouseList());
        System.out.println("Villa list is as follows : " + dummyObject.getVillaList());
        System.out.println("Summer House list is as follows : " + dummyObject.getSummerHouseList());

        GeneralService generalService = new GeneralService();

        System.out.println("Total price of the houses is : " + generalService.getHouseTotalPrice() + "k");
        System.out.println("Total price of the villas is : " + generalService.getVillaTotalPrice() + "k");
        System.out.println("Total price of the summer houses is : " + generalService.getSummerHouseTotalPrice() + "k");
        System.out.println("Total price is : " + generalService.getTotalPrice() + "k");

        System.out.println("Square-meter of houses are as follows : " + generalService.getHousesSquare());
        System.out.println("Square-meter of villas are as follows : " + generalService.getVillasSquare());
        System.out.println("Square-meter of summer houses are as follows : " + generalService.getSummerHousesSquare());
        System.out.println("Total square-meter is : " + generalService.getTotalSquare());

        System.out.println("Oda sayısı 3, salon sayısı 1 olan evler : " + generalService.filterEverything(3,1));
    }
}