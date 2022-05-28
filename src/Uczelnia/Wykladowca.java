package Uczelnia;

public class Wykladowca extends Osoba {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println(
                "Imie: " + this.name + "\n"
                        + "Nazwisko: " + this.surname + "\n"
                        + "Rok urodzenia: " + this.yearOfBirth + "\n"
                        + "Plec: " + this.gender + "\n"
                        + "Tytul: " + this.title);
    }
}
