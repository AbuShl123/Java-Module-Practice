package com.abu.hello;

public class Main {

    static String leftPad(String obj, int max) {
        StringBuilder sb = new StringBuilder();
        int n = max - obj.length();

        sb
            .append(" ".repeat(Math.max(0, n)))
            .append(obj);

        return sb.toString();
    }

    public static void main(String[] args) {
        String obj = args.length > 0 ? " " + args[0] : "";

        int max = 150;

        System.out.println(leftPad("Hello," + obj + " world!", max));
    }
}
