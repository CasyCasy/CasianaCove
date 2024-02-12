package OOP;



public class Student  extends Persoana implements StudentInt {
    private String facultate;
    private Integer an;
    private Boolean bursa;


    public Student(String nume, String prenume, Integer varsta, String facultate, Integer an, Boolean bursa) {
        super(nume, prenume, varsta);
        this.facultate = facultate;
        this.an = an;
        this.bursa = bursa;
    }

    public void infoStudent(){

        infoPersoana();
        System.out.println("Facultatea este: " + facultate);
        System.out.println("Anul terminarii studiilor este: " + an);
        System.out.println("Ia studentul bursa sau nu: " + bursa);
    }
    public void mananca(){

        System.out.println("mananca cand ii este foame");
        super.mananca();
    }

    public void absolvire(){

        System.out.println("Studentul cu numele "+ getNume() + "si Prenumele" + getPrenume()+ " a absolvit");
    }

    public String getFacultate() {
        return facultate;
    }

    public Integer getAn() {
        return an;
    }

    public Boolean getBursa() {
        return bursa;
    }


    public void setAn(Integer an) {
        this.an = an;
    }

    public void setBursa(Boolean bursa) {
        this.bursa = bursa;
    }

    @Override
    public void mergeLaCurs() {
        System.out.println("Studentul merge la curs");

    }

    @Override
    public void sustineExamene() {
        System.out.println("Studentul are sesiune");
    }

    @Override
    public void mergeLaCafea() {
        System.out.println("Studentul este silitor");

    }
}
