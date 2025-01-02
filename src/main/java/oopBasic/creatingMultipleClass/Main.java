package oopBasic.creatingMultipleClass;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Sandeep";
        s1.score = 40;
        s1.checkResult(s1.name,s1.score);
        System.out.println("---------------------------");


        Student s2 = new Student();
        s2.name = "Sashank";
        s2.score = 30;
        s2.checkResult(s2.name,s2.score);
        System.out.println("---------------------------");

    }
}
