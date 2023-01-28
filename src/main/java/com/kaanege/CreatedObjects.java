package com.kaanege;

import com.kaanege.entities.House;
import com.kaanege.entities.SummerHouse;
import com.kaanege.entities.Villa;

import java.util.ArrayList;
import java.util.Arrays;


public class CreatedObjects {


    House houseOne = new House(100,165,3,1);
    House houseTwo = new House(80,100,2,1);
    House houseThree = new House(250,250,4,2);


    Villa villaOne = new Villa(165,190,5,1);
    Villa villaTwo = new Villa(200,210,6,1);
    Villa villaThree = new Villa(250,250,7,2);


    SummerHouse summerHouseOne = new SummerHouse(90,95,3,1);
    SummerHouse summerHouseTwo = new SummerHouse(120,120,3,1);
    SummerHouse summerHouseThree = new SummerHouse(175,165,4,1);

    ArrayList<House> houses = new ArrayList<House>(Arrays.asList(houseOne,houseTwo,houseThree));
    ArrayList<Villa> villas = new ArrayList<Villa>(Arrays.asList(villaOne,villaTwo,villaThree));
    ArrayList<SummerHouse> summerHouses = new ArrayList<SummerHouse>(Arrays.asList(summerHouseOne,summerHouseTwo,summerHouseThree));
    public ArrayList<House> getHouseList(){
        return houses;
    }
    public ArrayList<Villa> getVillaList(){
        return villas;
    }
    public ArrayList<SummerHouse> getSummerHouseList(){
        return summerHouses;
    }

}
