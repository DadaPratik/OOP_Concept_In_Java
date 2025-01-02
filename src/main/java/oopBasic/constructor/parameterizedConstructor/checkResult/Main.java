package oopBasic.constructor.parameterizedConstructor.checkResult;

import oopBasic.constructor.parameterizedConstructor.Student;

public class Main {
    public static void main(String[] args) {
        Students s1 = new Students("Sandeep Shrestha",45);
        Students s2 = new Students("Ram Thapa",78);
        s1.checkResult();
        s2.checkResult();
    }
}
