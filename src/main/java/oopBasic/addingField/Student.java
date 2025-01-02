package oopBasic.addingField;

public class Student {
    void checkResult(int score) {
        if(score >=35) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.checkResult(40);
        Student s2 = new Student();
        s2.checkResult(20);

    }
}
