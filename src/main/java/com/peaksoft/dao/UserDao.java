package com.peaksoft.dao;

import com.peaksoft.model.User;

public interface UserDao {
    User getUserByName(String name);
}
