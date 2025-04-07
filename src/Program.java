import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException {
        ArrayList<Pracownik> arrayList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while(true) {
            arrayList = wczytajZPliku();
            System.out.println("1 - dodaj pracownika");
            System.out.println("2 - wyswietl pracownikow");
            System.out.println("3 - koniec");
            int wybor = scan.nextInt();
            switch (wybor) {
                case 1:
                dodajPracownika(arrayList);
                break;
                case 2:
                wyswietlPracownikow(arrayList);
                break;
                case 3:
                    zapiszDoPliku(arrayList);
                    return;
            }
        }
    }

    public static void dodajPracownika(ArrayList<Pracownik> arrayList){

        Scanner scan = new Scanner(System.in);
        String imie, nazwisko, sciezkaDoZdjecia, stanowisko;
        int dzienUrodzenia, miesiacUrodzenia, rokUrodzenia, wynagrodzenie;
        System.out.println("Podaj imie");
        imie = scan.nextLine();
        System.out.println("Podaj nazwisko");
        nazwisko = scan.nextLine();
        System.out.println("podaj sciezkeDoZdjecia");
        sciezkaDoZdjecia = scan.nextLine();
        System.out.println("podaj stanowisko");
        stanowisko = scan.nextLine();
        System.out.println("podaj dzien urodzenia");
        dzienUrodzenia = scan.nextInt();
        System.out.println("podaj miesiac urodzenia");
        miesiacUrodzenia = scan.nextInt();
        System.out.println("podaj rok urodzenia");
        rokUrodzenia = scan.nextInt();
        System.out.println("podaj wynagrodzenie");
        wynagrodzenie = scan.nextInt();

        Pracownik p1 = new Pracownik (imie, nazwisko, sciezkaDoZdjecia, dzienUrodzenia, miesiacUrodzenia, rokUrodzenia, stanowisko, wynagrodzenie);
        arrayList.add(p1);

    }
    public static void wyswietlPracownikow(ArrayList<Pracownik> arrayList) {
        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }

    public static void zapiszDoPliku(ArrayList<Pracownik> arrayList) throws IOException {

        FileWriter fileWriter = new FileWriter("C:\\Users\\9602478u\\Desktop\\Pracownik.txt");
        for (int i = 0; i < arrayList.size(); i++) {
            fileWriter.write(String.valueOf(arrayList.get(i)));
            fileWriter.write("\n");
        }
        fileWriter.close();
    }
    public static ArrayList<Pracownik> wczytajZPliku() throws FileNotFoundException {
        ArrayList<Pracownik> arrayList = new ArrayList<Pracownik>();
        File file = new File("C:\\Users\\9602478u\\Desktop\\Pracownik.txt");
        Scanner read = new Scanner(file);
        String info;
        while (read.hasNextLine()){
            Pracownik p = new Pracownik();
            info = read.nextLine();
            String[] danePracownika = info.split(",");
            String[] imieINazwisko = danePracownika[0].split(" ");
            String[] dataUrodzenia = danePracownika[1].split("/");
            p.setImie(imieINazwisko[0]);
            p.setNazwisko(imieINazwisko[1]);
            p.setDzienUrodzenia(Integer.parseInt(dataUrodzenia[0]));
            p.setMiesiacUrodzenia(Integer.parseInt(dataUrodzenia[1]));
            p.setRokUrodzenia(Integer.parseInt(dataUrodzenia[2]));
            p.setStanowisko(danePracownika[2]);
            p.setWynagrodzenie(Integer.parseInt(danePracownika[3]));
            p.setSciezkaDoZdjecia(danePracownika[4]);
            arrayList.add(p);
        }
        read.close();

        return arrayList;
    }
}