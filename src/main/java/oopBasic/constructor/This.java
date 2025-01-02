package oopBasic.constructor;

public class This {
    String name;

    void display(){
        System.out.println("Name using this: " + this.name);
    }

    public static void main(String[] args) {
        This t1 = new This();
        t1.name = "Sandeep";
        t1.display();
        This t2 = new This();
        t2.name = "Ramsey";
        t2.display();

        System.out.println("Name using object: " +t1.name);
    }

}
