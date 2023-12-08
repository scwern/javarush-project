package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.Console;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader (new InputStreamReader(System.in));
        String reader = bufferedReader.readLine();

        int minByte = 255;
        try (FileInputStream fileInputStream = new FileInputStream(reader)) {
            while (fileInputStream.available() > 0) {
                int currByte = fileInputStream.read();
                if (currByte < minByte) minByte = currByte;
            }
        }
        System.out.println(minByte);
    }

    }
