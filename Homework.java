public class Homework {
    public static void main(String[] args) {
        int a=17;
        int b=19;

        String eligibility1;
        eligibility1 =(a>=18)? "you are eligible to vote":"you are not eligible to vote";
        String eligibility2;
        eligibility2=(b>=18)? "you are eligible to vote":"you are not eligible to vote";
        System.out.println(eligibility1);
        System.out.println(eligibility2);

    }

}

class Home{
    public static void main(String[] args) {

        int p=25;
        int t=55;
        int r=56;

        int SI= (p*t*r)/100;
        System.out.println("The Si is "+ SI);

        // Area of Triangle
        int base=15;
        int height=54;
        float Area=(base*height)/2;
        System.out.println("The Area of Triangle is\t"+Area);

        // Volume of Cube and Cuboid
        int length=7;
        int breadth=9;
        int height1=19;
        float VolCube=length*length*length;
        float VolCuboid=length*breadth*height1;
        System.out.println("The Volume of Cube is\t"+VolCube);
        System.out.println("The Volume of Cuboid is\t"+VolCuboid);

    }
}

class Work{
    public static void main(String[] args) {
        int math=57;
        int sci=46;
        int eng=77;
        int soc=65;
        float TotalMarks=sci+eng+soc+math;
        System.out.println("The total marks obtained is "+TotalMarks);
        float Percentage=TotalMarks/4;
        System.out.println("The total percentage of is "+Percentage);
        String Grade;
        Grade=(Percentage>=70)?"First Class":
                ((Percentage>=59&&Percentage<70)?"Upper Second Class":
                        ((Percentage>=49&&Percentage<59)?"Second Class":
                                ((Percentage>=39&&Percentage<49)?"Third Class":
                                        "Failed")));
        System.out.println("Your Grade is: "+Grade);


    }
}