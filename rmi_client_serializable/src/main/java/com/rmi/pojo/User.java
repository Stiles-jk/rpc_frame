package com.rmi.pojo;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

/**
 * @auther Stiles-JKY
 * @date 2020/9/9-21:44
 */
public class User implements Serializable {
    private static final long serialVersionUID = -6849794470754667710L;

    public String name = "jky";
    public int age = 23;
    public Date birthday = Calendar.getInstance().getTime();
    public double tall = 1.70;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", tall=" + tall +
                '}';
    }
}
