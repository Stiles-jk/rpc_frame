package com.rcp.expose;

import com.rcp.expose.CharArrayService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @auther Stiles-JKY
 * @date 2020/9/9-21:10
 */
public class Client {

    public static void main(String[] args) {
        //查找远程对象
        try {
            CharArrayService charArrayService = (CharArrayService) Naming.lookup(args[0]);
            int startIndex = charArrayService.findStartIndex("aabaadgdg", "adg");
            System.out.println(startIndex);
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
