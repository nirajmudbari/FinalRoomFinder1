package com.niraaz.finalroomfinder.entity;

import javax.persistence.*;

@Entity
@Table(name = "room")
public class Room {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "roomType")
    private String roomType;

    @Column(name = "price")
    private double price;

    @Column(name = "image")
    private String image;

    @Column(name = "description")
    private String description;

    @Column(name = "location")
    private String location;

    @Column(name = "facilities")
    private String facilities;

    public Room(int id, String roomType, double price, String image, String description, String location, String facilities) {
        this.id=id;
        this.roomType = roomType;
        this.price = price;
        this.image = image;
        this.description = description;
        this.location = location;
        this.facilities = facilities;
    }

    public Room() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }


}
