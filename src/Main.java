import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        //Menüü koostamine
        ArrayList<String> menüü = new ArrayList<String>();
        menüü.add("1-Kanaburger (kanaliha, valge sai) 15€");
        menüü.add("2-Juustuburger (loomaliha, valge sai) 18€");
        menüü.add("3-New York burger (sealiha, teraleib) 20€");

        //Kanaburgeri lisandite koostamine
        ArrayList<String> kanaLisandid = new ArrayList<String>();
        kanaLisandid.add("juust - 0.5 €");
        kanaLisandid.add("salat - 0.5 €");
        kanaLisandid.add("tomat - 0.5 €");
        kanaLisandid.add("majonees - 0.5 €");

        //Juustuburgeri lisandite koostamine
        ArrayList<String> juustuLisandid = new ArrayList<String>();
        juustuLisandid.add("peekon - 0.5 €");
        juustuLisandid.add("kurk - 0.5 €");
        juustuLisandid.add("sibul - 0.5 €");
        juustuLisandid.add("peekonikaste - 0.5 €");

        //New York burgeri lisandite koostamine
        ArrayList<String> newYorkLisandid = new ArrayList<String>();
        newYorkLisandid.add("ananass - 0.5 €");
        newYorkLisandid.add("tomat - 0.5 €");
        newYorkLisandid.add("kurk - 0.5 €");
        newYorkLisandid.add("sibul - 0.5 €");

        Scanner telliVeel = new Scanner(System.in);
        double hindKokku = 0;

        while(true) {

            Scanner burgeriValik = new Scanner(System.in);

            //Menüü printimine
            System.out.println("\nMenüüvalik: ");
            for (String menuItem : menüü) {
                System.out.println(menuItem);
            }
            System.out.println("");
            System.out.println("Vali burgeri number:  (0 lõpetab valiku)");

            int valitudBurger = burgeriValik.nextInt();

            //Kui valis kanaburgeri
            if(valitudBurger == 1) {
                System.out.println("\nValisid kanaburgeri.");

                Burger kanaBurx = new Burger("kanaburger", "kanaliha", "valge sai", 15);

                //Kanaburgeri lisandid
                System.out.println("Kanaburgeri lisandid: ");
                for (String kanaLisand : kanaLisandid) {
                    System.out.println(kanaLisand);
                }
                System.out.println("");
                kanaBurx.lisaLisandid();

                //Hinnastamine
                hindKokku += kanaBurx.koostaBurger();
                System.out.println("\nKanaburgeri hind: " + kanaBurx.koostaBurger());

                //Tellimuse jätkamine
                System.out.println("\nKas soovid veel burgereid? (jah/ei)");
                String veelBurgereid = telliVeel.nextLine();
                if(veelBurgereid.equals("ei")) {
                    break;
                }

            }

            //Kui valis juustuburgeri
            else if(valitudBurger== 2) {
                System.out.println("\nValisid juustuburgeri.");

                Burger juustuBurx = new Burger("juustuburger", "loomaliha", "valge sai", 18);

                //Juustuburgeri lisandid
                System.out.println("Juustuburgeri lisandid: ");
                for (String juustuLisand : juustuLisandid) {
                    System.out.println(juustuLisand);
                }
                System.out.println("");
                juustuBurx.lisaLisandid();

                //Hinnastamine
                hindKokku += juustuBurx.koostaBurger();
                System.out.println("\nJuustuburgeri hind: " + juustuBurx.koostaBurger());

                //Tellimuse jätkamine
                System.out.println("\nKas soovid veel burgereid? (jah/ei)");
                String veelBurgereid = telliVeel.nextLine();
                if(veelBurgereid.equals("ei")) {
                    break;
                }
            }

            //Kui valis New York burgeri
            else if(valitudBurger== 3) {
                System.out.println("\nValisid New York burgeri.");

                Burger newYorkBurx = new Burger("New York burger", "sealiha", 20); //loodud teraleivaga

                //New York burgeri lisandid
                System.out.println("New York burgeri lisandid: ");
                for (String newYorkLisand : newYorkLisandid) {
                    System.out.println(newYorkLisand);
                }
                System.out.println("");
                newYorkBurx.lisaLisandid();

                //Hinnastamine
                hindKokku += newYorkBurx.koostaBurger();
                System.out.println("\nNew York burgeri hind: " + newYorkBurx.koostaBurger());

                //Tellimuse jätkamine
                System.out.println("\nKas soovid veel burgereid? (jah/ei)");
                String veelBurgereid = telliVeel.nextLine();
                if(veelBurgereid.equals("ei")) {
                    break;
                }
            }
            else break;
        }


        System.out.println("\nTeie arve on " + hindKokku + " €");
    }

}