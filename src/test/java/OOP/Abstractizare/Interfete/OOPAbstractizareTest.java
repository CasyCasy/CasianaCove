package OOP.Abstractizare.Interfete;

import org.testng.annotations.Test;

public class OOPAbstractizareTest {

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
}
