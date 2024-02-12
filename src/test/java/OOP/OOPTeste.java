package OOP;

import org.testng.annotations.Test;

public class OOPTeste {

    @Test

    public void metosaTest(){

          Student Cristi =  new Student("Pop", "Cristi", 25,"FEEA",2010,true);
//        Cristi.infoStudent();
//        Cristi.mananca();
        Cristi.infoPersoana();




        Angajat Mihai = new Angajat("Popa","Misu",30,"Endava",15,35);
        Mihai.infoAngajat();

        Mihai.marire();
        Mihai.marire(30);
        Mihai.marire("Patron");




//        Mihai.promovare();
//
//        Mihai.mananca();


    }
}
