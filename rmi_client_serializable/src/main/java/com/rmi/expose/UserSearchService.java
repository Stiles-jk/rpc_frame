package com.rmi.expose;

import com.rmi.pojo.User;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @auther Stiles-JKY
 * @date 2020/9/9-21:44
 */
public interface UserSearchService extends Remote {
    User getUserInfo() throws RemoteException;
}
