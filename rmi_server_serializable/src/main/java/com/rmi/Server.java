package com.rmi;

import com.rmi.expose.UserSearchService;
import com.rmi.expose.impl.UserSearchServiceImpl;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * @auther Stiles-JKY
 * @date 2020/9/9-21:43
 */
public class Server {

    public static void main(String[] args) {

        try {
            UserSearchService searchService = new UserSearchServiceImpl();
            LocateRegistry.createRegistry(8888);
            Naming.bind("rmi://localhost:8888/remote/search/user", searchService);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        }
    }
}
