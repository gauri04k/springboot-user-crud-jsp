package com.jsp.UserCRUD.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.UserCRUD.model.User;

public interface UserDao extends JpaRepository<User,Integer> {

}
