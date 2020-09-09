package com.rmi.expose.impl;

import com.rmi.expose.UserSearchService;
import com.rmi.pojo.User;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @auther Stiles-JKY
 * @date 2020/9/9-21:52
 */
public class UserSearchServiceImpl extends UnicastRemoteObject implements UserSearchService {

    public UserSearchServiceImpl() throws RemoteException {
    }

    @Override
    public User getUserInfo() {
        return new User();
    }
}
