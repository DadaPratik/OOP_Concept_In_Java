package oopBasic.creatingMultipleObject;

public class Student {

    String name;
    int score;

    public static void main(String[] args) {
        System.out.println("---------------------------");

        Student s1 = new Student();
        s1.name = "Sashank";
        s1.score = 40;

        System.out.println("name: " + s1.name);
        System.out.println("score: " + s1.score);
        System.out.println("---------------------------");

        Student s2 = new Student();
        s2.name = "Sandeep";
        s2.score = 30;

        System.out.println("name: " + s2.name);
        System.out.println("score: " + s2.score);
    }
}
