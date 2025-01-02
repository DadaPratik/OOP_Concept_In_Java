package oopBasic.constructor;

public class Students {

    String name;
    int score;

    public  void checkResult(){
        if(this.score >=35){
            System.out.println(this.name + " passed!");
        } else {
            System.out.println(this.name + " failed!");
        }
    }

    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "Sandeep";
        s1.score = 40;
        s1.checkResult();

        Students s2 = new Students();
        s2.name = "Sashank";
        s2.score = 30;
        s2.checkResult();
    }
}

