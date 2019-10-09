package zadatak1;

   abstract class Nekretnina {
    private String adresa;
    public int zona;
    private double kvadratura;
    Vlasnik vlasnik;
    public static final String poruka = "Uneti podaci nisu ispravni!";
    public static final String neispravnaAdresa = "Uneti adresa nije tacna!";
    public static final String neispravnaKvadratura = "Uneti adresa nije tacna!";


     StringBuilder ispis = new StringBuilder("");

       public Nekretnina() {
       }

       public Nekretnina(String adresa, int zona, double kvadratura, Vlasnik vlasnik) {
           if(!adresa.matches("[a-zA-Z-  -1-9]+") || adresa.length()<6 || adresa.length()>60){
               throw new IllegalArgumentException(Nekretnina.neispravnaAdresa);
           }

           if(kvadratura<50 || kvadratura>5000){
               throw new IllegalArgumentException(Nekretnina.neispravnaKvadratura);
           }
           this.adresa = adresa;
           this.zona = zona;
           this.kvadratura = kvadratura;
           this.vlasnik = vlasnik;
       }

       public String getAdresa() {
           return adresa;
       }

       public void setAdresa(String adresa) {
           this.adresa = adresa;
       }

       public int getZona() {
           return zona;
       }

       public void setZona(int zona) {
           this.zona = zona;
       }

       public double getKvadratura() {
           return kvadratura;
       }

       public void setKvadratura(double kvadratura) {
           this.kvadratura = kvadratura;
       }

       public Vlasnik getVlasnik() {
           return vlasnik;
       }

       public void setVlasnik(Vlasnik vlasnik) {
           this.vlasnik = vlasnik;
       }

       @Override
       public String toString() {

           return ispis.append("Adresa: ").append(getAdresa()).append("\n").append("Kvadratura: ").append(getKvadratura()).append("\n").append("Zona: ").append(getZona()).toString();
       }

       public abstract double izracunajCenu(int zona);
       public int vratiCenuZone(int zona){
           int cenaZone;
           switch (zona) {
               case 1:
                   cenaZone = 3000; break;
               case 2:
                   cenaZone = 2000; break;
               case 3:
                   cenaZone = 1000; break;
               case 4:
                   cenaZone = 500; break;
               default:
                   throw new IllegalStateException(poruka);
           }
           return cenaZone;

       }
}
