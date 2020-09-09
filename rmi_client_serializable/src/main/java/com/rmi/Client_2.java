package com.rmi;

import com.rmi.expose.UserSearchService;
import com.rmi.pojo.User;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @auther Stiles-JKY
 * @date 2020/9/9-21:59
 */
public class Client_2 {

    public static void main(String[] args) {
        try {
            UserSearchService searchServices = (UserSearchService) Naming.lookup("rmi://localhost:8888/remote/search/user");
            User userInfo = searchServices.getUserInfo();
            System.out.println(userInfo.toString());
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
