package com.rcp.expose.test;

import com.rcp.expose.impl.CharArrayServiceImpl;

import java.rmi.RemoteException;

/**
 * @auther Stiles-JKY
 * @date 2020/9/9-21:01
 */
public class KMPTest {
    public static void main(String[] args) {
        try {
            CharArrayServiceImpl charArrayService = new CharArrayServiceImpl();
            System.out.println(charArrayService.findStartIndex("abacataf", "cat"));
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
