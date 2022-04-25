import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a week number: ");
        int week = scanner.nextInt();
        switch (week){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}

class If{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a week number: ");
        int a = scanner.nextInt();
        if (a==1)
            System.out.println("Sunday");;
        if (a==2)
            System.out.println("Monday");;
        if (a==3)
            System.out.println("Tuesday");;
        if (a==4)
            System.out.println("Wednesday");;
        if (a==5)
            System.out.println("Thursday");;
        if (a==6)
            System.out.println("Friday");;
        if (a==7)
            System.out.println("Saturday");;
        /*else
            System.out.println("Invalid");*/



    }
}
