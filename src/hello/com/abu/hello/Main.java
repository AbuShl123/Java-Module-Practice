package com.abu.hello;

import com.abu.text.Padder;

public class Main {

    public static void main(String[] args) {
        String obj = args.length > 0 ? " " + args[0] : "";

        int max = 150;

        System.out.println(Padder.leftPad("Hello," + obj + " world!", max));
    }
}
