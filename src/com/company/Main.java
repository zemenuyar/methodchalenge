package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        input();
    }
    public static void input(){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a bound: ");
        int num = in.nextInt();
        getRandom(num);
    }
    public static int getRandom(int num) {
        Random ran = new Random();
        int index=0;
        for (int counter=1; counter<=5; counter++){
            index = ran.nextInt();
            System.out.println(index);
        }
        return  index;
    }
}
