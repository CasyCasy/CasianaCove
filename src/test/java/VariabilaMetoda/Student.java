package VariabilaMetoda;

import org.testng.annotations.Test;

public class Student {

    // clasa = sablon care defineste proprietatile si comportmentul unei entitati specifice
    // intr-un fisier java putem avea mai multe clase diferentiate pe baza numelui, ( Ex. Student/ Elev) - nu este un practice bun sa ai mai multe clase intr-un fiier-
    // intr-o clasa putem defini proprietatile si actiunile entitatii
    // variabila = proprietatea unei clase
    // variabilele pot fi globale si locale
    //Variabilele globale sunt vizibile peste tot in proiect
    //Variabilele locale sunt vizibile doar in locul in care l-ai declarat
    // ca sa definim o Variabile Globala : Access Control Tip Variabile Nume Variabile
    //netoda = actiunea unei clase
    //exista doua tipuri de metode void + return

    public String Nume ;
    public String Prenume;

    public Integer Varsta;

    public String Adresa;

    public Double Inaltime;
    public Float Greutate;

    public Character Sex;

    public Boolean AreDiploma;
@Test
    public void prezentareStudent(){
    // vreau sa definesc actiunea studentului si dau valori variabilelor
    // tot ce este intre acolade reprezinta body-ul metodei, codul metodei

        Nume="Mihai";
        Prenume="Casiana";
        Varsta=37;
        Adresa="Cicoarei";
        Inaltime=1.60;
        Greutate=60f;
        Sex= 'F';
        AreDiploma=true;

        //afisam informatiile in consola, prezentam studentul
    //Facen un Sg Test care sa afiseze ce valori dorim din variabilele declarate
    //ca sa afisez valoarea trebuie sa stiu numele variabilei


        //System.out.println(Nume+" "+Prenume+" "+Varsta+" "+Adresa);
    //System.out.print(Inaltime);
    System.out.println("Numele Studentului este: "+Nume);
    System.out.println("Prenumele Studentului este: "+Prenume);
    System.out.println("Varsta Studentului este: "+Varsta);
    System.out.println("Adresa Studentului este: "+Adresa);
    System.out.println("Inaltimea Studentului este: "+Inaltime);
    System.out.println("Greutatea Studentului este: "+Greutate);
    System.out.println("Sexul Studentului este: "+Sex);
    System.out.println("Are Studentul diploma? "+AreDiploma);

    calculMedie();

    System.out.println(getSalariu());


    }

    public void calculMedie (){
    Integer nota1=7; // aceasta este o variabila privata
    Integer nota2=9;
    Integer nota3=10;
    Integer medie= (nota1+nota2+nota3)/3;

    System.out.println("Media Studentului este: "+ medie);


    }

    //metoda return

    public Integer getSalariu (){
    Integer salariu = 50000;
    return salariu;

}
}
