import java.util.Scanner;
class LengthOfTriangle{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter area:"); //184
        int area=inp.nextInt();
        System.out.print("Enter Length 1 :"); //16
        int leg1=inp.nextInt();
        int leg2;
        leg2=(2*area)/leg1;
        System.out.println("Length of another Leg of right angle triangle: "+leg2);
    }
}
