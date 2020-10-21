import java.util.Scanner;

import static java.lang.System.out;

public class Methodes {
    public static void main(String[] args) {

        HelloWorld();
        groet();
        groet("Petra");
    }


    static void HelloWorld() {

        out.println("Hello World!");
    }

    static void groet() {
        out.println("Hallo, User!");

    }

    static void groet(String gebruiker) {
        out.println(gebruiker);

    }


    static float berekenEindBedrag(float beginBedrag, float maandRente) {
        // inleg is variabel
        System.out.print("Voer het inlegbedrag in:");
        Scanner sc1 = new Scanner(System.in);
        double bedrag =  sc1.nextDouble();

        //double rente is variabel gebruik een komma;
        System.out.print("Wat is de rente:");
        Scanner sc3 = new Scanner(System.in);
        double rente =  sc3.nextDouble();

// looptijd is variabel
        System.out.print("Voer looptijd in:");
        Scanner sc2 = new Scanner(System.in);
        double looptijd = sc2.nextDouble();


        double uitkomst =  bedrag;
        double rentebedrag;


        for (int i = 1; i <= looptijd ; i++) {

            rentebedrag =  (uitkomst/100 * rente);
            uitkomst  =  (uitkomst + rentebedrag);
            String afronden = String.format("%.2f", uitkomst);

            System.out.println("Jaar " +  i + ": € " +  afronden );

        }
        return beginBedrag;
    }

    }



