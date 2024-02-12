package OOP.Abstractizare.ClaseAbstracte;

public abstract class FormeGeometrice {
// intr-o clasa ai o structura cu : public class sau public abstract class, apoi declarari de variabile si ulterior declarari de metode

    public String culoare = "albastra";
    // albastru e o proprietate generala tratata ca field comun pt toate formele
    //o clasa abtracta te lasa sa declari si filduri
    public abstract void calculeazaAria ();

    public void deseneaza ()
    {
        System.out.println("Deseneaza forma");
    }


}
