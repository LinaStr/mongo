//package org.example;
//
//import com.mongodb.client.*;
//import com.mongodb.client.model.Filters;
//import com.mongodb.client.model.Updates;
//import org.bson.Document;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//
//public class App
//{
//    public static void main( String[] args )
//    {
//
//        System.out.println( "Hello World!" );
//
//        MongoClient mongoClient = MongoClients.create(
//                "mongodb+srv://test:test@cluster0-bixle.mongodb.net/test?retryWrites=true&w=majority");
//        MongoDatabase database = mongoClient.getDatabase("test");
//
//        MongoCollection<Document> collection =
//                database.getCollection("zmones");
////insert
////        Document asmuo = new Document("vardas", "andrius")
////                .append("pavarde", "kemeris");
////        collection.insertOne(asmuo);
//
//        //update
////        collection.updateOne(Filters.eq("vardas", "andrius"), Updates.set("pavarde", "k"));
//
////        //delete
////        collection.deleteOne(Filters.eq("vardas", "andrius"));
//
////        find/select
//        Document result = collection.find(Filters.eq("vardas", "andrius")).first();
//        System.out.println(result.toJson());
//
//
////
////         Document automobilis1 = new Document()
////                 .append("marke", "tesla")
////                 .append("modelis", "s")
////                 .append("rida", 101234);
////         Document automobili2 = new Document()
////                 .append("marke", "tesla")
////                 .append("modelis", "s")
////                 .append("rida", 101234);
////         Document automobilis3 = new Document()
////                 .append("marke", "bmw")
////                 .append("modelis", "nx")
////                 .append("rida", 101234);
////
//        List<Document> documents = new ArrayList<Document>();
////
////        documents.add(automobilis1);
////        documents.add(automobili2);
////        documents.add(automobilis3);
////
//         MongoCollection<Document> automobiliuKolekcija = database.getCollection("automobiliai");
////
////         automobiliuKolekcija.insertMany(documents);
//
//        Iterator automobiliai = automobiliuKolekcija
//                .find(Filters.and(Filters.eq("marke", "tesla"), Filters.gt("rida", 300)))
//                .iterator();
//
//        while (automobiliai.hasNext()){
//            System.out.println(automobiliai.next());
//        }
//
//
//        mongoClient.close();
//
//    }
//}
