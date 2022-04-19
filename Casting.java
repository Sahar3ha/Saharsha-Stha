import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length");
        double length = scanner.nextDouble();
        System.out.println("Enter breadth");
        double breath = scanner.nextDouble();
        double area = length * breath;
        int casted_area= (int) area;
        System.out.println(casted_area);

    }
}

class Si{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter principal; ");
        int principal = scanner.nextInt();
        System.out.println("Enter time; ");
        int time = scanner.nextInt();
        System.out.println("Enter rate; ");
        int rate = scanner.nextInt();
        int Si = (principal*time*rate)/100;
        double casted_Si= (double) Si;
        System.out.println("The simple interest is "+casted_Si);

    }
}
