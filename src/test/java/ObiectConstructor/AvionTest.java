package ObiectConstructor;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AvionTest {

    @Test

    public void metodaTest (){

        Avion avion1 = new Avion("Pasageri","Boeing","B-127",250 ,"ECO");

        avion1.prezentareAvion();

        Avion avion2 = new Avion("Pasageri","Boeing","B52",150,"Kerosen");
        avion2.prezentareAvion();

        Avion avion3 = new Avion("Pasageri","Boeing","A55",55,"BIO", 150);
        avion3.prezentareAvion();
    };
}
