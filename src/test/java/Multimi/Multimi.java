package Multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Multimi {
    //multimi: array, list, map

    @Test

    public void metodaTest(){

       // colegiCurs();
        //colegiCurs();
       // categorieObiecte();
        tariOrase();

    }

        //exemplu array

        public void colegiCurs() {
            String[] colegi = new String [6];
            colegi[0]="Casiana";
            colegi[1]="Mihai";
            colegi[2]="Cristina";
            colegi[3]="Bogdan";
            colegi[4]="Tatiana";
            colegi[5]="Alex";

            for (int index=0;index< colegi.length; index ++){
                System.out.println("Numele Colegului Este: " + colegi[index]);
            }
        }
        //exemplu lista
    public void colegiCursLista(){
        List<String> colegi = new ArrayList<>();
        colegi.add("Casiana");
        colegi.add("Mihai");
        colegi.add("Cristina");
        colegi.add("Bogdan");
        colegi.add("Alex");

        int index =0;
        while (index<colegi.size()){
            System.out.println("Numele colegului este : " + colegi.get(index)); index ++;
        }
    }

    //exemplu map
    // cheie = valoare

    public void categorieObiecte (){
        HashMap<String, String> obiecte = new HashMap<>();
        obiecte.put("obiecte", " laptop");
        obiecte.put("fruct", " mar");
        obiecte.put("floare", " trandafir");

        for(String key: obiecte.keySet()){
            System.out.println("Cheia este: " + key);
            System.out.println("Valoarea este : "+ obiecte.get(key));



    }

    }

    public void tariOrase (){

        HashMap<String, List <String>> clasificare = new HashMap<>();

        List <String> oraseRomania = new ArrayList<>();
        oraseRomania.add("Cluj");
        oraseRomania.add("Oradea");
        oraseRomania.add("Iasi");

        List<String> oraseItalia = new ArrayList<>();
        oraseItalia.add("Roma");
        oraseItalia.add("Milano");
        oraseItalia.add("Venetia");

        List<String> oraseSpania = new ArrayList<>();
        oraseSpania.add("Barcelona");
        oraseSpania.add("Madrin");
        oraseSpania.add("Zaragoza");

        clasificare.put("Romania",oraseRomania);
        clasificare.put("Italia",oraseItalia);
        clasificare.put("Spania",oraseSpania);

        for(String key: clasificare.keySet()){
            System.out.println("Tara este: " + key);
            System.out.println("Orasele sunt : "+ clasificare.get(key));


    }
}

}
