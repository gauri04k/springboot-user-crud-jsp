package com.jsp.UserCRUD.service;

import java.util.List;
import com.jsp.UserCRUD.model.User;

public interface UserService {

    User saveUser(User user);

    List<User> getAllUsers();

    User getUserById(int id);

    void deleteUser(int id);
}