package Hogwarts;

public class Main {
    public static void main(String[] args) {
    HogwartsStudent hogwartsStudent = new HogwartsStudent("Anders", "And", "hus");
    HogwartsStudent hogwartsStudent1 = new HogwartsStudent("Anders", "AAd", "hus");
    hogwartsStudent.setLastName("Ravenclaw");
        System.out.println(hogwartsStudent);
        System.out.println(hogwartsStudent.compareTo(hogwartsStudent1));
    }
}
