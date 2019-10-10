package zadatak1;

public class Vlasnik {
    private String imeIPrezime;
    private String maticniBroj;
    private String brojLicneKarte;
    StringBuilder ispis = new StringBuilder("");

    public static final String neispravnoImeIPrezime = "Uneto ime i prezime nije ispravno!";
    public static final String neispravanBrojLicneKarte = "Neispravan broj licne karte!";
    public static final String neispravanMaticniBroj = "Uneto ime i prezime nije ispravno!";


    public Vlasnik() {
    }

    public Vlasnik(String imeIPrezime, String maticniBroj, String brojLicneKarte) throws IllegalArgumentException   {
            this.maticniBroj = maticniBroj;
            this.brojLicneKarte = brojLicneKarte;
            this.imeIPrezime = imeIPrezime;
//        if (!(maticniBroj.matches("[0-9]+") && maticniBroj.length() == 13)) {
//         throw new IllegalArgumentException(neispravanMaticniBroj);
//        }
        if(!imeIPrezime.matches((".*\\W.*")) || imeIPrezime.length()<4 || imeIPrezime.matches(".*\\W.*")){
            throw new IllegalArgumentException(neispravnoImeIPrezime);
        }
        if (brojLicneKarte.length() != 9 ) {
            throw new IllegalArgumentException(neispravanBrojLicneKarte);

    }
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        if (!(maticniBroj.matches("[0-9]+") && maticniBroj.length() == 13)) {
            throw new IllegalArgumentException(neispravanMaticniBroj);
        }
            this.imeIPrezime = imeIPrezime;
    }

    public String getMaticniBroj() {
        return maticniBroj;
    }

    public void setMaticniBroj(String maticniBroj) {

            this.maticniBroj = maticniBroj;
    }

    public String getBrojLicneKarte() {
        return brojLicneKarte;
    }

    public void setBrojLicneKarte(String brojLicneKarte) {
            this.brojLicneKarte = brojLicneKarte;
    }

    @Override
    public String toString() {
        return ispis.append("\n").append("Ime i prezime vlasnika : ").append(getImeIPrezime()).append("\n").append("Maticni broj: ").append( getMaticniBroj()).append("\n").append("Broj licne karte: ").append( brojLicneKarte).toString();
    }
}
