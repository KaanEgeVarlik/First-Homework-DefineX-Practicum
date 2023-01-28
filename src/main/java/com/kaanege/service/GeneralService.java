package com.kaanege.service;

import com.kaanege.CreatedObjects;
import com.kaanege.entities.House;
import com.kaanege.entities.Villa;
import com.kaanege.entities.SummerHouse;

import java.util.ArrayList;


public class GeneralService {

    CreatedObjects dummyObject = new CreatedObjects();
    
    public int getHouseTotalPrice(){
        return dummyObject.getHouseList().stream().mapToInt(House::getPrice).sum();
    }
    public int getVillaTotalPrice(){
        return dummyObject.getVillaList().stream().mapToInt(Villa::getPrice).sum();
    }
    public int getSummerHouseTotalPrice(){
        return dummyObject.getSummerHouseList().stream().mapToInt(SummerHouse::getPrice).sum();
    }

    public int getTotalPrice() {
        return (dummyObject.getHouseList().stream().mapToInt(House::getPrice).sum()
                + dummyObject.getVillaList().stream().mapToInt(Villa::getPrice).sum()
                + dummyObject.getSummerHouseList().stream().mapToInt(SummerHouse::getPrice).sum())/2;
    }

    public int getHousesSquare(){
        return dummyObject.getHouseList().stream().mapToInt(House::getSquareRoot).sum();
    }
    public int getVillasSquare(){
        return dummyObject.getVillaList().stream().mapToInt(Villa::getSquareRoot).sum();
    }
    public int getSummerHousesSquare(){
        return dummyObject.getSummerHouseList().stream().mapToInt(SummerHouse::getSquareRoot).sum();
    }
    public int getTotalSquare(){
        return (dummyObject.getHouseList().stream().mapToInt(House::getSquareRoot).sum()
                + dummyObject.getVillaList().stream().mapToInt(Villa::getSquareRoot).sum()
                + dummyObject.getSummerHouseList().stream().mapToInt(SummerHouse::getSquareRoot).sum());
    }

    public Object filterEverything(int roomCount,int livingRoomCount) {
        ArrayList<Object> filteredObjects = new ArrayList<>();
        dummyObject.getHouseList().stream().forEach(e -> {
            if(e.getRoomCount() == roomCount & e.getLivingRoomCount() == livingRoomCount)
                filteredObjects.add(e);
        });
        dummyObject.getVillaList().stream().forEach(e -> {
            if(e.getRoomCount() == roomCount & e.getLivingRoomCount() == livingRoomCount)
                filteredObjects.add(e);
        });
        dummyObject.getSummerHouseList().stream().forEach(e -> {
            if(e.getRoomCount() == roomCount & e.getLivingRoomCount() == livingRoomCount)
                filteredObjects.add(e);
        });
        return filteredObjects;
    }
}
