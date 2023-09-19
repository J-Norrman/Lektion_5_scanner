package com.Joel.scanner;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //git push -u origin <branch name>
        //Objects
        Scanner sc = new Scanner(System.in);
        student bob = new student();

        //Game
        do {

            System.out.println("Input bob's age");
            int result = sc.nextInt();

            bob.age = result;

            System.out.println("You picked: " + result);
            System.out.println("bob's age is: " + bob.age);

        } while (true);

    }
}
