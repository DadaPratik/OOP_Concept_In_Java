package oopBasic.creatingMultipleClass;

public class Student {
    String name;
    int score;

    public static void checkResult(String name, int score) {
        if(score >= 40){
            System.out.println(name + " passed!");
        } else{
            System.out.println(name + " failed!");
        }
    }
}
