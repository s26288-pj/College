package Uczelnia;

public class Osoba {
    protected String name;
    protected String surname;
    protected int yearOfBirth;
    protected char gender;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void print() {
        System.out.println(
                "Imie: " + this.name + "\n"
                        + "Nazwisko: " + this.surname + "\n"
                        + "Rok urodzenia: " + this.yearOfBirth + "\n"
                        + "Plec: " + this.gender);
    }
}
