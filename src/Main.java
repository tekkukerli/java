import java.util.Scanner; //to read user input
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        LyyraCard cardPekka = new LyyraCard(20);
        LyyraCard cardBrian = new LyyraCard(30);

        cardPekka.payGourmet();
        System.out.println("Pekka: " + cardPekka);

        cardBrian.payEconomical();
        System.out.println("Brian: " + cardBrian);

        cardPekka.loadMoney(20);
        System.out.println("Pekka: " + cardPekka);

        cardBrian.payGourmet();
        System.out.println("Brian: " + cardBrian);

        cardPekka.payEconomical();
        cardPekka.payEconomical();
        System.out.println("Pekka: " + cardPekka);

        cardBrian.loadMoney(50);
        System.out.println("Brian: " + cardBrian);

        }



}

