package ObiectConstructor;

public class Avion {

    //Contructorul = Are ca rol sa initializeze variabilele unei clase
    //Recunoastem un constructor dupa numele clasei
    //Intr-o clasa putem avea n constructori care se diferentiaza dupa numarul sau tipul de parametri
    // Exista 2 tipuri de contructor: Cu parametri   sau Fara parametri
    //Intr-o clasa avem intotdeauna un constructor degaul ( fara parametri)
    //Constructorul trebuie sa fie public
    //Obiect = Instanta unei clase Totul poate fi transpus intr-un cod pt ca contine obiecte
    //Intr-o clasa putem face mai multe obiecte
    //Ca sa initializam un obiect ne folosim de cuvant new
    //Cand se initializeaza un obiect se apeleaza Constructorul Clasei

    //Constructor cu parametri care sa contina toti parametrii aceleui Obiect
    //this punanad in fata ponteaza catre variabila...

    public String tip;
    public String marca;
    public String model;
    public Integer capacitatePasageri;
    public String combustibil;
    public Integer numarBagaje;


    public Avion(String tip, String marca, String model, Integer capacitatePasageri, String combustibil, Integer numarBagaje) {
        this.tip = tip;
        this.marca = marca;
        this.model = model;
        this.capacitatePasageri = capacitatePasageri;
        this.combustibil = combustibil;
        this.numarBagaje = numarBagaje;
    }

    public Avion(String tip, String marca, String model, Integer capacitatePasageri, String combustibil) {
        this.tip = tip;
        this.marca = marca;
        this.model = model;
        this.capacitatePasageri = capacitatePasageri;
        this.combustibil = combustibil;

    }

    public void prezentareAvion (){

        System.out.println("Tipul avionului este : " + tip);
        System.out.println("Marca avionului este : " + marca);
        System.out.println("Modelul avionului este : " + model);
        System.out.println("Capacitatea avionului este : " + capacitatePasageri);
        System.out.println("Tipul de combustibil al avionului este : " + combustibil);
        if (numarBagaje !=null)
        {
        System.out.println("Numarul de bagaje al avionului este : " + numarBagaje);}

        else {

            System.out.println("Avionul nu are bagaje");
        }

//test


    }
}
