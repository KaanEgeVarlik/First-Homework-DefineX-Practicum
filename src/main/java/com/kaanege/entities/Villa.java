package com.kaanege.entities;
import lombok.Getter;


@Getter
public class Villa {

    int price;
    int squareRoot;
    int roomCount;
    int livingRoomCount;


    public Villa(int price, int squareRoot, int roomCount, int livingRoomCount){
        this.price = price;
        this.squareRoot = squareRoot;
        this.roomCount = roomCount;
        this.livingRoomCount = livingRoomCount;
    }


}
