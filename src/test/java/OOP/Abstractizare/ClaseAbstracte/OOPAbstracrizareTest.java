package OOP.Abstractizare.ClaseAbstracte;

import org.testng.annotations.Test;

public class OOPAbstracrizareTest {

    @Test

    public void metodaTest()
    {
        //numele+ forma = instantiez cu new
        //acest este un Obiect, o Instanta
        // incapsularea inseamna sa declari o clasa, faci fildurile private si pe apelezi doar cu get/setere
        Cerc formaCerc = new Cerc();


        formaCerc.setRaza(5);
        formaCerc.calculeazaAria();



        Pastrat formaPatrat = new Pastrat();
        formaPatrat.setLatura(7);
        formaPatrat.calculeazaAria();
    }




////        Student Cristi =  new Student("Pop", "Cristi", 25,"FEEA",2010,true);
////        Cristi.infoStudent();
////        Cristi.mananca();
//
//
//        Angajat Mihai = new Angajat("Popa","Misu",30,"Endava",15,35);
//        Mihai.infoAngajat();
//
//        Mihai.marire();
//        Mihai.marire(30);
//        Mihai.marire("Patron");
//
//
////        Mihai.promovare();
////
////        Mihai.mananca();



}
