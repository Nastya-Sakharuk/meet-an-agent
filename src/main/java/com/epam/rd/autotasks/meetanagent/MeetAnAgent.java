package com.epam.rd.autotasks.meetanagent;

import java.util.Scanner;

public class MeetAnAgent {
    final static int PASSWORD = 579; //You can change pass, but don't change the type

    public static void main(String[] args) {
        //put you code here
        Scanner scan = new Scanner(System.in);
        int numberPassword = scan.nextInt();

        if (numberPassword == PASSWORD) {
            System.out.println("Hello, Agent");
        } else {
            System.out.println("Access denied");
        }
    }
}
