package oopBasic.constructor.parameterizedConstructor.checkResult;

public class Students {
    String name;
    int score;

    Students(String name, int score){
        this.name = name;
        this.score = score;
    }

    void checkResult(){
        if(this.score >= 40){
            System.out.println(this.name + " passed!");
        } else {
            System.out.println(this.name + " failed!");
        }
    }
}
