package oopBasic.constructor.parameterizedConstructor;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Sandeep Shrestha",45);
        Student s2 = new Student("Ram Thapa",78);

        System.out.println("---First Student---");
        System.out.println("Name: " + s1.name);
        System.out.println("Score: " +s1.score);
        System.out.println("---Second Student---");
        System.out.println("Name: " + s2.name);
        System.out.println("Score: " +s2.score);
    }
}
