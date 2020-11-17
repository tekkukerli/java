import java.util.ArrayList;
import java.util.Scanner;

public class Burger {

    private String nimetus;
    private String lihaTüüp;
    private String saiaTüüp;
    private double hind;
    ArrayList<String> lisandid = new ArrayList<String>();
    private double lisandiHind = 0.50;
    int lisandiloendur = 0;

    public Burger(String nimi, String liha, String sai, double hind) {
        this.nimetus = nimi;
        this.lihaTüüp = liha;
        this.saiaTüüp = sai;
        this.hind = hind;
    }

    public Burger(String nimi, String liha, double hind) {
        this.nimetus = nimi;
        this.lihaTüüp = liha;
        this.hind = hind;
        this.saiaTüüp = "teraleib";
    }

    public void lisaLisandid() {

        Scanner scanner = new Scanner(System.in);

        while(lisandiloendur < 4) {

            System.out.println("Sisesta lisandid (ühekaupa). Kui lisandit ei soovi, vajuta ENTER.");
            String lisand = scanner.nextLine();
            if(lisand.isEmpty()) {
                break;
            }
            else this.lisandid.add(lisand);
            lisandiloendur++;
        }
        System.out.println("Valitud lisandid: ");
        for(String lisand : this.lisandid) {
            System.out.print(lisand + " ");
        }
        System.out.println();

    }

    public double koostaBurger() {
        return this.hind + (lisandiloendur * lisandiHind);
    }

    public String getName() {
        return this.nimetus;
    }

    public String toString() {
        return this.nimetus + " - " + this.lihaTüüp + ", " + this.saiaTüüp + ". Hind: " + this.hind;
    }
}