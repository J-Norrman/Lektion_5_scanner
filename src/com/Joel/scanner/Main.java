package com.Joel.scanner;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isPlaying = true;


        do {

          int result = scannerNum();
            if (result > 1000){
                break;
            }
          for (int i = 0; i < result; i++) {
              System.out.println(i);
              System.out.println("looping..");
          }
        } while (isPlaying);

    }
    public static int scannerNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert number");
        sc.hasNextInt();

        return sc.nextInt();
    }
    public static String scannerText(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert sentence");
        String input = sc.nextLine();
        return input;
    }
}
