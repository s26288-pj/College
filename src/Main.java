import Uczelnia.*;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Kacper");
        student.setSurname("Tokarzewski");
        student.setYearOfBirth(1999);
        student.setGender('M');
        student.setIndex("s26288");
        student.print();

        Stypendysta stypendysta = new Stypendysta();
        stypendysta.setName("Kamil");
        stypendysta.setSurname("Test");
        stypendysta.setYearOfBirth(1995);
        stypendysta.setGender('M');
        stypendysta.setSum(800);
        stypendysta.print();

        System.out.println(stypendysta.text);
        System.out.println(student.text);
    }
}
