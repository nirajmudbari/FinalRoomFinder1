package com.niraaz.finalroomfinder.service.impl;

import com.niraaz.finalroomfinder.dao.RoomDao;
import com.niraaz.finalroomfinder.dao.impl.RoomDaoImpl;
import com.niraaz.finalroomfinder.entity.Room;
import com.niraaz.finalroomfinder.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    RoomDaoImpl roomDao;

    public List<Room> getAllRooms() {
        return roomDao.getAllRooms();
    }

    public Room getRoomById(int id) {
        return roomDao.getRoomById(id);
    }

    public void addRoom(Room room) {
        roomDao.addRoom(room);
    }

    public void update(Room room) {
        roomDao.update(room);
    }

    public void delete(int id) {
        roomDao.delete(id);
    }
}
