package OOP;

public class Angajat extends  Persoana implements AngajatInt{
     // public - codul se poate accesa de oriunde si din orice clasa
    // private - codul se poate accesa doar din clasa in care s-a scris codul
    //protected - codul se poate accesa doar din pachetul in care s-a scris codul dar si de catre subclase ( OPMostenire -ClasaParinte si ClasaCopil)
    //default- codul se poate accesa doar din pachetul in care s-a scris codul. Intra pe default daca nu se specifica un alt modificator de acces


    private String firma;
    private   Integer experienta;
    private   Integer zileConcediu;

    public Angajat(String nume, String prenume, Integer varsta, String firma, Integer experienta, Integer zileConcediu) {
        super(nume, prenume, varsta);
        this.firma= firma;
        this.experienta= experienta;
        this.zileConcediu= zileConcediu;
    }
// suprascriem metoda din parinte  ( polimorfismul dinamic)




    public void mananca (){

        System.out.println("Angajatul  mananca cand are pauza de masa");
    }

    //pilimorfismul static

    public void marire (){

        System.out.println("Nu avem buger de marire");
    }

    public void marire (Integer procent){

        System.out.println("Angajatul a primit o marire "+ 10 + "%");

    }

    public void marire (String grad){
        System.out.println("Angajatul a primit gradul" + grad);


    }
    public void infoAngajat (){

        infoPersoana();
        System.out.println("Firma la care lucreaza angajatul este" + firma);
        System.out.println("Angajatul are " + experienta + "ani");
        System.out.println("Angajatul are" + zileConcediu + "");
    }

    public void promovare (){

        System.out.println("Angajatul cu numele " + getNume() + " a fost promovat");
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public Integer getExperienta() {
        return experienta;
    }

    public void setExperienta(Integer experienta) {
        this.experienta = experienta;
    }

    public Integer getZileConcediu() {
        return zileConcediu;
    }

    public void setZileConcediu(Integer zileConcediu) {
        this.zileConcediu = zileConcediu;
    }

    @Override
    public void mergeLaMunca() {

        System.out.println("Angajatul merge la munca");

    }

    @Override
    public void primesteSalariu() {
        System.out.println("Angajatul primeste salariul");

    }

    @Override
    public void mergeInPauza() {
        System.out.println("Anhajatul primeste pauza");

    }

    @Override
    public void prezintaDemisie() {

        System.out.println("Angajatul nu pleaca din firma");

    }
}
