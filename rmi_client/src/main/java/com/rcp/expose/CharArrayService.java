package com.rcp.expose;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @auther Stiles-JKY
 * @date 2020/9/9-20:43
 */
public interface CharArrayService extends Remote {

    int findStartIndex(String originalTxt, String pat) throws RemoteException;

}
