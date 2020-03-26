package org.example;

import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import org.bson.Document;

import java.util.Iterator;

public class MongoDbManager {

        MongoClient mongoClient = MongoClients.create(
                "mongodb+srv://test:test@cluster0-bixle.mongodb.net/test?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("test");
        MongoCollection<Document> users =
                database.getCollection("users");




    public void dbRegister(String name, int age, String address, String password) {

                Document asmuo = new Document("vardas", name)
                .append("amzius", age)
                        .append("adresas", address)
                        .append("pass", password);
        users.insertOne(asmuo);
    }

    public boolean dbSignIn(String signName, String signPass) {
        Iterable<Document> result =  users.find(Filters.and(Filters.eq("vardas", signName), Filters.eq("pass", signPass)));
        if (result == null){
            return false;
        }else{
            return true;
        }
    }

    public void dbUserInfo(String currentUserName) {
        Document result = users.find(Filters.eq("vardas", currentUserName)).first();
        System.out.println(result.toJson());
    }

    public void dbSetAdress(String currentUserName, String newAdress) {
        users.updateOne(Filters.eq("vardas", currentUserName), Updates.set("adresas", newAdress));
    }
}
