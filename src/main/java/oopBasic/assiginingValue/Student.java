package oopBasic.assiginingValue;

public class Student {
    String name;
    int score;

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Sandeep";
        s1.score = 40;

        System.out.println("Name: " + s1.name);
        System.out.println("Score: " +s1.score);
    }


}
