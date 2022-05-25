package com.kodilla.testing;
import com.kodilla.testing.user.SimpleUser;

import java.util.Scanner;

public class TestingMain {
    public static void main(String[] args) {

        String name;
        String city;
        int wiek;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj swoje imię...");
        name = keyboard.nextLine();

        System.out.println("Podaj swój wiek...");
        wiek = keyboard.nextInt();
        if(wiek > 18){
            System.out.println("Ok,jedziemy dalej.");
            keyboard.nextLine();

            System.out.println("gdzie mieszkasz?...");
            city = keyboard.nextLine();

            System.out.println(city + "," + " to fajne miejsce.");

        }
        else{
            System.out.println("jesteś za młody na takie zabawy, sorry");
        }

    }
}
