package com.niraaz.finalroomfinder.dao.impl;

import com.niraaz.finalroomfinder.dao.UserDao;
import com.niraaz.finalroomfinder.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    SessionFactory sessionFactory;

    public User getUserByUsername(String username) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        User user = new User();

        transaction.commit();
        session.close();
        return user;
    }
}
