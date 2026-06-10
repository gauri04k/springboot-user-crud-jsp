package com.jsp.UserCRUD.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.UserCRUD.dao.UserDao;
import com.jsp.UserCRUD.model.User;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao dao;

    @Override
    public User saveUser(User user) {
        return dao.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return dao.findAll();
    }

    @Override
    public User getUserById(int id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    public void deleteUser(int id) {
        dao.deleteById(id);
    }
}