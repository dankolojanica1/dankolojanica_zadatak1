package zadatak1;

public class Stan extends  Nekretnina {

    private double povrsinaPodruma;
    private double povrsinaTerase;
    StringBuilder ispis = new StringBuilder("");

    public static final String neispravnaPovrsinaTersa = "Neispravna povrsina terase!";
    public static final String neispravnaPovrsinaPodruma = "Neispravna povrsina podruma!";



    public Stan() {
    }

    public Stan(String adresa, int zona, double kvadratura, Vlasnik vlasnik, double povrsinaPodruma, double povrsinaTerase) {
        super(adresa,zona,kvadratura,vlasnik);
        this.povrsinaPodruma = povrsinaPodruma;
        this.povrsinaTerase = povrsinaTerase;

        if(!adresa.matches("[a-zA-Z- -0-9-š]+") || adresa.length()<6 || adresa.length()>60){
            throw new IllegalArgumentException(Nekretnina.neispravnaAdresa);
        }
        if(kvadratura<15||kvadratura>500){
            throw new IllegalArgumentException(Nekretnina.neispravnaKvadratura);
        }
        if(povrsinaTerase<0||povrsinaTerase>50){
            throw new IllegalArgumentException(neispravnaPovrsinaTersa);
        }
        if(povrsinaPodruma<0||povrsinaPodruma>50){
            throw new IllegalArgumentException(neispravnaPovrsinaPodruma);
        }
    }

    public double getPovrsinaPodruma() {
        return povrsinaPodruma;
    }

    public void setPovrsinaPodruma(double povrsinaPodruma) {
        this.povrsinaPodruma = povrsinaPodruma;
    }

    public double getPovrsinaTerase() {
        return povrsinaTerase;
    }

    public void setPovrsinaTerase(double povrsinaTerase) {
        this.povrsinaTerase = povrsinaTerase;
    }

    @Override
    public String toString() {
        return super.toString() + ispis.append("\n").append("Cena: ").append("\n").append(izracunajCenu( getZona())).append(vlasnik).toString();
    }

    @Override
    public double izracunajCenu(int zona) {
        {
            int cenaZone = super.vratiCenuZone(zona);
            return (super.getKvadratura() * cenaZone  +  ((povrsinaPodruma + povrsinaTerase) * cenaZone * 0.33));

        }
    }
}
