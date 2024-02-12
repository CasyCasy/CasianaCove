package OOP;

public class Persoana {

    //OOP - programare orientata obiect
    // 4 principii: Mostenire, Incapsulare, Polimorfism, Abstractizare
    //Mostenirea este conceptul prin care o clasa ( Copil) mosteneste o alta clasa ( Parinte)
    // In Java putem mosnteni o singura clasa
    //In momentul in care o clasa mosteneste o alta clasa, clasa Copil trebuie sa apeleze Contructorul din Parinte
    //In momentul in care se aplica mostenirea COpilul are vizibilitate asupra variabilelor/ metodelor din Parinte
    // Constructorul din Parinte in Copil se apeleaza cu super

    //Incapsulare = procesul prin care tinem departe anumite informatii ca ele sa nu poata fi modificate
    //facem variabilele/ metodele din public in private
    //private = acces control care restrictioneaza accesul doar in clasa respectiva
    //ca sa extragem / modificam o valoare a unei variabile private ne folosim de metode get / set

    //POLIMORFISMUL- procesul prin care definim mai multe implementari
    // DINAMIC(OVERRIGHT)  SI STATIC(OVERLOAD)
    //Polimorfismul dinamic = intr-o ierarhie de de clase obtinute prin mostenire , o metoda poate avea implementari diferite

    //polimorfismul static - posibilitatea prin care o metoda are mai multe diferentieri prin numarului de parametri

    //ABSTRACTIZARE = Reducerea unui element complex la un element mai simplu

    //Reducerea completa a implementarii metodelor , lasand doar numele functiilor, parametrilor si tipul returnat
    //Abstractizarea se poate obtine prin clase abstracte si/ sau interfete

    //clasele abstracte sunt utilizate pentru a declara caracteristici comune unor subclase
    //o clasa abtracta nu poate fi  instantiata
    // o clasa abstracta poate fi utilizata pt alte clase care extind clasa abstracta
    //clasa abtracta poate fi definita folosind modificatorul "abstract"
    // o clasa abtracta poate contine atribute si metode pe langa clasa abtracta
    //interfata ofera raspuns lipsei..
    //interfata creaza un protocol pe care clasele trebuie sa le implementeze. Nu declari doar filduri, ci si metode
    //interfata contine toate metodele abstracte ( e o clasa pur abstracta)

    private String nume;
    private String prenume;
    private Integer varsta;

    public Persoana(String nume, String prenume, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }
    public void infoPersoana ()
    {
        System.out.println("Numele este: "+ nume);
        System.out.println("Prenumele este: "+ prenume);
        System.out.println("Varsta este: "+ varsta);
    }

    //definim prima implemengtare pt o metoda: Polimorfism dinamic

    public void mananca (){

        System.out.println("Persoana mananca cand ii este foame");
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }
}
