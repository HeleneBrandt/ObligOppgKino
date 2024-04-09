package kinoprogram.kinooblig;

public class Booking {
    private String film;
    private int antall;
    private String fornavn;
    private String etternavn;
    private String telefon;
    private String epost;

    public Booking (String film, int antall, String fornavn, String etternavn, String telefon, String epost){
        this.film = film;
        this.antall = antall;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.telefon = telefon;
        this.epost = epost;


    }
    // getters
    public String getFilm() {
        return film;
    }

    public int getAntall() {
        return antall;
    }

    public String getFornavn() {
        return fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getEpost() {
        return epost;
    }

    // Setters
    public void setFilm(String film) {
        this.film = film;
    }

    public void setAntall(int antall) {
        this.antall = antall;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public void setEpost(String epost) {
        this.epost = epost;
    }

}

