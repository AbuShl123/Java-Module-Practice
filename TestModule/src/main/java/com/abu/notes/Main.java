package com.abu.notes;

import java.sql.Timestamp;

public class Main {
    public static void main(String[] args) {
        String str = "foo";

        System.out.println(str.getClass());
        System.out.println(str.getClass().getModule());
        System.out.println(str.getClass().getModule().getClass());

        System.out.println("---------------");

        var obj = new Timestamp(0);

        System.out.println(obj.getClass());
        System.out.println(obj.getClass().getModule());
        System.out.println(obj.getClass().getModule().getClass());

        Module module = obj.getClass().getModule(); // java.lang.Module

        System.out.println(module.getDescriptor().name());
    }
}