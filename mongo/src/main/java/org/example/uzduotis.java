package org.example;
//Sukurti aplikacija, kuri leistų užregistruoti vartotoją (vardas, pavardė, amžius, email,
//        adresas, slaptažodis); Prisijungus vartotojas turi galimybę pasikeisti adresą ir peržiūrėti
//        savo esamą informaciją;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class uzduotis {
    public static void main(String[] args) {


        MeniuPrint.runApp();

    }
}
