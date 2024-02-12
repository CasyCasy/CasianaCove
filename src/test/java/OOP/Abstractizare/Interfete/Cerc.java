package OOP.Abstractizare.Interfete;

public class Cerc {


    private int raza;
    public void calculeazaAria()
    {
        System.out.println("Aria cercurlui este egala cu " + Math.PI*Math.pow(raza, 2));

    }

    public int getRaza() {
        return raza;
    }

    public void setRaza(int raza) {
        this.raza = raza;
    }
}
