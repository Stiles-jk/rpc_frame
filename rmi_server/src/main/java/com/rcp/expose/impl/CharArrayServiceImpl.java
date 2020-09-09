package com.rcp.expose.impl;

import com.rcp.expose.CharArrayService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @auther Stiles-JKY
 * @date 2020/9/9-20:47
 */
public class CharArrayServiceImpl extends UnicastRemoteObject implements CharArrayService {

    public CharArrayServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public int findStartIndex(String originalTxt, String pat) throws RemoteException {
        return search(originalTxt, pat, getNextArray(pat));
    }

    private int[] getNextArray(String pat) {
        int[] next = new int[pat.length()];
        next[0] = 0;
        for (int i = 1, j = 0; i < pat.length(); i++) {
            //如果不匹配，回到先前的状态；直到匹配或状态为初始状态(j==0)
            while (j > 0 && pat.charAt(i) != pat.charAt(j)) {
                j = next[j - 1];
            }
            //如果当前字符相同，即pat.charAt(i) == pat.charAt(j) 此时最大前后缀长度为j+1
            if (pat.charAt(i) == pat.charAt(j)) {
                j++;
            }
            next[i] = j;
        }
        return next;
    }

    private int search(String originalTxt, String pat, int[] next) {
        for (int i = 0, j = 0; i < originalTxt.length(); i++) {
            //如果不匹配，转态回转
            while (j > 0 && originalTxt.charAt(i) != pat.charAt(j)) {
                j = next[j - 1];
            }
            if (originalTxt.charAt(i) == pat.charAt(j)) {
                j++;
            }
            if (j == pat.length()) {
                return i - j + 1;
            }
        }
        return -1;
    }
}
