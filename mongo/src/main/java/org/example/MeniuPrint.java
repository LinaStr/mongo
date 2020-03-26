package org.example;
//Sukurti aplikacija, kuri leistų užregistruoti vartotoją (vardas, pavardė, amžius, email,
//        adresas, slaptažodis); Prisijungus vartotojas turi galimybę pasikeisti adresą ir peržiūrėti
//        savo esamą informaciją;

import java.util.Scanner;

public class MeniuPrint {
    private static Scanner sc = new Scanner(System.in);
    private static MongoDbManager db = new MongoDbManager();
    private static String currentUserName;


    public static void runApp(){
        System.out.println("1. registruotis\n 2. prisijungti\n 3. ziureti savo info\n 4. keisti adresa");
        String choice = sc.nextLine();
        switch (choice){
            case "1": register();
                break;
            case "2": signIn();
                break;
            case "3": viewInfo();
                break;
            case "4": changeAddress();
                break;
            default:
                System.out.println("skaiciu gal nemoki?");
        }


    }

    private static void register(){
        System.out.println("vardas?");
        String name = sc.nextLine();
        System.out.println("amzius?");
        int age = sc.nextInt();
        System.out.println("adresas?");
        String address = sc.next();
        System.out.println("slaptazodis?");
        String password = sc.next();

        db.dbRegister(name, age, address, password);

    }

    static void signIn(){
        System.out.println("vardas?");
        String signName = sc.next();
        System.out.println("pass?");
        String signPass = sc.next();
        if (db.dbSignIn(signName, signPass)){
            System.out.println("prisijugti pavyko");
            String currentUserName = signName;
        }else{
            System.out.println("prisijungt nemapvyko");
        }

    }

    static void viewInfo(){
        if (currentUserName != null){
            db.dbUserInfo(currentUserName);
        }else{
            System.out.println("tai kad neprisijunges tu");
        }

    }

    static void changeAddress(){
        System.out.println("koks naujas adresas?");
        String newAdress = sc.next();
        db.dbSetAdress(currentUserName, newAdress);

    }
}
