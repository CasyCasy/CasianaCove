package OOP;

public class AngajatStudent extends Persoana implements AngajatInt, StudentInt{

    private String firma;
    private   Integer experienta;
    private   Integer zileConcediu;

    private String facultate;
    private Integer an;
    private Boolean bursa;
    public AngajatStudent(String nume, String prenume, Integer varsta,
                          String firma, Integer experienta, Integer zileConcediu ,
                          String facultate, Integer an, Boolean bursa )
    {
        super(nume, prenume, varsta);
        this.facultate = facultate;
        this.an = an;
        this.bursa = bursa;
        this.firma= firma;
        this.experienta= experienta;
        this.zileConcediu= zileConcediu;
    }

    @Override
    public void mergeLaMunca() {

    }

    @Override
    public void primesteSalariu() {

    }

    @Override
    public void mergeInPauza() {

    }

    @Override
    public void prezintaDemisie() {

    }

    @Override
    public void mergeLaCurs() {

    }

    @Override
    public void sustineExamene() {

    }

    @Override
    public void mergeLaCafea() {

    }
}
