import java.util.Scanner;
class Triangle{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a:"); //10
        int a=inp.nextInt();
        System.out.print("Enter b:"); //9
        int b=inp.nextInt();
        System.out.print("Enter Perimeter:");  //36
        int perimeter=inp.nextInt();
        int c=perimeter-a-b;
        int s=(a+b+c)/2;
        double area=Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println(area);
    }
}
