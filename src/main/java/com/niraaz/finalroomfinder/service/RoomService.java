package com.niraaz.finalroomfinder.service;

import com.niraaz.finalroomfinder.entity.Room;

import java.util.List;

public interface RoomService {

    List<Room> getAllRooms();
    Room getRoomById(int id);
    void addRoom(Room room);
    void update(Room room);
    void delete(int id);
}
