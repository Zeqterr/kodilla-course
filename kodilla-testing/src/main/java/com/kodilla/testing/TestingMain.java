package com.kodilla.testing;

import com.kodilla.testing.calculator.SimpleCalc;
import com.kodilla.testing.collection.OddNumbersExterminator;
import com.kodilla.testing.user.SimpleUser;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestingMain {
    public static void main(String[] args) {
        System.out.println("Moduł 6. Wprowadzenie do testowania oprogramowania");
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();
        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        //zd 2
        SimpleCalc simpleCalc = new SimpleCalc();
        int addResult = simpleCalc.add(5,3);
        int subResult = simpleCalc.sub(5,3);
        System.out.println(addResult);
        if (addResult == 8 && subResult == 2){
            System.out.println("Calc test OK");
        }else{
            System.out.println("Error!");
        }
        //zd3
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();











    }
}