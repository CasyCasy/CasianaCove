package OOP.Abstractizare.Interfete;

public interface FormeGeometrice {


   public static final  String culoare = "verde"; // permite si constante.. nu si field-uri sau proprietati care nu sunt initializate
    //toate metodele declarate sunt bydefault sunt abstracte. Vor trebui suprascrise

     void calculeazaAria ();

     void deseneaza ();
}
