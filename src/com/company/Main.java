package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> in = new ArrayList<String>();
        while (scanner.hasNextLine()){
            String read = scanner.nextLine();
            if(read == null || read.isEmpty()){
                break;
            }
            String s[]=new String[2];
            s=read.split(" ");
            in.add(s[0]);
            in.add(s[1]);
            /////
        }
        for (int i=0;i<in.size();i+=2) {
            System.out.printf("%-15s%03d%n",in.get(i) ,Integer.parseInt(in.get(i+1)));
        }
    }
}
