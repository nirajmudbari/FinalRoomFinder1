package com.niraaz.finalroomfinder.dao;

import com.niraaz.finalroomfinder.entity.User;

public interface UserDao {

    User getUserByUsername(String username);

}
