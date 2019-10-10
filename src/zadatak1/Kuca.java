package zadatak1;

public class Kuca extends  Nekretnina {

    private double povrsinaOkucnice;
    StringBuilder ispis = new StringBuilder("");

    public static final String neispravnaPovrsinaOkucnice = "Neispravna povrsina okucnice!";

    public Kuca() {
    }

    public Kuca(String adresa, int zona, double kvadratura, Vlasnik vlasnik, double povrsinaOkucnice) throws  IllegalArgumentException {
        super(adresa,zona,kvadratura,vlasnik);
        this.povrsinaOkucnice = povrsinaOkucnice;

        if(povrsinaOkucnice<2.0||povrsinaOkucnice>5000){
            throw new IllegalArgumentException(neispravnaPovrsinaOkucnice);
        }
    }

    public double getPovrsinaOkucnice() {
        return povrsinaOkucnice;
    }

    public void setPovrsinaOkucnice(double povrsinaOkucnice) {
        this.povrsinaOkucnice = povrsinaOkucnice;
    }

    @Override
    public String toString() {
        return super.toString() + ispis.append("\n").append("Cena: ") + izracunajCenu( getZona())+vlasnik.toString();
    }

    @Override
    public double izracunajCenu(int zona) {
        {
            int cenaZone = super.vratiCenuZone(zona);
            return super.getKvadratura()*cenaZone + (povrsinaOkucnice * cenaZone * 0.15);

        }

    }
}

