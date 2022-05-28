package Uczelnia;

public class Stypendysta extends Student{
    private int sum;

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void print() {
        System.out.println(
                "Imie: " + this.name + "\n"
                + "Nazwisko: " + this.surname + "\n"
                + "Rok urodzenia: " + this.yearOfBirth + "\n"
                + "Plec: " + this.gender + "\n"
                + "Stypendium: " + this.sum);
    }
}
