public class Osoba {
    private String imie, nazwisko, sciezkaDoZdjecia;
    private int dzienUrodzenia, miesiacUrodzenia, rokUrodzenia;

    public Osoba(String imie, String nazwisko, String sciezkaDoZdjecia, int dzienUrodzenia, int miesiacUrodzenia, int rokUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.sciezkaDoZdjecia = sciezkaDoZdjecia;
        this.dzienUrodzenia = dzienUrodzenia;
        this.miesiacUrodzenia = miesiacUrodzenia;
        this.rokUrodzenia = rokUrodzenia;
    }

    public Osoba(String imie, int miesiacUrodzenia, int rokUrodzenia, int dzienUrodzenia, String nazwisko) {
        this.imie = imie;
        this.miesiacUrodzenia = miesiacUrodzenia;
        this.rokUrodzenia = rokUrodzenia;
        this.dzienUrodzenia = dzienUrodzenia;
        this.nazwisko = nazwisko;
        this.sciezkaDoZdjecia = "default.jpg";
    }

    public Osoba(){
        imie = null;
        nazwisko = null;
        miesiacUrodzenia = 0;
        rokUrodzenia = 0;
        dzienUrodzenia = 0;
        sciezkaDoZdjecia = null;
    }
    public String getImie() {
        return imie;
    }

    public int getRokUrodzenia() {
        return rokUrodzenia;
    }

    public int getMiesiacUrodzenia() {
        return miesiacUrodzenia;
    }

    public int getDzienUrodzenia() {
        return dzienUrodzenia;
    }

    public String getSciezkaDoZdjecia() {
        return sciezkaDoZdjecia;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setSciezkaDoZdjecia(String sciezkaDoZdjecia) {
        this.sciezkaDoZdjecia = sciezkaDoZdjecia;
    }

    public void setDzienUrodzenia(int dzienUrodzenia) {
        this.dzienUrodzenia = dzienUrodzenia;
    }

    public void setMiesiacUrodzenia(int miesiacUrodzenia) {
        this.miesiacUrodzenia = miesiacUrodzenia;
    }

    public void setRokUrodzenia(int rokUrodzenia) {
        this.rokUrodzenia = rokUrodzenia;
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko + ", " + dzienUrodzenia + "/" + miesiacUrodzenia + "/" + rokUrodzenia;
    }
}