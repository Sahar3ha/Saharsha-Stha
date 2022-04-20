import javax.swing.*;
import java.util.Scanner;

public class Thirty_qns {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your address: ");
        String address = scanner.nextLine();
        System.out.println("Enter your address: ");
        int contact = scanner.nextInt();
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Contact: "+contact);

    }
}

class Four{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter num2: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter num3: ");
        int num3 = scanner.nextInt();
        System.out.println("Enter num4: ");
        int num4 = scanner.nextInt();
        int add = num1+num2+num3+num4;

        System.out.println("The sum is: "+add);

    }
}

class Percent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter maths: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter sci: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter soc: ");
        int num3 = scanner.nextInt();
        System.out.println("Enter eng: ");
        int num4 = scanner.nextInt();

        float TotalMarks = num1 + num2 + num3 + num4;

        System.out.println("The total marks obtained is " + TotalMarks);
        float Percentage = TotalMarks / 4;
        System.out.println("The total percentage of is " + Percentage);
        String Grade;
        Grade = (Percentage >= 70) ? "First Class" :
                ((Percentage >= 59 && Percentage < 70) ? "Upper Second Class" :
                        ((Percentage >= 49 && Percentage < 59) ? "Second Class" :
                                ((Percentage >= 39 && Percentage < 49) ? "Third Class" :
                                        "Failed")));
        System.out.println("Your Grade is: " + Grade);

    }
}
class Sum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1= scanner.nextInt();
        System.out.println("Enter num2: ");
        int num2= scanner.nextInt();
        int sum = num1+num2;
        int product= num1*num2;
        System.out.println("The sum is: "+sum);
        System.out.println("The product is: "+product);

    }
}

class Division{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1= scanner.nextInt();
        System.out.println("Enter num2: ");
        int num2= scanner.nextInt();
        int sum = num1+num2;
        int product= num1*num2;
        float division = sum/product;
        System.out.println("The sum is: "+sum);
        System.out.println("The product is: "+product);
        System.out.println("The division is: "+division);
    }
}

class Cast{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length: ");
        double num1= scanner.nextDouble();
        System.out.println("Enter breadth: ");
        double num2= scanner.nextDouble();
        double area = num1*num2;
        int a= (int) area;
        System.out.println("The area is: "+a);

    }
}

class Userinput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your roll no: ");
        String roll_no = scanner.nextLine();
        System.out.println("Enter your field of interest: ");
        String interest = scanner.nextLine();
        System.out.print("Hey, my name is " + name);
        System.out.print("and my roll number is " + roll_no);
        System.out.print(".My field of interest are " + interest);

    }
}

class Square{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a side of square: ");
        int a = scanner.nextInt();
        int area = a^2;
        int perimeter =4*a;
        System.out.println("The area of square is: ");

        System.out.println("The perimeter of square is: ");
    }
    
}

class Sis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter principal: ");
        int p = scanner.nextInt();
        System.out.println("Enter time: ");
        int t = scanner.nextInt();
        System.out.println("Enter rate: ");
        int r = scanner.nextInt();
        int si = (p*t*r)/100;

        System.out.println("The si is " + si);

    }
}

class Triangle{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter base; ");
        int base= scanner.nextInt();
        System.out.println("Enter height: ");
        int height= scanner.nextInt();
        float area = (base*height)/2;
        System.out.println("The area of triangle is:"+area);
    }

}

class Cube{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length: ");
        int length=scanner.nextInt();
        float VolCube=length*length*length;
        System.out.println("The Volume of Cube is\t"+VolCube);

    }
}

class Cuboid{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length: ");
        int length=scanner.nextInt();
        System.out.println("Enter breadth: ");
        int breadth= scanner.nextInt();
        System.out.println("Enter height: ");
        int height= scanner.nextInt();
        float VolCuboid=length*breadth*height;
        System.out.println("The Volume of Cuboid is\t"+VolCuboid);

    }
}

class Sq{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = scanner.nextInt();
        int sq= a*a;
        System.out.println("The square of the number is "+sq);
    }
}

class St{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter: ");
        String a = scanner.next();
        System.out.println("enter: ");
        String b= scanner.next();
        System.out.println(a+b);
    }
}

class eq{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter1: ");
        int a = scanner.nextInt();
        System.out.println("enter2: ");
        int b = scanner.nextInt();
        System.out.println("enter3: ");
        int c = scanner.nextInt();
        /*String equal;
        equal = (a==b)?"Equal":
                ((b==c)&&(a==c)?"All are equals");*/
        /*System.out.println(equal);*/
    }
}

class Var{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();
        String c;
       /* c = (a>50)&&(b<50)?"b";
        System.out.println(c);*/

    }
}

class Robert{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Maths: ");
        int math = scanner.nextInt();
        System.out.println("social: ");
        int soc = scanner.nextInt();
        System.out.println("science: ");
        int sci = scanner.nextInt();
        float TotalMarks=sci+soc+math;
        System.out.println("The total marks obtained is "+TotalMarks);
        float Percentage=TotalMarks/4;
        System.out.println("The total percentage of is "+Percentage);

    }
}

class Std{
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter name: ");
        String address = JOptionPane.showInputDialog("Enter address: ");
        int contact = Integer.parseInt(JOptionPane.showInputDialog("Enter contact: "));
        JOptionPane.showMessageDialog(null,name);
        JOptionPane.showMessageDialog(null,address);
        JOptionPane.showMessageDialog(null,contact);
        System.exit(0);

    }
}

class Sm{
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter1: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter2: "));

        int c = Integer.parseInt(JOptionPane.showInputDialog("Enter3: "));

        int d = Integer.parseInt(JOptionPane.showInputDialog("Enter4: "));

        JOptionPane.showMessageDialog(null,(a+b+c+d));
        System.exit(0);
    }
}

class Per{
    public static void main(String[] args) {
        int maths = Integer.parseInt(JOptionPane.showInputDialog("Enter maths: "));
        int sci = Integer.parseInt(JOptionPane.showInputDialog("Enter sci: "));
        int soc = Integer.parseInt(JOptionPane.showInputDialog("Enter soc: "));
        int eng = Integer.parseInt(JOptionPane.showInputDialog("Enter eng: "));
        int total = maths+sci+soc+eng;
        float Percentage= total/4;
        String Grade;
        Grade=(Percentage>=70)?"First Class":
                ((Percentage>=59&&Percentage<70)?"Upper Second Class":
                        ((Percentage>=49&&Percentage<59)?"Second Class":
                                ((Percentage>=39&&Percentage<49)?"Third Class":
                                        "Failed")));

        JOptionPane.showMessageDialog(null,total);
        JOptionPane.showMessageDialog(null,Percentage);
        JOptionPane.showMessageDialog(null,Grade);
        System.exit(0);


    }
}

class In{
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter1: "));

        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter2: "));
        int c = a+b;
        int d = a*b;
        JOptionPane.showMessageDialog(null,c);
        JOptionPane.showMessageDialog(null,d);
        System.exit(0);
    }
}

class Int{
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter1: "));

        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter2: "));
        int c = a+b;
        int d = a*b;
        int e = c/d;
        JOptionPane.showMessageDialog(null,c+"\n"+d+"\n"+e);

        System.exit(0);
    }
}
class Rect{
    public static void main(String[] args) {
        double len= Double.parseDouble(JOptionPane.showInputDialog("Enter length: "));
        double bre= Double.parseDouble(JOptionPane.showInputDialog("Enter breadth: "));
        double area = len*bre;
        int a= (int) area;
        JOptionPane.showMessageDialog(null,"The are of rectangle "+a);

        System.exit(0);
    }

}

class Info{
    public static void main(String[] args) {
        String name= JOptionPane.showInputDialog("Enter name: ");
        String roll_no= JOptionPane.showInputDialog("Enter roll no: ");
        String interest= JOptionPane.showInputDialog("Enter address: ");
        JOptionPane.showMessageDialog(null,"My name is "+name+"and my roll number is "+roll_no+".My field of interest are "+interest);

        System.exit(0);
    }
}

class Squares{
    public static void main(String[] args) {
        int sq= Integer.parseInt(JOptionPane.showInputDialog("enter sq: "));
        int s= sq^2;
        JOptionPane.showMessageDialog(null,s);

        System.exit(0);
    }
}

class T{
    public static void main(String[] args) {
        int a= Integer.parseInt(JOptionPane.showInputDialog("Enter1 : "));
        int b= Integer.parseInt(JOptionPane.showInputDialog("Enter2: "));

        float ar= (a*b)/2;
        JOptionPane.showMessageDialog(null,ar);
        System.exit(0);
    }
}

class C{
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter: "));
        int b = a^3;
        JOptionPane.showMessageDialog(null,b);
        System.exit(0);
    }
}

class Cu{
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter len: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter bre: "));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Enter hei: "));
        float vol = a*b*c;
        JOptionPane.showMessageDialog(null,vol);
        System.exit(0);
    }
}

class S{
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter principal: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter time: "));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Enter rate: "));
        float si = (a*b*c)/100;
        JOptionPane.showMessageDialog(null,si);
        System.exit(0);
    }
}

class H{
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter 1: "));
        int b = a^2;
        JOptionPane.showMessageDialog(null,b);

        System.exit(0);
    }
}

class N{
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter a: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter b: "));
        JOptionPane.showMessageDialog(null,a+b);

        System.exit(0);
    }
}

class E{
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter 1: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter 2: "));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Enter 3: "));
        String d;
        d = (a==b&&a==c&&b==c)?"All are equal":
                ((a==b||a==c||b==c)?"Only two are equal":"No number are equal.");
        System.exit(0);


    }
}

class F{
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter a: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter b: "));
        Boolean result = (Boolean) (a<50&&a<b);
        JOptionPane.showMessageDialog(result);
        System.exit(0);
    }
}

class G{
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter math: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter eng: "));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Enter sci: "));
        int total = a+b+c;
        int per = total/3;
        JOptionPane.showMessageDialog(null,"The total is "+total+"\nThe per is "+per);

    }
}