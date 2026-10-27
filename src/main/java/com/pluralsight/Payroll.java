package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;

public class Payroll {
    public static void main(String[] args) {
        String fileName = "employees.csv";

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            String line;


        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }
    }
}
