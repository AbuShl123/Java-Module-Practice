package com.abu.text;

public class Padder {

    public static String leftPad(String obj, int max) {
        StringBuilder sb = new StringBuilder();
        int n = max - obj.length();

        sb
                .append(" ".repeat(Math.max(0, n)))
                .append(obj);

        return sb.toString();
    }

}
