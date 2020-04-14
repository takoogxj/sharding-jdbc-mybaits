package com.gxj.sharding.service;

import com.gxj.sharding.entity.User;

import java.util.List;

public interface UserService {

    public boolean insert(User u);

    public List<User> findAll();

    public List<User> findByUserIds(List<Integer> ids);

    public void transactionTestSucess();

    public void transactionTestFailure() throws IllegalAccessException;

}
