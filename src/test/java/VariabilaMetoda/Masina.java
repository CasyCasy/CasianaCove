package VariabilaMetoda;

import org.testng.annotations.Test;

import java.util.Scanner;

public class Masina {

    public String marca;
    public String model;
    public Integer anulFabricatiei;

    @Test

    public void metodaTest(){

       dateMasina("Audi","Q3",2023);
       dateMasina("BMW","X5",2022 );

       calculmedie(5.0,10.0);
       calculmedie(4.0,7.0);

    }

    public void dateMasina(String param1, String param2, Integer param3){
    // atribui parametrii generici de la metoda -variabilelor pe care vreau sa le folosesc
        marca=param1;
        model=param2;
        anulFabricatiei=param3;

        System.out.println("Marca masinii este  "+ marca);
        System.out.println("Modelul masinii este  "+ model);
        System.out.println("Anul fabricatiei este  "+ anulFabricatiei);

    }
    //calculam media la 2 numere

    public void calculmedie(Double nota1,Double nota2){
        Double rezultat=(nota1+nota2)/2;
        System.out.println("Media celor 2 note este  "+ rezultat);
    }

    public void citireNote (){

        Scanner scanner = new Scanner(System.in);

        int nota = scanner.nextInt();
        while (nota < 0 || nota > 10);

        {
            System.out.println(" Nota" + " Nota trebuie sa fie intre 1 si 10. Te rog introdu o valoare rapisa");

            nota = scanner.nextInt();

            System.out.println("Nota " + nota + " nota este intre 1 si 10");
        }


    }
}


