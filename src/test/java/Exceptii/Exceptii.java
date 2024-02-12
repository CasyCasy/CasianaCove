package Exceptii;

import java.lang.reflect.Array;

public class Exceptii {

    // Exceptiile reprezinta situatiile care apar in timpul executiei unui program care determina oprirea acestuia
    //ofera un mecanism eficient de identificare  si rezolvare a erorilor
    //sunt modelate sub forma de clase : clasa error, clasa exception, runtime exception, clase personalizate;
    // exceptiile sunt gestionate folosind cuvinte predefinite in Java like try, catch and finaly;
    //sunt 2 tipuri mari de exceptii : checked and unchecked;
    // erorile checked : sunt exceptii de compilare ( nu se poate buildui sau rula proiectul)
    //Ex de erori : checked SQL exception, IO exception, class not found exception;
    // erorile unchecked : sunt exceptii de runtime care sunt ignorate  in timpul compilarii dar sunt aruncate in timpul executiei programului;
    //exemple de erori unchecked : Nullpoint Exception , Array IndexOutoffBound, Arithmetic Exception
    //throw : este un cuvant cheie care arunca exceptia in mod explicit de la o metoda la un bloc de cod;
    //throws este un cuv cheie care se foloseste odata cu metoda care poate arunca un tip sau mai multe exceptii;

    public static void main (String [] args)  throws ExceptionCustom{

//        try {
//
//            System.out.println(12/0);
//        } catch (ArithmeticException e){
//            System.out.println("Error arithmetic exception thrown" + e.getMessage());
//    }
// pune pe pauza programul respectiv pt cateva secunde
        try {

            int [] numbers = new int [10];
            numbers [11]=5;


            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();}
        catch (ArrayIndexOutOfBoundsException e) {

            throw new ExceptionCustom("Eroare personalizata");

        }

        finally {
            System.out.println("Aceasta linie se execua indiferent de...");

        }
    }
}
