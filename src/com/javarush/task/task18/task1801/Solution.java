package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.Console;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String ins = reader.readLine();
        int max = 0;


            try (FileInputStream fileInputStream = new FileInputStream(ins)) {
                while (fileInputStream.available() > 0) {
                    int currByte = fileInputStream.read();
                    if (currByte > max) max = currByte;
                }
            }
            System.out.println(max);
        }
    }
