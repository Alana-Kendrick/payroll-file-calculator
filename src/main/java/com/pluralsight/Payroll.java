package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;

public class Payroll {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("employees.csv"));
            String line;


        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }
    }
}
