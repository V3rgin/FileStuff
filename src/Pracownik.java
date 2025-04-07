public class Pracownik extends Osoba{

    private String stanowisko;
    private int wynagrodzenie;
    public Pracownik(String imie, String nazwisko, String sciezkaDoZdjecia, int dzienUrodzenia, int miesiacUrodzenia, int rokUrodzenia,
                     String stanowisko, int wynagrodzenie) {
        super(imie, nazwisko, sciezkaDoZdjecia, dzienUrodzenia, miesiacUrodzenia, rokUrodzenia);
        this.stanowisko = stanowisko;
        this.wynagrodzenie = wynagrodzenie;
    }

    public Pracownik(String imie, int miesiacUrodzenia, int rokUrodzenia, int dzienUrodzenia, String nazwisko, String stanowisko, int wynagrodzenie) {
        super(imie, miesiacUrodzenia, rokUrodzenia, dzienUrodzenia, nazwisko);
        this.stanowisko = stanowisko;
        this.wynagrodzenie = wynagrodzenie;
    }

    public Pracownik(){

    }

    public String getStanowisko() {
        return stanowisko;
    }

    public int getWynagrodzenie() {
        return wynagrodzenie;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public void setWynagrodzenie(int wynagrodzenie) {
        this.wynagrodzenie = wynagrodzenie;
    }

    @Override
    public String toString() {
        return getImie() + " " + getNazwisko() + "," + getDzienUrodzenia() + "/" + getMiesiacUrodzenia() + "/" + getRokUrodzenia() + ","
                + stanowisko + "," + wynagrodzenie + "," + getSciezkaDoZdjecia();
    }

}