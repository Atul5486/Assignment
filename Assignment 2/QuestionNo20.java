import java.util.Scanner;
class Icecream{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
       System.out.print("Enter length:"); //25
       int length=inp.nextInt();
       System.out.print("Enter Breadth:"); //10
        int breadth=inp.nextInt();
        System.out.print("Enter Heigth:"); //8
        int height=inp.nextInt();
        int volume=length*breadth*height;
        System.out.println("Volume Of Brick of ice-cream :"+volume);
    }
}
