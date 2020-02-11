package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        String lastName = "";
        int age = 0;
        String company = "";
        String stop = "yes";//да
        ArrayList<String> arrayList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (stop.equals("yes")) {

            boolean flagName = true;
            while (flagName) {
                try {
                    System.out.println("---------------------------------");
                    System.out.println("Please enter last name : ");//Пожалуйста введите вашу фамилию
                    lastName = scanner.next();
                    flagName = false;
                } catch (Exception e) {
                    e.printStackTrace();
                    flagName = true;
                }
            }

            boolean flag = true;
            while (flag) {
                try {
                    System.out.println("Please enter  age : "); //Пожалуйста введите возраст
                    age = scanner.nextInt();
                    System.out.println("Please enter  name of the company where you work : ");//Пожалуйста введите имя компании где вы работаете
                    company = scanner.nextLine();
                    flag = false;
                } catch (Exception e) {
                    System.out.println("Enter only numbers!");//введите только цифры
                    scanner.next();
                    flag = true;
                }
            }
            boolean flagCompany = true;
            while (flagCompany) {
                try {
                    company = scanner.next();
                    flagCompany = false;
                } catch (Exception e) {
                    e.printStackTrace();

                    flagCompany = true;
                }
            }

            boolean flagStop = true;
            while (flagStop) {
                System.out.println("would you like to register somebody else?");//А вы хотите зарегестрировать ког-то еще?
                stop = scanner.next();
                if (stop.equals("yes") || stop.equals("no") || stop.equals("Yes") || stop.equals("No")) {
                    flagStop = false;
                } else
                    System.out.println(" Please enter yes or no"); //Пожалуйста введите да или нет!

            }


            arrayList.add("Last name: " + lastName); // Фамилия
            arrayList.add("Age: " + age); // Возраст
            arrayList.add("Company: " + company); // Компания
            System.out.println("---------------------------------");


            System.out.println("---------------------------------");

            for (int i = 0; i < arrayList.size(); i++) {
                if (i % 3 == 0) {
                    System.out.println("---------------------------------");
                }
                System.out.println(arrayList.get(i));
            }


        }

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("would you like to check one?");
        String checkNames = scanner2.next();
        boolean flagCheck = true;
        while (flagCheck) {
            if (checkNames.equals("yes") || checkNames.equals("Yes")) {
                System.out.println("enter a name");
                String names = scanner2.next();
                boolean arrayCheck = arrayList.contains("Last name: " + names);
                if (arrayCheck == true) {
                    System.out.println(names + " - found ✅");


                } else if (arrayCheck == false) {
                    System.out.println(names + " - not found ❌");

                }
            }
            if (checkNames.equals("yes") || checkNames.equals("Yes")) {
                System.out.println("would you like to check one more?");

            }


            if (checkNames.equals("no") || checkNames.equals("No")) {
                System.out.println("good bye 👋");
                flagCheck = false;
            } else if (checkNames.equals("yes") || checkNames.equals("Yes")) {
                flagCheck = true;
            } else
                System.out.println("Please enter only yes or no");
            flagCheck = true;
            checkNames = scanner2.next();

        }
    }


}

