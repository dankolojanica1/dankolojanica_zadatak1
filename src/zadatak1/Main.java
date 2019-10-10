package zadatak1;
// @author danko lojanica
/*ZADATAK1:
         Napraviti apstraktnu klasa Nekretnina koja od atributa ima adresu, zonu, kvadraturu i
        podatke o vlasniku/instancu klase Vlasnik. Vlasnik ima puno ime i prezime, JMBG i broj
        lične karte.
         Izvedene klase, Stan i Kuca imaju toString() metod gde se ispisuju sve informacije o
        nekretnini uključujući Vlasnika i cenu
         Cena se računa po principu kvadratura X zona (I zona 3000, II zona 2000, III zona 1000,
        IV zona 500 €)
         Kuća ima dodatno polje površinaOkućnice.
         U cenu kuće ulazi i cena okućnice koja se računa po principu (površinaOkućnice X zona X
        15%)
         Stan ima dva dodatna polja , površinaPodruma i površinaTerase.
         U cenu Stana ulazi i cena podruma i terase ((povrsinaPodruma+povrsinaTerase) X Zona X
        33%)
         Napraviti Main klasu i u njoj kreirati instance klase Nekretnina i napraviti objekte
        izvedenih klasa sa proizvoljnim argumentima. Ispisati String reprezentaciju objekata –
        toString()
        Napomena:
        - Projekat nazovite ime_prezime_java_zadaci
        - Projekat organizujte tako da svi paketi budu smesteni u src folder. Za svaki zadatak napravite
        novi paket (zadatak1, zadatak2 itd.)
        - Komentarisite kod gde god mislite da ima smisla
        - U zaglavlju glavne klase dodajte javadoc tag sa imenom autora
        - U zaglavlju glavne klase napisati tekst zadatka
        */


public class Main {
    public static void main(String[] args) {

        try {
            Vlasnik vlasnik1 = new Vlasnik("Pehri", "0411498525421", "004578451");
            Kuca kuca1 = new Kuca("Zmaj Jovina", 1, 157.00, vlasnik1, 20.00);
            System.out.println("" + kuca1.toString());
            System.out.println();
            System.out.println("Nekretnina 2");

        } catch (IllegalArgumentException iea) {
            System.out.println(iea.getMessage());

        }

        try {
            Vlasnik vlasnik2 = new Vlasnik("Mika Miki", "0710198220422", "007878557");
            Stan stan1 = new Stan("Lomina", 2, 57.00, vlasnik2, 8.00, 4.00);
            System.out.println("" + stan1.toString());
        } catch (IllegalArgumentException iea) {
            System.out.println(iea.getMessage());
        }
    }
}
