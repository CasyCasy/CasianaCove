package VariabilaMetoda;

import com.google.errorprone.annotations.Var;
import org.testng.annotations.Test;

import javax.sound.midi.Soundbank;

public class StructuriAlternative {

    //structuri alternative if -then-else; switch-case

    @Test

    public void metodaTest(){
//        metodaVerificareNr(7);
//        metodaVerificareNr(3);
//        metodaVerificareNr(5);

        metodaVerificareParpozitiv(0);

        metodaVerificareParpozitiv(4);
        metodaVerificareParpozitiv(3);
        metodaVerificareParpozitiv(-1);
        metodaVerificareParpozitiv(-8);
        ZileSaptamana(3);




    }

    //verificam daca un numar este mai mare de 5

    public void metodaVerificareNr(int Valoare){

        if (Valoare>5){
            System.out.println("numarul  " + Valoare + " este mai mare decat 5 ");
        }
        else if (Valoare <5 ){
            System.out.println("numarul  " + Valoare + " este mai mic decat 5");
        }
        else {
            System.out.println("numarul  " + Valoare + " numarul este egal cu 5");
        }


    }

    //verificam daca Nr este Par pozitiv sau Par Negativ

    public void metodaVerificareParpozitiv(int Valoare) {
        if (Valoare > 0) {
            if (Valoare % 2 == 0) {

                System.out.println("Numarul " + Valoare + " este par pozitiv");
            } else {
                System.out.println("Numarul " + Valoare + " este impar pozitiv");
            }
        } else if (Valoare < 0) {
            if (Valoare % 2 == 0) {
                System.out.println("Numarul " + Valoare + " este par negativ");

            } else {
                System.out.println("Numarul " + Valoare + " este impar negativ");
            }
        } else if (Valoare == 0) {
            System.out.println("Numarul " + Valoare + " este 0");
        }


    }

    // exemplu switch case

    public void ZileSaptamana(Integer zi){
        switch (zi)
        {

            case 1:
                System.out.println("Azi este Luni");
                break;
            case 2:
                System.out.println("Azi este Marti");
                break;
            case 3:
                System.out.println("Azi este Miercuri");
                break;
            case 4:
                System.out.println("Azi este Joi");
                break;
            default:
                System.out.println("Nu mai sunt zile");


        }


    }
}










