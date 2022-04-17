import java.util.Scanner;

public class User {
    public static void main(String[] args) {
       /* String a="v1";
        String b="v2";
        System.out.print(a);
        System.out.print(b);
    */
      /*  int [] c = new int[]{1,2,3,4,5}; // array
*/
       /* Scanner scanner= new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int a = scanner.nextInt();
        System.out.println("Enter another number: ");
        int b = scanner.nextInt();

        System.out.println(a+b);*/

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String a = scanner.nextLine();
        System.out.println("Enter you age; ");
        int b = scanner.nextInt();
        *//*scanner.nextLine();
*//*
        System.out.println("My name is "+a +"\nMy age is "+b );*/

        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Input principal: ");
        double a = scanner.nextDouble();
        System.out.println("Input time: ");
        double b = scanner.nextDouble();
        System.out.println("Input rate: ");
        double c = scanner.nextDouble();

        System.out.println("Si ="+(a+b+c)/100);*/

        System.out.println("Input principal: ");
        String a = scanner.nextLine();
        System.out.println("Input time: ");
        String b = scanner.nextLine();
        System.out.println("Input rate: ");
        String c = scanner.nextLine();
        int val=Integer.parseInt(a);
        int val1=Integer.parseInt(b);
        int val2=Integer.parseInt(c);
        System.out.println((val+val1+val2)/100);



    }


}
