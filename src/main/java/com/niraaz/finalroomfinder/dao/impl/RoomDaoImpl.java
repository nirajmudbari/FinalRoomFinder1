package com.niraaz.finalroomfinder.dao.impl;

import com.niraaz.finalroomfinder.dao.RoomDao;
import com.niraaz.finalroomfinder.entity.Room;
import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RoomDaoImpl implements RoomDao {

    @Autowired
    SessionFactory sessionFactory;

    public Session getSession( ) {
        try {
            return sessionFactory.getCurrentSession( );
        }catch ( HibernateException he ) {
            return sessionFactory.openSession();
        }
    }

    public List<Room> getAllRooms() {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Criteria criteria = session.createCriteria(Room.class);
        List<Room> roomList = criteria.list( );
        tx.commit();
        session.close();
        return roomList;
    }

    public Room getRoomById(int id) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Room room = session.get( Room.class, id );
        tx.commit();
        session.close();
        return room;
    }

    public void addRoom(Room room) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save( room );
        tx.commit();
        session.close();
    }

    public void update(Room room) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.update( room );
        tx.commit();
        session.close();

    }

    public void delete(int id) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Room room = session.get( Room.class, id );
        session.delete( room );
        tx.commit();
        session.close();

    }
}
