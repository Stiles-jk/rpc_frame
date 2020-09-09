package com.rcp;

import com.rcp.expose.CharArrayService;
import com.rcp.expose.impl.CharArrayServiceImpl;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * @auther Stiles-JKY
 * @date 2020/9/9-20:42
 */
public class Server {

    public static void main(String[] args) {
        try {
            //由于继承了UnicastRemote，所以会自动发布
            CharArrayService charArrayService = new CharArrayServiceImpl();
            //注册远程对象
            LocateRegistry.createRegistry(8888);
            Naming.bind("rmi://localhost:8888/service/char",charArrayService);
        } catch (RemoteException e) {
            System.out.println("have wrong");
        } catch (MalformedURLException e) {
            System.out.println("have wrong");
        } catch (AlreadyBoundException e) {
            System.out.println("have wrong");
        }
    }
}
