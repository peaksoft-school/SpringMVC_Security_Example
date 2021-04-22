package peakoft.dao;

import peakoft.model.User;

public interface UserDao {
    User getUserByName(String name);
}
