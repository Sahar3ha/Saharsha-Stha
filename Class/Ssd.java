package Class;

public class Ssd {
    static int maj=2; //static or class variable
    int b=12; //instance variable


    public static void main(String[] args) {
        Ssd sss = new Ssd();
        System.out.println(maj);
        System.out.println(sss.b);
        sss.printName();

    }
    void printName(){
        String name="asas";
        System.out.println(name);



    }

}
