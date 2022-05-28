package Uczelnia;

public class Student extends Osoba {
    private String index;

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public void print() {
        setText("Imie: " + this.name + "\n"
                + "Nazwisko: " + this.surname + "\n"
                + "Rok urodzenia: " + this.yearOfBirth + "\n"
                + "Plec: " + this.gender + "\n"
                +"Numer indeksu: " + this.index);
    }
}
